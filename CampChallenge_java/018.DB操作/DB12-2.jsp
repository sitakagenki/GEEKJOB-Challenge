<%-- 
    Document   : DB12-2
    Created on : 2018/02/16, 14:36:43
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
        <form action = "/Web1/DB12_3" method = "post">
        
        <h1>商品登録・商品一覧画面</h1>
        <h2>商品登録フォーム</h2>
        <h2>ごきげんよう。${User}さん </h2>
        商品名登録欄<input type = "text" name = "productName">
        在庫数<input type = "text" name = "stock">
        
         <input type = "submit" name = "touroku" value ="商品登録">
        </form>
        
        <h2>登録商品一覧確認</h2>
        <form action = "/Web1/DB12_3" method = "get">
        
        <input type = "submit" name = "itiran" value = "商品一覧">
        
        </form>
        
        <form action = "/Web1/DB12_5" method = "post"> 
        
        <h2>ログアウトはこちら</h2>
              
        <input type ="submit" name = "logout" value = "ログアウト">
        </form>
        
    </body>
</html>
