<%-- 
    Document   : JAVAkiso2-5
    Created on : 2017/12/20, 14:54:22
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
        <h1>
            <%
                int a=1000;
                
                while(a>100){
                    
                    out.print(a+"<br>");
                    a=a/2;
                }
                out.print(a);
            %>
        </h1>
    </body>
</html>
