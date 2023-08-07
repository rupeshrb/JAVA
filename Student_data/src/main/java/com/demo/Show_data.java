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
 * Servlet implementation class Show_data
 */
@WebServlet("/show_data")
public class Show_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Show_data() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out = response.getWriter();
		 response.setContentType("text/html");
		    String bgcolor="";
		    int count=0;
		 
		    out.print("<html>");
		    out.print("<body>");
		    out.println("<head><title>STUDENT DATA</title></head>");
		   
		    out.print("<center><H2>Student Data</H2></center>");
		  out.print("<center><table border=1 bgcolor=lightblue>");
		    out.print("<tr><th>Student Id</th><th>Name</th><th>Email</th><th>Phone No.</th><th>Password</th><th>Course</th></tr>");
		
		    Connection conn;
			conn=GetOracleConnection.getMyOracleConn();
			PreparedStatement pst;
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
