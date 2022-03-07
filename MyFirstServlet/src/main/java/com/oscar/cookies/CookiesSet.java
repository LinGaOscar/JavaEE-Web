package com.oscar.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesSet")
public class CookiesSet extends HttpServlet {
	private static final long serialVersionUID = 2882884164629631581L;

	// http://localhost:8080/MyFirstServlet/CookiesSet
	public CookiesSet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie firstName = new Cookie("first_name", "Oscar");
		Cookie lastName = new Cookie("last_name", "Lin");
		firstName.setMaxAge(60); // 設定 cookies 保留的時間多長
		lastName.setMaxAge(60); // 設定 cookies 保留的時間多長
		response.addCookie(firstName); // 將它加入到 http header 中
		response.addCookie(lastName); // 將它加入到 http header 中

//		response.sendRedirect("CookiesReq");
		request.getRequestDispatcher("CookiesReq").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
