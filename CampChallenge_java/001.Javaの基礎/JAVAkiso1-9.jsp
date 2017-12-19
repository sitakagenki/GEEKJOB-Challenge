<%-- 
    Document   : JAVAkiso1-9
    Created on : 2017/12/19, 17:49:29
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
            <%@ page import="java.util.ArrayList"%>
            
            <%
               ArrayList<String>data=new ArrayList<String>();
               
               data.add("10  ");
               data.add("100  ");
               data.add("soeda  ");
               data.add("hayashi  ");
               data.add("-20  ");
               data.add("118  ");
               data.add("END  ");
               
               data.set(2,"33  ");
               int a=0;
              
               for(int i=1;i<=7;++i){
                 out.print(data.get(a));
                 ++a;
              }
            %>
        </h1>
    </body>
</html>
