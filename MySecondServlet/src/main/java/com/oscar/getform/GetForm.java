package com.oscar.getform;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetForm")
public class GetForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//http://localhost:8080/MySecondServlet/GetForm
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		if (username == null) {
			//response.sendRedirect("html/getform/GetForm.html");
			response.sendRedirect("jsp/GetForm.jsp");
		} else {
			System.out.println("Get Name : "+username);
			response.getWriter().append("Hello World " + username);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
