package com.oscar.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetWrite")
public class GetWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().println("<!DOCTYPE html>");
		response.getWriter().println("<html lang=\"en\">");
		response.getWriter().println("<head>");
		response.getWriter().println("<meta charset=\"UTF-8\">");
		response.getWriter().println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		response.getWriter().println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		response.getWriter().println("<title>Write Page</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");

		response.getWriter().println("<h2>Write Page</h2>");
		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.getWriter().println("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
