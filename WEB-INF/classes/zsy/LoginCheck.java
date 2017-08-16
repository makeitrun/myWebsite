package zsy;

//a servlet by extending the HttpServlet
import javax.servlet.http.*;

import java.io.*;
import java.sql.*;
public class LoginCheck extends HttpServlet {
	
	//handle get request
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		String url="jdbc:mysql://localhost:3306/jtest?user=root";
		
		try{
			String usr=req.getParameter("user_name");
			String passwd=req.getParameter("password");
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			stat=conn.createStatement();
			rs=stat.executeQuery("select passWord from users where userName='"+usr+"'");
			if(rs.next())
			{
				if(rs.getString(1).equals(passwd))
				{
					HttpSession hs=req.getSession();
					hs.setMaxInactiveInterval(5);
					hs.setAttribute("online", "yes");			
					res.sendRedirect("welcome?uname="+usr+"&pwd="+passwd);
				}
				else
				{
					res.sendRedirect("loginServlet?info=invalid1");
					return;
				}	
			}
			else
			{
				res.sendRedirect("loginServlet?info=invalid1");
				return;
			}
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
	//handle post request
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		this.doGet(req, res);
	}

}