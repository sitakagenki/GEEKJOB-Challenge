<%-- 
    Document   : Session2
    Created on : 2018/01/23, 10:56:18
    Author     : sitak
--%>

<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%HttpSession sh= request.getSession();
String a= "";
if((String) sh.getAttribute("UserName")!=null){
    a=(String) sh.getAttribute("UserName");
}
String c =""; 
if((String) sh.getAttribute("UserSyumi")!=null){c=(String) sh.getAttribute("UserSyumi");}
//String b,d = "";

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <%-- String namae = "man"; 
       <c:if test = "${namae='man'}">--%>
      
        
        
        
        
        <form action = "/JavaKiso/Session2_1" method = "post">
            
<!--      <%--<c:if test = "">
            名前…<input type = "text" name = "namae" value = "ここに名前">
          </c:if>--%>
        -->
           
           
         
         <%// String b = (String) sh.getAttribute("Userjender");%>
         
         
         
         <%--<% if(a.equals("")){b=""; }else{b=a}; %>
         <% if(c.equals("")){d=""; }else{d=c}; %>--%>
                 
         
         名前…<input type = "text" name = "namae" value ="<%=a%>"> 
            
            男性<input type = "radio" name = "seibetu" <c:if test = "${Userjender ==0}"> checked </c:if>  value = "0">
            女性<input type = "radio" name = "seibetu" <c:if test = "${Userjender ==1}" > checked </c:if> value = "1">
           
            
            趣味…<input type = "text" name = "syumi" value = "<%=c%>">
           
            <input type = "submit" name = "botan">
       <%--     <input type="text" name ="araiName" value ='<%= myVal %>'>
                      <input type="text" name ="araiName" value ='<% out.print(myVal); %>'>--%>
      </form>
    </body>
</html>
