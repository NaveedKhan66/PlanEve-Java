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
	if(user==null){
		response.sendRedirect("/PlanEve/userLogin.jsp");
	}
	
%>
	<label>Hello: </label>
	 <% out.println(user.name); %>
	 <h2>Select the category you want to browse</h2>
	 <ul>
	 	<li><a href="/PlanEve/viewServicesAccordingToCategory.jsp?category=venues">Venues</a></li>
	 	<li><a href="/PlanEve/viewServicesAccordingToCategory.jsp?category=caterers">Caterers</a></li>
	 	<li><a href="/PlanEve/viewServicesAccordingToCategory.jsp?category=djs">DJs</a></li>
	 	<li><a href="/PlanEve/viewServicesAccordingToCategory.jsp?category=salons">Salons</a></li>
	 </ul>

</body>
</html> 