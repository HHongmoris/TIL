<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 전체목록</title>
</head>
<body>
	<%@ include file="/common/header.jsp" %>
	<h2>게시글 목록</h2>
	<hr>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>조회수</th>
			<th>등록일</th>
		</tr>
		<c:forEach items="${list}" var="board">
			<tr>
				<td>${board.id}</td>
				<td>
					<a href = "board?act=detail&id=${board.id }">
						${board.title}
					</a>
				</td>
				<td>${board.writer}</td>
				<td>${board.viewCnt}</td>
				<td>${board.regDate}</td>
			</tr>
		</c:forEach>
	</table>
	
	<!-- 경로의 맛을 잘 느껴라 -->
	<a href="board?act=writeform">글등록</a>
	<a href="/BackEnd07_Board_Web/board?act=writeform">글등록</a>
	<a href="<%=request.getContextPath() %>/board?act=writeform">글등록2</a>
	<a href="${root }/board?act=writeform">글등록3</a>
</body>
</html>