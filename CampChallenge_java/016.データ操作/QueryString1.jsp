<%-- 
    Document   : QueryString1
    Created on : 2018/01/20, 13:27:02
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
       <form action = "./QueryString1_1.jsp" method = "get"> 
        
        総額…<input type = "number" name = "sougaku">円
        
        個数…<input type = "number" name = "kosuu">個
        
        商品種別…<input type = "number" name = "syouhinnsyubetu">
        
        <input type = "submit" name = "botan">
        
       </form>
        
       
    </body>
</html>
