<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link href="bootstrap.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2><font  face = "WildWest" color="blue">Enter Student Details</font></h2>
<form action="add_student">
<pre>
Name:         <input type="text" name="name">

User id:      <input type="text" name="uname">

Password:     <input type="text" name="pass">

             
             <input type="submit" value="Register" class="btn btn-outline-primary">   <input type="button" onclick="location.href='AdminPanelPage'" value="Home" class="btn btn-outline-success">    <input type="button" onclick="location.href='viewStudents'" value="Back" class="btn btn-outline-danger">
</pre>
</form>

<%-- <font color="red" >

		<c:if test="${msg4 ne null}">  
   		  <p> <c:out value="${msg4}"/><p>  
         </c:if>
		</font>
		
			<font color="green" >
		<c:if test="${msg3 ne null}">  
   		  <p> <c:out value="${msg3}"/><p>  
       </c:if>
		</font>
		</div>
 --%>
 <c:set var="enablebtnRelatedDocs" value="${msg3}" scope="request"/>

<c:out value="${requestScope.enablebtnRelatedDocs }"/>


</body>
</html>