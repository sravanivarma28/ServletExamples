package com.servletexamples;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.net.http.HttpResponse;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;

	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	
	@WebServlet("/addition")
	public class Addition extends HttpServlet{

		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException  {
			int num1=Integer.parseInt(req.getParameter("one"));
			int num2=Integer.parseInt(req.getParameter("two"));
			
			
			PrintWriter p = res.getWriter();
			p.println("sum = "+(num1+num2));
	

}
}