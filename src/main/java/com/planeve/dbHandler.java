package com.planeve;

import java.sql.*;

public class dbHandler {
    private static Connection connection;
    private static String connectionUrl = "jdbc:sqlserver://localhost;databaseName=PlanEve_DB;integratedSecurity=false;user=SA;password=Nemcon123;";

    private static boolean createConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionUrl);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    private static boolean closeConnection() throws SQLException {
        try {
            connection.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    // private int getNewEmployeeID() {
    //     try {
    //         if (createConnection()) {
    //             PreparedStatement s = connection.prepareStatement(
    //                     "SELECT max(empID) FROM Employee",
    //                     ResultSet.TYPE_SCROLL_SENSITIVE,
    //                     ResultSet.CONCUR_UPDATABLE);
    //             ResultSet rs = s.executeQuery();
    //             if (rs.next()) {
    //                 return rs.getInt(1);
    //             }
    //             return -1;
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return -1;
    //     }
    //     return -1;
    // }

    // private String encrypt(String input) {
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < input.length(); i++) {
    //         char c = input.charAt(i);
    //         if (c >= 'a' && c <= 'm')
    //             c += 13;
    //         else if (c >= 'A' && c <= 'M')
    //             c += 13;
    //         else if (c >= 'n' && c <= 'z')
    //             c -= 13;
    //         else if (c >= 'N' && c <= 'Z')
    //             c -= 13;
    //         sb.append(c);
    //     }
    //     return sb.toString();
    // }

    public dbHandler() {
    }

    // public boolean createEmployee(Employee emp) {
    //     try {
    //         if (createConnection()) {
    //             PreparedStatement s = connection.prepareStatement(
    //                     "SELECT * FROM Employee",
    //                     ResultSet.TYPE_SCROLL_SENSITIVE,
    //                     ResultSet.CONCUR_UPDATABLE);

    //             ResultSet rs = s.executeQuery();
    //             rs.moveToInsertRow();

    //             rs.updateInt(1, this.getNewEmployeeID() + 1);
    //             rs.updateString(2, this.encrypt(emp.name));
    //             rs.updateString(3, this.encrypt(emp.address));
    //             rs.updateDate(4, emp.DOB);
    //             rs.updateFloat(5, emp.salary);
    //             rs.updateTime(6, emp.timeIn);

    //             rs.insertRow();
    //             rs.moveToCurrentRow();
    //             if (rs.rowInserted()) {
    //                 return true;
    //             }
    //             return false;
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return false;
    //     }
    //     return false;
    // }

    public static boolean createUser(User usr) {
        try {
            if (createConnection()) {
                PreparedStatement s = connection.prepareStatement(
                        "SELECT * FROM Users",
                        ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);

                ResultSet rs = s.executeQuery();
                rs.moveToInsertRow();

                rs.updateString(1, usr.name);
                rs.updateString(2, usr.email);
                rs.updateString(3, usr.password);
                rs.updateString(4, usr.username);
                rs.updateString(5, usr.phoneNo);
                rs.insertRow();
                rs.moveToCurrentRow();
                if (rs.rowInserted()) {
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public static User getUser(String username) {
        try {
            if (createConnection()) {
                PreparedStatement s = connection.prepareStatement(
                        "select * from Users where username=?",
                        ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                s.setString(4, username);
                ResultSet rs = s.executeQuery();
                User usr = new User();
                if (rs.next()) {
                    usr.name = rs.getString("name");
                    usr.email = rs.getString("email");
                    usr.password = rs.getString("password");
                    usr.username = rs.getString("username");
                    usr.phoneNo = rs.getString("phoneNo");
                    closeConnection();
                    return usr;
                }
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    public static User authenticate(String username, String password) {
        try {
            if (createConnection()) {
                PreparedStatement s = connection.prepareStatement(
                        "select * from Users where username=? and password=?",
                        ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                s.setString(1, username);
                s.setString(2, password);
                ResultSet rs = s.executeQuery();
                User usr = new User();
                if (rs.next()) {
                    usr.name = rs.getString("name");
                    usr.email = rs.getString("email");
                    usr.password = rs.getString("password");
                    usr.username = rs.getString("username");
                    usr.phoneNo = rs.getString("phoneNo");
                    closeConnection();
                    return usr;
                }
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

//Provider Side-----------------------------------------------------------------------------------
    
    
    // public User updateUser(User usr) {
    //     try {
    //         if (createConnection()) {
    //             PreparedStatement s = connection.prepareStatement(
    //                     "select * from Users where username=?",
    //                     ResultSet.TYPE_SCROLL_SENSITIVE,
    //                     ResultSet.CONCUR_UPDATABLE);
    //             s.setString(4, usr.username);

    //             ResultSet rs = s.executeQuery();

    //             if (rs.next()) {
    //                 rs.updateString("name", usr.name);
    //                 rs.updateString("email", usr.email);
    //                 rs.updateString("password", usr.password);
    //                 rs.updateString("username", usr.username);
    //                 rs.updateString("phoneNo", usr.phoneNo);

    //                 rs.updateRow();

    //                 closeConnection();
    //                 return usr;
    //             }
    //             return null;
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    //     return null;
    // }

    // public boolean deleteEmployee(int id) {
    //     try {
    //         if (createConnection()) {
    //             PreparedStatement s = connection.prepareStatement(
    //                     "select * from Employee where empID=?",
    //                     ResultSet.TYPE_SCROLL_SENSITIVE,
    //                     ResultSet.CONCUR_UPDATABLE);
    //             s.setInt(1, id);

    //             ResultSet rs = s.executeQuery();

    //             if (rs.next()) {
    //                 rs.deleteRow();

    //                 closeConnection();
    //                 return true;
    //             }
    //             return false;
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return false;
    //     }
    //     return false;
    // }

}
