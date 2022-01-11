<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.planeve.User"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Categories</title>
</head>
<body>
<%
	User user = User.class.cast(session.getAttribute("user"));
	
%>
	<label>Hello: </label>
	 <% out.println(user.name); %>
	 <h2>Select the category you want to add in business</h2>
	 <ul>
	 	<li><a href="/PlanEve/addServicesAccordingToCategory.jsp?category=venues">Venues</a></li>
	 	<li><a href="/PlanEve/addServicesAccordingToCategory.jsp?category=caterers">Caterers</a></li>
	 	<li><a href="/PlanEve/addServicesAccordingToCategory.jsp?category=djs">DJs</a></li>
	 	<li><a href="/PlanEve/addServicesAccordingToCategory.jsp?category=salons">Salons</a></li>
	 </ul>

</body>
</html> 