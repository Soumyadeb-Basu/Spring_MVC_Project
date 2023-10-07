<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>

<head>
<title>Testing SPEL</title>
</head>

<body>
<h2>Full form of SPEL is ${input} </h2>

<c:forEach var="item" items="${list}">
<h1>${item}</h1>
</c:forEach>
</body>

</html>
