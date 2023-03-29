package com.ssafy.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/make")
public class MakeCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		
		
		//쿠키를 생성하자.!!!
		Cookie cookie = new Cookie(key, value);
		
		response.addCookie(cookie);
		
		//유효시간(만료시간) 초단위
		cookie.setMaxAge(60); //1분유지하겠다.
		//만료시간을 0으로 한다면 쿠키를 지우는것과 똑같음
		
		
		response.sendRedirect("01_Cookie.jsp");
		
	}
}
