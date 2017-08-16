package zsy;
import javax.servlet.*;
import java.io.*;

//web service by implementing interface of Servlet
public class Hello implements Servlet  {

	//destroy the instance of the servlet when:
	//1.reload 2.shutdown tomcat 2.shutdown machine
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroying...");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	//nothing to do with the life cycle of the servlet
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	//it will be called the first time the user access the servlet
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet is initing!");
	}

	//code, be called everytime the user access the servlet
	//ServletRequest: help to get the client info
	//ServletResponse: return message to client
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("The service function is calling!");
		PrintWriter pw=res.getWriter();
		pw.println("Hello world!");
	}

}
