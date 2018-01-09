<%-- 
    Document   : JAVAkiso1-5
    Created on : 2017/12/19, 12:54:25
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
                int a=1;
                
                for (int i=1;i<=3;i++){
                
                if(a==1){  
                    out.print("1です！  ");
                }else if(a==2){  
                    out.print("プログラミングキャンプ！  ");
                }else{
                    out.print("その他です");
                }
                
                ++a;
                
                }
            %>
        </h1>
    </body>
</html>
