<%@page import="com.auribises.db.JDBCHelper"%>
<%@page import="com.auribises.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
			String email = request.getParameter("txtEmail");
			String password = request.getParameter("txtPassword");
			
			User user = new User();
			user.setEmail(email);
			user.setPassword(password);
			
			JDBCHelper helper = new JDBCHelper();
			helper.openConnection();
			boolean check = helper.loginUser(user);
			
			if(check){
	%>
			<b>Login is Success</b>
			<br/><br/>
			<a href="home.jsp">Enter Home</a>
	<%			
			
			/*Cookie c1 = new Cookie("keyEmail",email);	
			Cookie c2 = new Cookie("keyName","Leo");
			response.addCookie(c1);
			response.addCookie(c2);*/
			
			session.setAttribute("keyEmail", email);
			session.setAttribute("keyName", "Leo");
			
			}else{
				response.sendRedirect("https://www.google.co.in");
			}
			
			helper.closeConnection();
			
	%>		
</body>
</html>