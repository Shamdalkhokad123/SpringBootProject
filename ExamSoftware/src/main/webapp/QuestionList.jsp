<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>All questions are here</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<center><h3><pre><font color="blue">List of all questions</font></pre></h3></center>
<table class="table table-bordered table-hover">
<tr tr class="table-dark">
 <th>sl no.</th>
 <th>Question</th>
 <th>Option A </th>
 <th>Option B </th>
 <th>Option C </th>
 <th>Option D </th>
 <th>Correct Answer</th>
 <th>Update</th>
 <th>Delete</th>
</tr>
<tr>


  <c:forEach items="${questions}" var="q">
	     <tr>
	     <td><c:out value="${q.qid }"></c:out></td>
	     <td><c:out value="${q.question }"></c:out></td>
	     <td><c:out value="${q.a }"></c:out></td>
	     <td><c:out value="${q.b }"></c:out></td>
	     <td><c:out value="${q.c }"></c:out></td>
	     <td><c:out value="${q.d }"></c:out></td>
	     <td><c:out value="${q.answer }"></c:out></td>
	      <td><a href="UpdateQuestion?=${q.qid }">Update</a></td>  
	      <td><a href="DeleteQuestion?=${q.qid }">Delete</a></td> 
	     </tr>
	   </c:forEach>

<tr>


<th colspan="4"  ><center><input type="button" value="Add Question" class="btn btn-outline-success" onclick="location.href='AddQuestionPage'"></center></th>
<th><input type="hidden"></th>
<th colspan="4"  ><center><input type="button" class="btn btn-outline-danger" value="Back to Panel" onclick="location.href='AdminPanelPage'"></center></th>

</table>
</body>
</html>