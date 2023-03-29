<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화선택</title>
</head>
<body>
	<%
		String[] movieList = {"인셉션", "타짜", "아이언맨", "해리포터", "클레멘타인"};
		pageContext.setAttribute("movieList", movieList);
	%>
	
	<c:forEach var="movie"  items="${movieList}">
		${movie }<br>
	
	</c:forEach>
	
	
	
	
</body>
</html>