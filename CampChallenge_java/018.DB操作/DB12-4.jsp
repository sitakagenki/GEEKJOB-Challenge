<%-- 
    Document   : DB12-4
    Created on : 2018/02/21, 10:13:43
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
        <h3> ${User}さん。登録が完了しました。</h3>
        
        <form action = "/Web1/DB12_5" method = "post">
            <h3> ログアウトはこちら </h3>
            <input type="submit" name = "logout" value= "ログアウト">
                   
        </form>
        
        <form action = "/Web1/DB12-2.jsp" method = "post">
            
        <h3> 追加登録はこちら </h3>
        <input type = "submit" name = "touroku" value = "追加登録">
        
        </form>
        
    </body>
</html>
