
<%@page import="model.StudentsDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
 <%@ page isELIgnored="false" %>     
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Merriweather&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 
<div height="200" width=100% style="background-color: yellow">
  <marquee behavior="alternate">
     <h2> <font  color ="green">Welcome ${name }</font></h2>
  </marquee>
</div>
<center>
<pre>
<table class="table table-hover">
<tr>
 
 <th colspan="2"><center><h4><font color="red">Instructions to Students</font></h4></center></th>
</tr>
<tr>
<tr>

<c:forEach items="${instructions}" var="q">
	     <tr>
	     <td>1</td>
	    <td><c:out value="${q.instruction }"></c:out><td>
	     </tr>
 </c:forEach>
</table>
<pre>
<button type="button" class="btn btn-outline-primary btn-lg" onclick="location.href='logout_student'">Logout</button>   <button type="button" class="btn btn-outline-primary btn-lg" onclick="location.href='Load_Exam_Page'">Start Test</button>
</pre>
</center>
	
</body>
</html>