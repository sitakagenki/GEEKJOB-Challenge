<%-- 
    Document   : JAVAkiso2-3
    Created on : 2017/12/20, 14:07:49
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
                String a="A";
                
                for(int i=1;i<=29;++i){
                    a=a+"A";
                }
                out.print(a);
            %>
        </h1>
    </body>
</html>
