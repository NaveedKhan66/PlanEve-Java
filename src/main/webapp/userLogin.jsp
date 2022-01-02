<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login as User | PlanEve</title>
</head>
<body>
	<form action="userLogin" method="post" >
		<label>Username: </label><input name="username"></input>
		<label>Password: </label><input name="password"></input>
		<button type="submit">Login</button>
		<label>Don't have an account? Click <a href="/PlanEve/userSignUp.jsp">here </a> to Sign Up</label> 	
	</form>
</body>
</html>