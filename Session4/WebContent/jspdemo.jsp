<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

</body>
</html>