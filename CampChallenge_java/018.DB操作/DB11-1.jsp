<%-- 
    Document   : DB11-1
    Created on : 2018/02/16, 10:09:26
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
         <form action = "./DB11" method = "post">
            
            
             氏名記入欄 <input type = "text" name = "name">
          
             年齢記入欄 <input type = "text" name = "age">
             生年月日記入欄 <input type = "text" name = "birthday">
             
             <input type = "submit" name = "更新">
         </form>
    </body>
</html>
