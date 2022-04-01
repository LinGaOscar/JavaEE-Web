package com.oscar.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetDB")
public class GetDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	private static final String DB_URL = "jdbc:mariadb://localhost:3307/the_round_table?user=root&password=07310731";
	Connection connection;
	PreparedStatement stmt;

	// http://localhost:8080/MariaServlet/GetDB?SQL=SELECT * FROM sys_user
	// insert into sys_user (account, password , user_name) VALUES ('21053000', '0000','Ikai');
	public GetDB() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String SQL = request.getParameter("SQL");

		List<Object> resulet = new ArrayList<>();
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL);
			stmt = connection.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Map<Object, Object> temp = new HashMap<>();
				temp.put("id", rs.getString("id"));
				temp.put("account", rs.getString("account"));
				temp.put("password", rs.getString("password"));
				temp.put("user_name", rs.getString("user_name"));
				resulet.add(temp);
			}
			response.getWriter().write(resulet.toString());
			connection.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
