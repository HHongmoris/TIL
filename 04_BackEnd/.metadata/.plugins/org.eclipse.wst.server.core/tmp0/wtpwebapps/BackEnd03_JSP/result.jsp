<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.ssafy.dto.Person" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Person p = (Person)request.getAttribute("person");
	%>
	<h2>결과창</h2>
	등록된 총인원 : <%=request.getAttribute("size") %> <br>
	
	<table>
		<tr>
			<td>이름</td>
			<td><%=p.getName() %></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=p.getAge() %></td>
		</tr>
		<tr>
			<td>성별</td>
			<td><%=p.getGender() %></td>
		</tr>
		<tr>
			<td>취미</td>
			<td><%=Arrays.toString(p.getHobbies()) %></td>
		</tr>
	</table>
	
	<a href="/BackEnd03_JSP">홈으로</a>
</body>
</html>
