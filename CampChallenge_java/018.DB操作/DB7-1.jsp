<%-- 
    Document   : DB7-1
    Created on : 2018/02/15, 10:11:08
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
        <form action = "./DB7" method = "post">
            
             ID記入欄 <input type = "text" name = "IDnum">
             氏名記入欄 <input type = "text" name = "name">
             電話番号記入欄 <input type = "text" name = "tel">
             年齢記入欄 <input type = "text" name = "age">
             生年月日記入欄 <input type = "text" name = "birthday">
             
             <input type = "submit" name = "更新">
        </form>
    </body>
</html>
