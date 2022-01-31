<%@page import="org.apache.coyote.Request"%>
<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@page import="testpack.StudUserDeo" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="testpack.StudUserDeo,testpack.StudUser,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<%
List<StudUser> list=StudUserDeo.getallstudents();
request.setAttribute("list",list);
%>



<table border="1" width="90%">
<tr><th>Student Id</th><th>First Name</th><th>Last Name</th><th>Place</th><th>Gender</th>
<th>Email</th><th>PhoneNumber</th><th>Standard</th><th>Syllabus</th><th>School</th><th>Gardian</th></tr>
<c:forEach items="${list }" var="s">
<tr><td>${s.getStudid()}</td><td>${s.getFirstname()}</td><td>${s.getLastname()}</td><td>${s.getPlace()}</td>
<td>${s.getGender()}</td><td>${s.getEmail()}</td><td>${s.getPhonenumber()}</td><td>${s.getStandard()}</td>
<td>${s.getSyllabus()}</td><td>${s.getSchool()}</td><td>${s.getGardian()}</td></tr>



</c:forEach>




</table>
</body>
</html>