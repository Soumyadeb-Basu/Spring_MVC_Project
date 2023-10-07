<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>

<head>
<title>Visitor Page</title>
</head>

<%
String visitorName= (String) request.getAttribute("visitorName");
Integer id= (Integer) request.getAttribute("id");
%>

<body>
<h2>Hello! <%= visitorName %> </h2>
<h2> Your Id is <%= id %> </h2>
</body>

</html>
