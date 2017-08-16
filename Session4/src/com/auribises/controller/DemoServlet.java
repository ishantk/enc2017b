package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet({ "/DemoServlet", "/Demo" })
public class DemoServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		
		String driver = config.getInitParameter("driver");
		String pi = config.getInitParameter("pi");
		
		String name = context.getInitParameter("name");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("Driver: "+driver+"<br/>");
		out.print("Pi: "+pi+"<br/>");
		out.print("Name: "+name+"<br/>");
		
	}

}
