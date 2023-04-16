<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                <%@page import="model.InstructionsDao"%>
<%@page import="dao.Instructions"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Instruction</title>
</head>
<body>
body>
<%
		String instoriginal = request.getParameter("instoriginal");
        String instmodified = request.getParameter("instmodified");
     
		int status = InstructionsDao.doUpdateNowRecord(instoriginal,instmodified);
		if(status > 0)
		{
			response.sendRedirect("InstructionList.jsp");
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