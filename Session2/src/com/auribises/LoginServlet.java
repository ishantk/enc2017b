package com.auribises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/LoginServlet", "/Login", "/Awesome" })
public class LoginServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("--init executed--");
	}

	
	public void destroy() {
		System.out.println("--destroy executed--");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--service executed--");
		
		String str= "<h3>Dear User, Login Here</h3>"+
		"<br/><br/>"+
		"<form action='Login' method='post'>"+
		"	Enter Email ID: <input type='text' name='txtEmail' placeholder='eg: john@example.com'>"+
		"	<br/>"+
		"	Enter Password: <input type='password' name='txtPassword' placeholder='eg: john@123'>"+
		"	<br/>"+
		"	<input type='submit' value='Login'>"+
		"</form>";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword"); 
		
		System.out.println("email: "+email);
		System.out.println("password: "+password);
		
		// Write JDBC Code Here
		if(email.equals("admin@example.com") && password.equals("password123")){
			out.print("<h3>Login Success...</h3>");
		}else{
			out.print("<b>Login Failure...</b>");
			out.print(str);
		}
	}

}
