<%-- 
    Document   : QueryString2_1
    Created on : 2018/01/21, 12:56:17
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
       <%
       request.setCharacterEncoding("UTF-8");
       
       String a = request.getParameter("innsuubunnkai");
       int b = Integer.parseInt(a.trim());
       
        int[] sosuu = {2,3,5,7,9};
       
        int zero=0,iti=0,ni=0,san=0,yon=0;
        int i = 0;
        while(i<5){  
          while(b%sosuu[i]==0){
                 b/=sosuu[i];
                 if(i==0){ zero++;}
                 else if(i==1){iti++;}
                 else if(i==2){ni++;}
                 else if(i==3){san++;}
                 else if(i==4){yon++;}
             }
          ++i;
        }
         out.println("元の数字は"+a+"で、素数2を"+zero+"個、素数3を"+iti+"個、素数5を"+ni+"個、素数７を"+san+"個、素数９を"+yon+"個、持ちます。");
         out.println("残りの数は、"+b+"です");
           
        
       
       %>
    </body>
</html>
