package zsy;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class SessionTest2 extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res )
	{
		HttpSession hs=req.getSession();
		String attr1=(String)hs.getAttribute("sessiontest1");
		try{
			PrintWriter pw=res.getWriter();
			pw.println("<h1>the session attr for key of sessiontest1 is:"+attr1+"</h1>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		this.doPost(req, res);
	}
}
