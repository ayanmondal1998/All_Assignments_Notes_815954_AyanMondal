<%@page import="com.dev.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	<%
	
		Alien a1 = (Alien)request.getAttribute("alien");
		out.println("Id = " + a1.getAid());
		out.println("</br>");
		out.println("Name = " + a1.getAname());
		out.println("</br>");
		out.println("Technology = " + a1.getTech());
	%>

</body>
</html>