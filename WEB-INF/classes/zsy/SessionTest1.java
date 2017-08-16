package zsy;

import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTest1 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		HttpSession hs=req.getSession(true); 
		String sessionId=hs.getId();
		hs.setAttribute("sessiontest1","123");
		try{
			PrintWriter pw=res.getWriter();
			
			pw.println("<html>"
					+ "<head>"
					+ "<title>test of session</title>"
					+ "</head>"
					+ "<body>"
					+ "<h1>test of session</h1>"
					+ "<form action='sessiontest2',method='post'>"
					+ "your name: <input type='text', name='name'><br>"
					+ "your id: <input type='text', name='id', value='1231'><br>"
					+ "your passwd: <input type='password', name='pd'><br>"
					+ "session id: <input type='text', name='sid', value="+sessionId+"><br>"
					+ "<input type='submit',value='submit',name=''>"
					+ "</body>"
					+ "</html>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
