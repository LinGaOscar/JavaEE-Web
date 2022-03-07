package com.oscar.session;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionSet")
public class SessionSet extends HttpServlet {

	private static final long serialVersionUID = 4168888830062699501L;

	// http://localhost:8080/MyFirstServlet/SessionSet
	public SessionSet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		System.out.println("Session Name :" + session.getClass().getName());

		session.setMaxInactiveInterval(1000 * 5);
		int time = session.getMaxInactiveInterval();
		System.out.println("Session Interval :" + time);

		long createTime = session.getCreationTime();// return long
		Date createDate = new Date(createTime);
		System.out.println("Session start time :" + createDate);

		session.setAttribute("first_name", "Oscar");
		session.setAttribute("last_name", "Lin");
		// request.getRequestDispatcher("/SessionSampleReq").forward(request, response);
		response.sendRedirect("SessionReq");
	}
}
