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
       
	Connection conn = null;
	private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
//	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:maria://localhost:3307/the_round_table";
//	private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "07310731";

	private static final String SQLUPD = "UPDATE employee SET salary = ? WHERE empno = ?";
	private static final String SQLSEL = "SELECT * FROM sys_user";
	
    public GetAllUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName ("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/the_round_table?user=root&password=07310731");
//			conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
			PreparedStatement stmt = connection.prepareStatement(SQLSEL);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				response.getWriter().append(rs.getString("id"));
				response.getWriter().append(rs.getString("account"));
				response.getWriter().append(rs.getString("password"));
				response.getWriter().append(rs.getString("user_name"));
			}
			
			response.getWriter().append("Served at: ").append(request.getContextPath());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
