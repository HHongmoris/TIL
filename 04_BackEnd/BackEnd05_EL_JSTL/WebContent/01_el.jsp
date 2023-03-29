<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<!-- Hello출력하기-->
	<!-- 스크립트릿 -->
	<% out.print("Hello"); %> <br>
	<!-- 표현식으로 -->
	<%= "Hello" %><br>
	<!-- EL -->
	${"Hello" }
	
	
</body>
</html>