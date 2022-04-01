package com.oscar.db;

import java.sql.*;
import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/GetAllUser")
public class GetAllUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	private static final String DB_URL = "jdbc:mariadb://localhost:3307/the_round_table?user=root&password=07310731";

	private static final String SQLUPD = "UPDATE employee SET salary = ? WHERE empno = ?";
	private static final String SQLSEL = "SELECT * FROM sys_user";

//	http://localhost:8080/MariaServlet/GetAllUser
	public GetAllUser() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL);
			PreparedStatement stmt = connection.prepareStatement(SQLSEL);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				response.getWriter().println("id : " + rs.getString("id"));
				response.getWriter().println("account : " + rs.getString("account"));
				response.getWriter().println("password : " + rs.getString("password"));
				response.getWriter().println("user_name : " + rs.getString("user_name"));
				response.getWriter().println();
			}

			response.getWriter().println("Served at: " + request.getContextPath());
			connection.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
