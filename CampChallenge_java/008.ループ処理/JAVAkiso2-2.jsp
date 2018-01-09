<%-- 
    Document   : JAVAkiso2-2
    Created on : 2017/12/20, 13:51:20
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
                long a=1;
                
                for(int i=1;i<=20;++i){
                    a=a*8;
                    
                    out.print(a+"<br>");
                }
            %>
        </h1>
    </body>
</html>
