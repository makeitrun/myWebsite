package zsy;

//a servlet by extending the HttpServlet
import javax.servlet.http.*;
import java.io.*;
public class Welcome extends HttpServlet {
	
	//handle get request
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		HttpSession hs=req.getSession();
		String online=(String)hs.getAttribute("online");
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		try{
			if(online!="yes")
			{
				res.sendRedirect("loginServlet?info=invalid2");
				return;
			}
			PrintWriter pw=res.getWriter();
			pw.println("<html>"
					+ "<body>"
					+ "<h2>Welcome my friend: "+uname+" ! your pwd is: "+pwd+"</h2>"
					+ "<img src=imgs/Logo.jpg><br>"
					+ "</body>"
					+ "</html>");
			pw.println("Welcome my friend: "+uname+" ! your pwd is: "+pwd);
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
