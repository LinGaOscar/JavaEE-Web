package com.oscar.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesReq")
public class CookiesReq extends HttpServlet {
	private static final long serialVersionUID = 5615546993037725232L;

	public CookiesReq() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			response.getWriter().println("Found Cookies Name and Value");
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				response.getWriter().println("Name : " + cookie.getName());
				response.getWriter().println("Value: " + cookie.getValue());
			}
		} else {

			response.getWriter().println("No cookies founds");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
