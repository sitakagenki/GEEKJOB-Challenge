<%-- 
    Document   : JAVAkiso1-8
    Created on : 2017/12/19, 17:22:55
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
              String[]data={"10  ","100  ","soeda  ","hayashi  ","-20  ","118  ","END  "};
              
              int a=0;
              
              for(int i=1;i<=7;++i){
                 out.print(data[a]);
                 ++a;
              }
            
            %>
        </h1>
    </body>
</html>
