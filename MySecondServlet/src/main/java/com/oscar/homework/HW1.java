package com.oscar.homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HW1")
public class HW1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// http://localhost:8080/MySecondServlet/HW1
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("username");
		if (userName == null) {
			response.sendRedirect("homework/HW1.jsp");
		} else {
			request.getRequestDispatcher("homework/HW1-1.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
