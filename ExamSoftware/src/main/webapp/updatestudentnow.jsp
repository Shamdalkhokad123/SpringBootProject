<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@page import="model.StudentsDao"%>
<%@page import="dao.Students"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	
<title>Update Student Information</title>
</head>
<body>
<%
		String newuserid = request.getParameter("uname");
        String newpassword = request.getParameter("pass");
        String newname = request.getParameter("name");
        String originaluid = request.getParameter("usernameoriginal");
		int status = StudentsDao.doUpdateNowRecord(originaluid,newuserid,newpassword,newname);
		if(status > 0)
		{ 
			response.sendRedirect("StudentList.jsp");
		}
		else if(status == -1)
		{
			
			out.print("error from databse");
			
		}
		else
		{
			out.print("excepion occured");
		}
		
	%>
</body>
</html>