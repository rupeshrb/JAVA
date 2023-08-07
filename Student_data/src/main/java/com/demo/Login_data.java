package com.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.utility.GetOracleConnection;

/**
 * Servlet implementation class Login_data
 */
@WebServlet("/stud_data")
public class Login_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_data() {
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
		String course=request.getParameter("course");
//		out.println("data is =\t   user = "+user+"\t password = "+pass+"\t email = "+email+"\t course = "+course);
		Connection conn;
		int ref_id= Integer.parseInt(request.getParameter("id"));
		
		conn=GetOracleConnection.getMyOracleConn();
		PreparedStatement pst;
		String qry="insert into stud_data values(?,?,?,?,?,?)";
		try {
			
			pst =conn.prepareStatement(qry);
			pst.setInt(1,ref_id);
			pst.setString(2, user);
			pst.setString(3,email);
			pst.setLong(4, phone);
			pst.setString(5, pass);
			pst.setString(6,course );
			int row =pst.executeUpdate();
			if(row > 0) {
				out.println("data is =\t   user = "+user+"\t password = "+pass+"\t email = "+email+"\t course = "+course);
				out.println("\ndata insert succes in database");
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
