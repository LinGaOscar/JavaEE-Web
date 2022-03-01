package com.oscar.homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeWork1")
public class HomeWork1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 1 && i > 10) {
				response.getWriter().println();
				System.out.println();
			}
			response.getWriter().print(i + " \t");
			System.out.print(i + " \t");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
