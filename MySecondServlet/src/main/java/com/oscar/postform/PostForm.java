package com.oscar.postform;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostForm")
public class PostForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//http://localhost:8080/MySecondServlet/PostForm
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("Get username : " + username);
		System.out.println("Get password : " + password);
		response.getWriter().append("Hello " + username + " " + password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
