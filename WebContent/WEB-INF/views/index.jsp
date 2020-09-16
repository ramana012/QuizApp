<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}
a {
  float: left;
  text-align: left;
  padding: 1px 6px;
  text-decoration: none;
  font-size: 25px;
  }

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav h2 {
  
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
 td {
  border: 1px solid #ddd;
  border-radius: 5px;
  
}
table{
width: auto;
height: auto;
border: 1px solid #ddd;
padding: 35px;
border-radius: 25px;
}
</style>
<title>Quiz App</title>
</head>
<body>
<div class="topnav">
    <h2>Quiz App</a></h2>
</div>
<div align="center">
	
	<!-- <form method="get" action="search">
		<input type="text" name="keyword" /> &nbsp;
		<input type="submit" value="Search" />
	</form> -->
	<!-- <form method="get" action="mysearch">
		<input type="text" name="keyword" /> &nbsp;
		<input type="submit" value="Search" />
	</form> -->
	
		<h3>Correct Answered: ${count}</h3>
	
	 <c:if test = "${status!=null}">
         <c:out value = "${status}"/>
      </c:if>
	<br>
	<br>
	<br>
	
	<table cellpadding="5">
				
		<tr>
			<%-- <td>${listCustomer.idquiz}</td></tr> --%>
			
		<tr>	<th>${listCustomer.question}</th></tr>
			<tr><td><a href="ans?id=1&cid=${listCustomer.answer}">${listCustomer.ans1}</a></td></tr>
			<tr><td><a href="ans?id=2&cid=${listCustomer.answer} ">${listCustomer.ans2}</a></td></tr>
			<tr><td><a href="ans?id=3&cid=${listCustomer.answer} ">${listCustomer.ans3}</a></td></tr>
			<tr><td><center><a href="ans?id=4&cid=${listCustomer.answer} ">${listCustomer.ans4}</a></center></td></tr>
			<%-- <a href="delete?id=${customer.id}">Delete</a> --%>
			
			<tr><td><a href="/QuizApp">Skip</a></td></tr>
			
			<%-- <td>${listCustomer.answer}</td> --%>
			
					
		</tr>
		
	</table>
</div>	
</body>
</html>