<%-- 
    Document   : Session2
    Created on : 2018/01/23, 10:56:18
    Author     : sitak
--%>

<%
//    String myVal = "arai";
%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%//@page import = "java.util.HashMap"%>
<%//@page import = "java.util.ArrayList"%>
<%--<%@page import ="javax.servlet.http.HttpSession" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <%-- <% String namae = "man"; %>
        <c:if test = "${namae='man'}"> --%>
        
        
        
        
        <form action = "/JavaKiso/Session2_1" method = "post">
            
<!--          <c:if test = "">
            名前…<input type = "text" name = "namae" value = "ここに名前">
          </c:if>
        --><%HttpSession sh= request.getSession();%>
           
           
         <% String a = (String) sh.getAttribute("UserName"); %>
         <% String c = (String) sh.getAttribute("UserSyumi");%>
         <%// String b = (String) sh.getAttribute("Userjender");%>
         
            名前…<input type = "text" name = "namae" Value ="<%= a %>"> 
            
            男性<input type = "radio" name = "seibetu" <c:if test = "${Userjender ==0}"> checked </c:if>  value = "0">
            女性<input type = "radio" name = "seibetu" <c:if test = "${Userjender ==1}" > checked </c:if> value = "1">
           
            
            趣味…<input type = "text" name = "syumi" value = "<%= c %>">
           
            <input type = "submit" name = "botan">
       <%--     <input type="text" name ="araiName" value ='<%= myVal %>'>
                      <input type="text" name ="araiName" value ='<% out.print(myVal); %>'>--%>
      </form>
    </body>
</html>
