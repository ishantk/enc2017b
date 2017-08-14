<%@page import="com.auribises.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>ScriptLet Demo <br/>
	Lets print the table of 10</p><br/>
	<%
		int num = 10;
		for(int i=1;i<=10;i++){
			out.print(num+" "+i+"'s are "+(num*i)+"<br/>");
		}
	%>
	
	
	<%
		int age = 20;
		if(age>18){
	%>
		<h3>You are eligible to Vote</h3>
	<% 
		}else{
	%>
		<h3>You are not eligible to Vote</h3>
	<%			
		}
	%>
	<br/>
	<p>Declarative Demo <br/>
	
	<%!
		int number = 100;
	
		int squareOfnum(int n){
			return n*n;
		}
	
	%>
	
	
	<h3> Number is: <% out.print(number); %> </h3><br/>
	<h3> Square of 19 is: <% out.print(squareOfnum(19)); %> </h3><br/>
	
	Expression Demo<br/>
	<h3> Square of 21 is: <%= squareOfnum(21) %> </h3><br/>

	<br/>
	
	<%
		int arr[] = {10,20,30,40,50};
		out.print("arr[3]: "+arr[3]);
		/*try{
			out.print("arr[30]: "+arr[30]);
		}catch(Exception e){
			out.print("Excpetion: "+e);
		}*/
	%>
	
	<%
		User user = new User();
		user.setName("John");
		user.setEmail("john@example.com");
		user.setPassword("password123");
	%>
	
	<br/>
	Action Tags:
	<br/>
	<jsp:useBean id="u1" class="com.auribises.model.User"></jsp:useBean>
	<jsp:setProperty property="name" name="u1" value="Jennie"/>
	<jsp:setProperty property="email" name="u1" value="jennie@example.com"/>
	<jsp:setProperty property="password" name="u1" value="jennie123"/>
	
	
	<b><i>
	
		Name is: <jsp:getProperty property="name" name="u1"/> 
		<br/>
		Email is: <jsp:getProperty property="email" name="u1"/> 
		<br/>
		Password is: <jsp:getProperty property="password" name="u1"/> 
		<br/>
	
	
		<jsp:include page="printdate.jsp"/>
		
		<jsp:forward page="printdate.jsp"/>
	
	</i></b>	

</body>
</html>