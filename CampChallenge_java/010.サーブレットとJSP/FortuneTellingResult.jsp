<%-- 
    Document   : FortuneTellingResult
    Created on : 2017/12/25, 11:04:24
    Author     : sitak
--%>
<%@page import="org.mypackage.sumple.ResultData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ResultData data = (ResultData)request.getAttribute("DATA");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
              if(data!=null){
                    out.print("<h1>あなたの"+"<br>"+data.getD()+"<br>"+"の運勢は"+"<br>"+data.getLuck()+"です！</h1>");
              }              

            %>
        </h1>
    </body>
</html>
