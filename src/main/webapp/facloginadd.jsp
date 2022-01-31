<%@ page import="testpack.FacloginDeo" %>
<jsp:useBean id="fu" class="testpack.Facloginuser"></jsp:useBean>
<jsp:setProperty property="*" name="fu"/>

<%
int i=FacloginDeo.save(fu);
if(i>0){
	
	response.sendRedirect("faculty_registration.html");
	
}
else{
	out.print("Something went wrong......");
}

%>