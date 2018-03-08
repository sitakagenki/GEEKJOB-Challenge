<%@page import="java.util.Objects"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans"%>
<%  
    //セッションに登録した、「JavaBeans」を取り出し、チェックメソッドで「NO＿＿」が出れば、出力する。
    
    HttpSession hs = request.getSession();
    UserDataBeans UDB = new UserDataBeans();   
    UDB = (UserDataBeans)hs.getAttribute("User");
    
    String name = UDB.getName();
    String year = UDB.getYear() , month = UDB.getMonth() , day = UDB.getDay() ;
    String type = UDB.getType();
    String tell = UDB.getTell();
    String comment = UDB.getComment();
    
    String nansuka =UDB.NameCheck(name);
    
    //未入力項目があれば、変数aに１を足す。
    int a = 0 , b = 0 , c = 0 , d = 0 , e = 0;
    
   if(UDB.NameCheck(name).equals("NOname")){
       String N = "名前が入力されていません。" ;
       hs.setAttribute("n",N);
       a += 1 ;
   }
   if(UDB.BirthdayCheck(year , month , day).equals("NObirthday") ){
      String B = "誕生日が入力されていません。" ;
      hs.setAttribute("b",B);
      b += 1 ;
   }
   if(UDB.TypeCheck(type).equals("NOtype")){
     String Ty = "種別が入力されていません。" ;
     hs.setAttribute("t",Ty);
     c += 1 ;
   }
   if(UDB.TellCheck( tell).equals("NOtell")){
     String Te ="電話番号が入力されていません。" ;
     hs.setAttribute("te",Te);
     d += 1 ;
   }
   if(UDB.CommentCheck(comment).equals("NOcomment")){
     String Co = "コメント欄が入力されていません。" ;
     hs.setAttribute("co",Co);
     e += 1 ;
   }
  
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
    
        <h1>登録確認</h1>
        名前:<%= hs.getAttribute("name")%><br>
        生年月日:<%= hs.getAttribute("year")+"年"+hs.getAttribute("month")+"月"+hs.getAttribute("day")+"日"%><br>
        種別:<%= hs.getAttribute("type")%><br>
        電話番号:<%= hs.getAttribute("tell")%><br>
        自己紹介:<%= hs.getAttribute("comment")%><br>
              
        
                  
      <% if(a == 1){ %>  ${n}<br>   <% } %>
      <% if(b == 1){ %>  ${b}<br>   <% } %>
      <% if(c == 1){ %>  ${t}<br>   <% } %>
      <% if(d == 1){ %>  ${te}<br>  <% } %>
      <% if(e == 1){ %>  ${co}<br>  <% } %>
       
        
         <% if(a == 1 || b == 1 || c ==1 || d == 1 || e == 1){%>
              <h3>登録内容に不備があります。全項目欄の記入をお願いします。</h3>
               <form action="insert" method="POST">
                 <input type="submit" name="no" value="登録画面に戻る">       
               </form>
               <br>
        <%   }else{ %>                          
               <h3>上記の内容で登録します。よろしいですか？</h3>
               <form action="insertresult" method="POST">
                  <input type="submit" name="yes" value="はい">
            
                 <input type = "hidden" name = "ac" value = "<%=hs.getAttribute("ac") %>">
              </form>
        <%  } %>    
        <%=JumsHelper.getInstance().home() %>  
              
       
        
    </body>
</html>
