package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auribises.db.JDBCHelper;
import com.auribises.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/Login", "/Login.do" })
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Extract email and password
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		// use JDBC helper
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		boolean check = helper.loginUser(user);
		
		// check for email and password in DB
		if(check){
			/*out.println("<b>Login is Success..</b>");
			out.println("<a href='Welcome'>Enter Home</a>");*/
			
			out.println("<b>Login is Success1..</b>");
			
			RequestDispatcher rd = request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
			
			out.println("<b>Login is Success2..</b>");
		}else{
			//out.println("<b>Login is Failure..</b>");
			//RequestDispatcher rd = request.getRequestDispatcher("existinguser.html");
			//rd.include(request, response);
			response.sendRedirect("https://www.google.co.in");
		}
		
		helper.closeConnection();
	}

}
