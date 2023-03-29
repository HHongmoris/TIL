<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scope</title>
</head>
<body>
	<%
		pageContext.setAttribute("name", "page yang");
		request.setAttribute("name", "request yang");
		session.setAttribute("name", "session yang");
		application.setAttribute("name", "application yang");
	%>
	
	${name } <br>
	
	<%= pageContext.getAttribute("name") %> <br>
	page 속성 : ${pageScope.name }<br>
	request 속성 : ${requestScope.name} <br>
	session 속성 : ${sessionScope.name}<br>
	application 속성 : ${applicationScope.name}<br>
	
	
	
	
</body>
</html>