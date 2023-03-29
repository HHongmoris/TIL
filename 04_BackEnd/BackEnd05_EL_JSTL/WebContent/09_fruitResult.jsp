<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과일선택</title>
</head>
<body>
	<c:if test="${param.fruit==1}">
		<div style="color: orange">귤</div>
	</c:if>
	<c:if test="${param.fruit==2}">
		<div style="color: yellow">망고</div>
	</c:if>
	<c:if test="${param.fruit==3}">
		<div style="color: red">딸기</div>
	</c:if>
	<c:if test="${param.fruit==4}">
		<div style="color: green">수박</div>
	</c:if>
	<c:if test="${param.fruit==5}">
		<div style="color: green">멜론</div>
	</c:if>
	<hr>
	<c:choose>
		<c:when test="${param.fruit==1}">
			<div style="color: orange">귤</div>
		</c:when>
		<c:when test="${param.fruit==3}">
			<div style="color: red">딸기</div>
		</c:when>
		<c:otherwise>
			<div>그외 과일들</div>
		</c:otherwise>
	</c:choose>
</body>
</html>