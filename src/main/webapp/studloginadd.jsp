<%@ page import="testpack.StudloginDeo"%>
<jsp:useBean id="su" class="testpack.Studloginuser"></jsp:useBean>  
    <jsp:setProperty property="*" name="su"/> 
    
    <%int i=StudloginDeo.save(su);
    if(i>0){
    	out.print("Success............");
    }
    else
    {
    	
    }
    
    %> 
