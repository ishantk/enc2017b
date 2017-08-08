package com.auribises.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class MyFilter implements Filter {

   
	public void destroy() {
		System.out.println("Filter Destroyed");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Pre Processing
		out.println("--Filter PreProcessing--<br/>");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		// Post Processing
		out.println("--Filter PostProcessing--<br/>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initialized");
	}

}
