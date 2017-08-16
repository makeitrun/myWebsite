package zsy;

//a servlet by extending the GenericServlet
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.io.*;

public class HelloGeneric extends GenericServlet{

	//in this way, we only need to override the method of service
	public void service( ServletRequest req, ServletResponse res )
	{
		try{
			PrintWriter pw=res.getWriter();
			pw.println("Hello generic servlet!");
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
