<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글 상세보기</h2>
	<hr>
	<h4>${board.title }</h4>
	<div>
		조회수 : ${board.viewCnt }
	</div>
	<div>
		글쓴이 : ${board.writer }
	</div>
	<div>
		등록일 : ${board.regDate }
	</div>
	<div>
		내용 : ${board.content }
	</div>
	
	<a href="board?act=updateform&id=${board.id}">수정</a>
	<a href="board?act=delete&id=${board.id}">삭제</a>
</body>
</html>