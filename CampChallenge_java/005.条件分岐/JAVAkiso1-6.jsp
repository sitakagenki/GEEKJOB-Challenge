<%-- 
    Document   : JAVAkiso1-6
    Created on : 2017/12/19, 14:20:11
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
              int a=1;
              
              for(int i=1;i<=3;++i){
              
               switch(a){
                  case 1:
                      out.print("one  ");
                      ++a;
                      break;
                  case 2:
                      out.print("two  ");
                      ++a;
                      break;
                  default:
                      out.print("想定外  ");
                      ++a;
                      break;
               }    
              }
              
            %>
        </h1>
    </body>
</html>
