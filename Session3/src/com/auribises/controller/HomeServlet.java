package com.auribises.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet({ "/HomeServlet", "/Home", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = "NA";
		
		//Cookie[] ckArr = request.getCookies();
		/*for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		/*for(Cookie ck : ckArr){
			if(ck.getName().equals("keyName")){
				name = ck.getValue();
				break;
			}
		}*/
		
		//name = request.getParameter("txtName");
		//String email = request.getParameter("txtEmail");
		
		HttpSession session = request.getSession();
		name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		String age = (String)session.getAttribute("keyAge");
		
		
		//session.getId();
		//session.invalidate(); // clear your data in session
		
		out.print("Welcome Home Dear "+name+"<br/>"+email+"<br/>"+age+"<br/>");
		out.print("<i>Its: "+new Date()+"</i><br/><br/>");
		
	}

}
