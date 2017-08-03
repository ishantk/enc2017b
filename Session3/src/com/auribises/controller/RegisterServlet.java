package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auribises.db.JDBCHelper;
import com.auribises.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet({ "/RegisterServlet", "/Register","/Register.do" })
public class RegisterServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init executed");
	}


	public void destroy() {
		System.out.println("destroy executed");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service executed");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		// Object shall contain data -> Model
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		// Object is temporary. Its available in Heap area of RAM.
		// Lets Persist the Object in DB
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		int i = helper.registerUser(user);
		if(i>0){
			out.print("You are Registered Successfully....");
		}else{
			out.print("You are not Registered Successfully....");
		}
		helper.closeConnection();
	}

}
