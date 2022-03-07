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

	// http://localhost:8080/MyFirstServlet/HomeWork1
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// change to 9*9Multiplication Table
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 1 && i > 10) {
				response.getWriter().println();
				// System.out.println();
			}
			response.getWriter().print(i + " \t");
			// System.out.print(i + " \t");
		}
		
		
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//
//				response.getWriter().print(i * j + " \t");
//				if (j == 9) {
//					response.getWriter().println();
//				}
//			}
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
