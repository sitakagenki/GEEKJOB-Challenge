<%-- 
    Document   : QueryString1_1
    Created on : 2018/01/20, 14:08:51
    Author     : sitak
--%>
<%@page import="java.lang.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8");
        
           //個数と総額について
           String sougaku1 = request.getParameter("sougaku");
           String kosuu1 = request.getParameter("kosuu");
           
           int sougakuData = Integer.parseInt(sougaku1);
           int kosuuData = Integer.parseInt(kosuu1);
           
           //商品種別について
           String syouhinnsyubetu1 = request.getParameter("syouhinnsyubetu");
           int syouhinnsyubetuData = Integer.parseInt(syouhinnsyubetu1);
           
             if(syouhinnsyubetuData==1){
               out.print("商品種別…「雑貨」");
             }else if(syouhinnsyubetuData==2){
               out.print("商品種別…「生鮮食品」");
             }else if(syouhinnsyubetuData==3){
               out.print("商品種別…「その他」");
             }else{
               out.print("商品種別は、1～3までの数字で選んでください");
             }
        %>
        商品一つあたりの値段は,<%out.print(sougakuData/kosuuData);%>円です。
        
        <%
             if (sougakuData >= 5000) {
                     double point = sougakuData * 0.05;
                     int point1=(int) point;
                     out.print("今回のポイントは5％分で" + point1 + "ポイントです。");
                 } else if (sougakuData >= 3000) {
                     double point = sougakuData * 0.04;
                     int point1=(int) point;
                     out.print("今回のポイントは４％分で" + point1 + "ポイントです。");
                 } else {
                     out.print("今回はポイントはつきません。");
                 }
          
        %>
