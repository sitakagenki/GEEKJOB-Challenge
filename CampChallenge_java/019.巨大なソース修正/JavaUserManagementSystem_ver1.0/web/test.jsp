<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="jums.UserDataBeans"%>

<%-- 
    Document   : test
    Created on : 2018/02/26, 14:47:21
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
        <%  int select = 2000;   %>
        
        生年月日:
        <select name="year">
            <option value="">----</option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>"> <%=i%> 
            <% } %>
            <option value="<%=select%>"selected ><%=select%>
            
            </option>
            
        </select>年
        <% String tell = ""; %>
        電話番号:
        <input type="text" name="tell" value="<%=tell%>">
        
        <%
          out.print("こんにちは"+"<br>");
          out.println("こんばんわ");
          
          System.out.print("しすたむ　LN");
          System.out.print("しすてむ　こんいちは");
        %>
        
    </body>
</html>
