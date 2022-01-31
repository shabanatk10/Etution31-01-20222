<%@ page import="testpack.StudUserDeo" %>

<jsp:useBean id="s" class="testpack.StudUser"></jsp:useBean>
<jsp:setProperty property="*" name="s"/>

<%
int i=StudUserDeo.save(s);
if(i>0){
	
	response.sendRedirect("stud_home.html");
}
else{
	out.print("Something went wrong.........");
}

%>