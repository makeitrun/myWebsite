package zsy;

//a servlet by extending the HttpServlet
import javax.servlet.http.*;
import java.io.*;
public class HelloHttp extends HttpServlet {
	
	//handle get request
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		try{
			PrintWriter pw=res.getWriter();
			pw.println("Hello HttpServlet!");
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
