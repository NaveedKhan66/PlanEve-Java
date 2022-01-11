<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PlanEve</title>
<link rel="stylesheet" href="css/global-styles.css">
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
</head>

<body style=" margin: 0px; display: flex; align-items: center; flex-direction: column; background-image:url('css/indexPage.jpg') ">
	<p class="name-tag">Welcome to PlanEve!</p>
	<form action ="login" method="get" class="index-page">
		<div style="margin: 1rem">
			<input type="radio" id="loginType" name="loginType" value="user" checked>
			<label for="user" style="font-size: 20px; padding: 1rem;" class="label label-primary">Login as User</label><br>
		</div>
		<div style="margin: 1rem">
			<input type="radio" id="loginType" name="loginType" value="serviceProvider">
			<label for="Service Provider" style="font-size: 20px; padding: 1rem" class="label label-primary">Login as Service Provider</label><br>
		</div>
		<button type="submit" style="margin: 1rem" class="btn btn-danger btn-lg ">Go to Login Page</button>
	</form>
</body>
</html>
