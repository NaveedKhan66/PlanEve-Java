<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up as Service Provider</title>
</head>
<body>
	<form action="providerSignUp" method="post" >
		<label>Name: </label><input id="name" name="name"></input>
		<label>Phone No: </label><input id="phoneNo" name="phoneNo"></input>
		<label>Email: </label><input name="email" id="email"></input>
		<label>Username: </label><input name="username" id="username"></input>
		<label>Password: </label><input name="password" id="password"></input>
		<button type="submit">Sign Up</button>
		<label>Already have an account? Click <a href="/PlanEve/userLogin.jsp">here </a> to Login as a Provider</label> 	
	</form>
</body>
</html>