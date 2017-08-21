package com.auribises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class HibRegisterServlet
 */
@WebServlet({ "/HibRegisterServlet", "/HibernateRegister" })
public class HibRegisterServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		
		Configuration config=null;
		SessionFactory factory = null;
		Session session = null;
		Transaction txn = null;
		
		
		try {
			
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
					
			txn = session.beginTransaction();
			
			session.save(user);
			
			txn.commit();
			out.print("<b>"+user.getName()+" Registration Finished...</b>");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}finally{
			
		}
		
	}

}
