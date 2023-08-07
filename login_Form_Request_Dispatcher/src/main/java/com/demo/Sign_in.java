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
 * Servlet implementation class Sign
 */
@WebServlet("/sign_in")
public class Sign_in extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sign_in() {
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

			response.setContentType("text/html"); //mime type multi purpose mail Internet
			String user=request.getParameter("name");
			String pass=request.getParameter("pass");
	
		 
		 response.setContentType("text/html");
		    String bgcolor="";
		    int count=0;
		 
		    out.print("<html>");
		    out.print("<body>");
		    out.println("<head><title>Sign_in Data</title></head>");
		   
		    out.print("<center><H2>Sign_in Data</H2></center>");
		  out.print("<center><table border=1 bgcolor=lightblue>");
		    out.print("<tr><th>Student Id</th><th>Name</th><th>Email</th><th>Phone No.</th><th>Password</th></tr>");
		
		    Connection conn;
			conn=GetOracleConnection.getMyOracleConn();
			PreparedStatement pst;
			String qry="select * from sign where name='"+user +"' and pass='"+pass +"'";
			ResultSet rs;
			try {
				pst =conn.prepareStatement(qry);
		
				rs = pst.executeQuery();
				
		       while (rs.next()){
		    	   if(user.equals(rs.getString(2)) && pass.equals(rs.getString(5)) ) {
		    		   count++;
				        out.print("<tr style=background-color: bgcolor>");
				    
						out.print("<td>" +rs.getInt(1)+"</td>");
				        out.print("<td>" +rs.getString(2)+"</td>");
				        out.print("<td>"+ rs.getString(3)+"</td>");
						out.print("<td>"+rs.getString(4)+"</td>");
						out.print("<td>"+rs.getString(5)+"</td>");
						
				      out.print("</tr>");
		    		 
		
		       }else
		   		{
		//   		response.sendRedirect("sign_in.html");
		    	   	
		   		}}
		   		

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response.sendRedirect("sign_in.html");
			
			}
		      // dbcon.close();
			  out.print("</table>");
		      out.print("</center>");
		      out.print("<center><h1>Sucessfully login</h1></center>");
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
