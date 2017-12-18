<%-- 
    Document   : JAVAkiso1-2
    Created on : 2017/12/18, 15:33:09
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
                String name= "私の名前は志鷹元気です。";
                int age=24;
                String syussin="私の出身は富山県です。";
                
                out.println(name);
                out.println("私の年齢は"+age+"歳です。");
                out.println(syussin);
                  
            %>
        </h1>
    </body>
</html>
