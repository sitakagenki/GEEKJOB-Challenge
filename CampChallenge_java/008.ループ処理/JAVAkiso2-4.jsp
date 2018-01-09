<%-- 
    Document   : JAVAkiso2-4
    Created on : 2017/12/20, 14:24:41
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
                int a=0;
                
                for(int i=0;i<=100;++i){
                    a+=i;
                
                    out.print(a+"<br>");
                }
            %>
        </h1>
    </body>
</html>
