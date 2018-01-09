<%-- 
    Document   : JAVAkiso2-1
    Created on : 2017/12/20, 13:08:25
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
            <%@ page import="java.util.HashMap"%>
            
            <%
              HashMap<String,String>a=new HashMap<String,String>();
              
              a.put("1","AAA");
              a.put("hello","World");
              a.put("soeda","33");
              a.put("20","20");
              
              out.print(a.get("1")+"<br>");
              out.print(a.get("hello")+"<br>");
              out.print(a.get("soeda")+"<br>");
              out.print(a.get("20")+"<br>");
            %>
        </h1>
    </body>
</html>
