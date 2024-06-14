<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<%@ page import="jakarta.servlet.http.HttpSession" %>

<body>
    <%
        
        HttpSession currsession1 = request.getSession(false);
            if(currsession1 !=null)
            {
            	currsession1.invalidate();
            }
            response.sendRedirect("index.html");
        
    %>

</body>
</html>