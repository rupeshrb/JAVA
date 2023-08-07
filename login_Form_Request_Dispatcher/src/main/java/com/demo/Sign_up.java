package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.utility.GetOracleConnection;

/**
 * Servlet implementation class Sign_up
 */
@WebServlet("/sign_up")
public class Sign_up extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sign_up() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out= response.getWriter();
		response.setContentType("text/html"); //mime type multi purpose mail Internet
		String user=request.getParameter("name");
		String pass=request.getParameter("pass");
		Long phone=Long.parseLong(request.getParameter("phone"));
		String email=request.getParameter("email");
	
//		out.println("data is =\t   user = "+user+"\t password = "+pass+"\t email = "+email+"\t course = "+course);
		Connection conn;
		int ref_id= Integer.parseInt(request.getParameter("id"));
		
		conn=GetOracleConnection.getMyOracleConn();
		PreparedStatement pst;
		String qry="insert into sign values(?,?,?,?,?)";
		try {
			
			pst =conn.prepareStatement(qry);
			pst.setInt(1,ref_id);
			pst.setString(2, user);
			pst.setString(3,email);
			pst.setLong(4, phone);
			pst.setString(5, pass);
		
			int row =pst.executeUpdate();
			if(row > 0) {
				out.println("data is =\t   user = "+user+"\t password = "+pass+"\t email = "+email);
				out.println("data insert succes in database");
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("already id exist");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
