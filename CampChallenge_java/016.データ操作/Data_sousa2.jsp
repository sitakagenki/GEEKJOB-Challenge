<%-- 
    Document   : Data_sousa2
    Created on : 2018/01/16, 17:55:04
    Author     : sitak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          request.setCharacterEncoding("UTF-8");
          
          out.print(request.getParameter("namae"));
          out.print(request.getParameter("seibetu"));
          out.print(request.getParameter("syumi"));
          
        %>
    </body>
</html>
