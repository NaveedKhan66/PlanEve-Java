<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up as user</title>
</head>
<body>
<form action="userSignUp" method="post" >
		<label>Name: </label><input name="name"></input>
		<label>Phone No: </label><input name="phoneNo"></input>
		<label>Email: </label><input name="email"></input>
		<label>Username: </label><input name="username"></input>
		<label>Password: </label><input name="password"></input>
		<button type="submit">Login</button>
		<label>Already have an account? Click <a href="/PlanEve/userLogin.jsp">here </a> to Login</label> 	
	</form>
</body>
</html>