<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="printdate.jsp" %> 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h3>Welcome home dear user.</h3>
	<br/>
	Cookies: 
	<br/>
	<%
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		
		out.print("Name: "+name+"<br/>Email: "+email);
	%>
	
</body>
</html>