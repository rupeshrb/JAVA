package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.utility.GetOracleConnection;

/**
 * Servlet implementation class Update
 */
@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
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
		String user=request.getParameter("name");
		String pass=request.getParameter("password");
		Long phone=Long.parseLong(request.getParameter("phone"));
		String email=request.getParameter("email");
	
		Connection conn;
		conn=GetOracleConnection.getMyOracleConn();
		PreparedStatement pst;
		response.setContentType("text/html"); //mime type multi purpose mail Internet
		int id=Integer.parseInt(request.getParameter("id"));
		 try {
		      PreparedStatement ps = conn.prepareStatement("UPDATE stud_data SET Sname = '"+user +"', Semail = '"+email +"', Sphone = '"+phone +"', Spassword = '"+pass +"' WHERE Sid = ?");
		     ps.setInt(1, id);
		     
		         int i =   ps.executeUpdate();
		         if(i > 0) {
			            out.println("Student Data Update successfully ...");
			        }
		    } catch (Exception e) {
		        System.out.println(e);
		    }

	 response.setContentType("text/html");
	    String bgcolor="";
	    int count=0;
	 
	    out.print("<html>");
	    out.print("<body>");
	    out.println("<head><title>STUDENT DATA After Update record</title></head>");
	   
	    out.print("<center><H2>Student Data After Update record</H2></center>");
	  out.print("<center><table border=1 bgcolor=lightblue>");
	    out.print("<tr><th>Student Id</th><th>Name</th><th>Email</th><th>Phone No.</th><th>Password</th><th>Course</th></tr>");
	
	
		String qry="select * from stud_data";
		ResultSet rs;
		try {
			pst =conn.prepareStatement(qry);
		
			rs = pst.executeQuery();
	       while (rs.next()){

			count++;
	        out.print("<tr style=background-color: bgcolor>");
	    
			out.print("<td>" +rs.getInt(1)+"</td>");
	        out.print("<td>" +rs.getString(2)+"</td>");
	        out.print("<td>"+ rs.getString(3)+"</td>");
			out.print("<td>"+rs.getString(4)+"</td>");
			out.print("<td>"+rs.getString(5)+"</td>");
			out.print("<td>"+rs.getString(6)+"</td>");
	      out.print("</tr>");
	         
	       }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      // dbcon.close();
		  out.print("</table>");
	      out.print("</center>");
	     // out.println("<br><H2><a href=http://uniquepropertyforyou.com/UniquePhone><b>LogOut</b></a></H2><br>");
	
	      out.print("</body>");
	      out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
