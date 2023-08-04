package com.servletexamples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Students")
public class StudentServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out =res.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java8features","root","");
			
			Statement s=c.createStatement();
			String query="SELECT * FROM `students` ";
			ResultSet r =s.executeQuery(query);
			
			ArrayList<Students> student =new ArrayList();
			while(r.next()) {
		student.add(new Students(r.getInt("std_id"),r.getString("std_name"),r.getString("std_mobile"),r.getString("std_email")));
			}
			for(Students Details:student) {
				out.print("<h1>"+Details.getStd_id()+"</h1>");
				out.print("<h1>"+Details.getStd_name()+"</h1>");
				out.print("<h1>"+Details.getStd_mobile()+"</h1>");
				out.print("<h1>"+Details.getStd_email()+"</h1>");
			}
			
		} catch (Exception e) {
			
		}}}

