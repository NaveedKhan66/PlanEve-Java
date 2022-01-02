<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PlanEve</title>
</head>
<body>
	<form action ="userLogin" method="get">	
		<input type="radio" id="loginType" name="loginType" value="user">
		<label for="user">Login as User</label><br>
		<input type="radio" id="loginType" name="loginType" value="serviceProvider">
		<label for="Service Provider">Login as Service Provider</label><br>
		<button type="submit">Go to Login Page</button>
	</form>
</body>
</html>