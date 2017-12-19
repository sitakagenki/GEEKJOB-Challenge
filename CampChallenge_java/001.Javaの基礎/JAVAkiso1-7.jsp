<%-- 
    Document   : JAVAkiso1-7
    Created on : 2017/12/19, 14:40:09
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
              char a='A';
             
              for(int i=1;i<=3;++i){
              
               switch (a){
                  case 'A':
                      out.print("英語  ");
                      a='あ';
                      break;
                  case 'あ':
                      out.print("日本語  ");
                      a='B';
                      break;
                  default:
                      break;
                      
                } 
              }
              
            %>
        </h1>
    </body>
</html>
