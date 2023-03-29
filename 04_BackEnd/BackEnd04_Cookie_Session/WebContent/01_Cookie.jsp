<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키</title>
</head>
<body>
	<h2>현재 내 브라우저에 있는 쿠키 정보</h2>
	<hr>
	<%
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(Cookie c : cookies){
				String key = c.getName();
				String value = c.getValue();
		%>
				<h3><%=key %>:<%=value %></h3>
		<%
				
			}
		}
		else {
			out.print("설정된 쿠기가 없다.");
		}
	%>



	<h2>쿠키설정</h2>
	<form action="make" method="GET">
		이름 : <input type="text" name="key"><br> 
		값 : <input type="text" name="value" ><br> 
		
		<button>제출</button>
	
	</form>
</body>
</html>