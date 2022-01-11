<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PlanEve</title>
<link rel="stylesheet" href="global-styles.css">
</head>
<body style="background-color: grey; margin: 0px; display: flex; align-items: center; flex-direction: column;">
	<p class="name-tag">Welcome to PlanEve!</p>
	<form action ="login" method="get" class="index-page">
		<div>
			<input type="radio" id="loginType" name="loginType" value="user" checked>
			<label for="user">Login as User</label><br>
		</div>
		<div>
			<input type="radio" id="loginType" name="loginType" value="serviceProvider">
			<label for="Service Provider">Login as Service Provider</label><br>
		</div>
		<button type="submit" style="width: 20%; margin-top: 40px;">Go to Login Page</button>
	</form>
</body>
</html>