<%-- 
    Document   : JAVAkiso1-3
    Created on : 2017/12/19, 10:21:14
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
        <h1>
            <%  
                final int bace=10;
                int num=5;
                
                int tasizan=bace+num;
                int hikizan=bace-num;
                int kakezan=bace*num;
                int warizan=bace/num;
                
                out.print("10 +5="+tasizan+"  ");
                out.print("10 -5="+hikizan+"  ");
                out.print("10✕5="+kakezan+"  ");
                out.print("10÷5="+warizan+"  ");
                
            %>
        </h1>
    </body>
</html>
