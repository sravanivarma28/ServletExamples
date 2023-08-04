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
	
	@WebServlet("/registration")
	public class RegistrationExample extends HttpServlet{

		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException  {
			String firstName=req.getParameter("firstName");
			String lastName=req.getParameter("lastName");
			
			try {
				DbConnection(firstName,lastName);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("first Name :: "+firstName);
			System.out.println("last Name :: "+lastName);
			
			PrintWriter p=res.getWriter();
			p.println(firstName);
			p.println(lastName);

		}
		public static void DbConnection(String firstName,String lastName)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceservlet","root","");
		Statement st=conn.createStatement();
		
		String query="INSERT INTO names VALUES('"+firstName+"','"+lastName+"')";
		int result=st.executeUpdate(query);
		
		System.out.println(result);
		conn.close();
		}}

