<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login as Provider | PlanEve</title>
</head>
<body>
	<form action="providerLogin" method="post" >
		<label>Username: </label><input name="username"></input>
		<label>Password: </label><input name="password"></input>
		<button type="submit">Login</button>
		<label>Don't have an account? Click <a href="/PlanEve/providerSignUp.jsp">here </a> to Sign Up as a Service Provider</label> 	
	</form>
</body>
</html>