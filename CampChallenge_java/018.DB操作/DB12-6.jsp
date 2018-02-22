<%-- 
    Document   : DB12-6
    Created on : 2018/02/22, 10:32:21
    Author     : sitak
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="packageDB.DB_GENKIJOB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><h3> 登録情報一覧</h3>
        <% // request.getCharacterEncoding("UTF-8");
            
            DB_GENKIJOB genki = new DB_GENKIJOB();
            HttpSession hs = request.getSession();
            ArrayList<DB_GENKIJOB> al_GENKI = (ArrayList<DB_GENKIJOB>) session.getAttribute("itiran");
           
            //out.print(al_GENKI);
           for(int i=0;i<al_GENKI.size();i++){   
              
           DB_GENKIJOB genkihako = al_GENKI.get(i);
           
           out.print("商品名…" + genkihako.getProduct());
           out.print("　　在庫数…" + genkihako.getStock()+"<br>");
           
        }
          
        %>
        <h3>登録画面はこちら</h3>
        <form action = "/Web1/DB12-2.jsp" method = "post">
            
        <input type = "submit" name = "touroku" value = "登録画面へ">    
            
        </form>
        
        <h3>ログアウトはこちら</h3>
        <form action = "/Web1/DB12_5" method = "post">
            
         <input type = "submit" name = "logout" value = "ログアウト">
            
        </form>
        
        
        
        
        </form>
        
        

    </body>
</html>
