package zsy;

//a servlet by extending the HttpServlet
import javax.servlet.http.*;
import java.io.*;
public class LoginServlet extends HttpServlet {
	
	//handle get request
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		String info=req.getParameter("info");
		try{
			PrintWriter pw=res.getWriter();
			pw.println("<html> "
					+ "<head>"
					+ "</head>"
					+ "<body>"
					+ "<h1>login</h1>");
			if(info!=null)
			{
				pw.println("<h2>"+info+"</h2>");
			}
			pw.print("<form action='loginCheck' method='post'> "
					+ "user_name: <input type='text' name='user_name'>"
					+ "<br>"
					+ "password: <input type='password' name='password'>"
					+ "<br>"
					+ "<input type='submit' value= 'submit' name=''>"
					+ "</form>"
					+ "</body>"
					+ "</html>");
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