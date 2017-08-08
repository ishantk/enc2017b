package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			
			//1. Cookies
			//Cookie c1 = new Cookie("keyName", name);
			//Cookie c2 = new Cookie("keyEmail", email);
			
			//c1.setMaxAge();
			
			//response.addCookie(c1);
			//response.addCookie(c2);
			
			//2. URL ReWriting / QueryString
			//String url = "Welcome?name="+name+"&email="+email;
			
			//out.print("You are Registered Successfully....");
			//out.println("<a href='"+url+"'>Enter Home</a>");
			
			//3. Hidden Form Field
			/*String str = "<form action='Welcome' method='post'>"+
			"<input type='hidden' name='txtName' value='"+name+"'><br/>"+
			"<input type='hidden' name='txtEmail' value='"+email+"'><br/>"+
			"<input type='submit' value='Welcome Home'>"+
			"</form>";
			out.print(str); // Sending Back the Response*/
			
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyEmail", email);
			session.setAttribute("keyAge", String.valueOf(30));
			out.println("<a href='Wow'>Enter Home</a>");
		}else{
			out.print("You are not Registered Successfully....");
		}
		helper.closeConnection();
	}

}
