package com.ssafy.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/hello")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			
			session.setAttribute("name", "ssesionYangg");
			
//			request.getRequestDispatcher("session/test.jsp").forward(request, response);
			response.sendRedirect("session/test.jsp");
			
		}
	
	
	
	
	
	
	
	
}
