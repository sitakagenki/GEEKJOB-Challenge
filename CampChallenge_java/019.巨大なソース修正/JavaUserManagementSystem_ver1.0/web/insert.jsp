<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="jums.UserDataBeans" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="insertconfirm" method="POST">
<%
    HttpSession hs = request.getSession();
    UserDataBeans UDB = new UserDataBeans();
    UDB = (UserDataBeans) hs.getAttribute("User"); 
  //最初の初期値
    String namename = "" ;
   // String yyyy = "" , mmmm = "" , dddd = "" ;
    String typeA = "" , typeB = "" , typeC = "" ;
    String telltell = "" ;
    String commentcomment = "" ;
    
    
    if(UDB != null){
    //とりあえず一回、「JavaBeans」の中の情報を取り出す。
    String name = UDB.getName();
    String Byear = UDB.getYear();
    String Bmonth = UDB.getMonth();
    String Bday = UDB.getDay();
    String type = UDB.getType();
    String tell = UDB.getTell();
    String comment = UDB.getComment();
    
    //それぞれの項目の初期値（Value値）を決定する。
    //項目に入力していない時、最初は空文字が入っているので、２回目以降の初期値は空文字かどうかで初期値を変更する。(__OK　か　NO__)
    
    String nameCheck = UDB.NameCheck(name);
   // String birthdayCheck = UDB.BirtndayCheck(Byear, Bmonth, Bday);
    String typeCheck = UDB.TypeCheck(type);
    String tellCheck = UDB.TellCheck(tell);
    String commentCheck = UDB.CommentCheck(comment);
    
   
    //まず、セッションに「UDBの”User”」が保存されているかどうか、「Null」でなければ、初期値を変える。
    //生年月日には、EL式をもちいる。
    if(UDB != null && nameCheck.equals("nameOK")){
        namename = name ;
     }
    
    
    if(UDB != null && typeCheck.equals("typeOK")){
      if(type.equals("1")){
        typeA = "checked";
      } else if(type.equals("2")){
        typeB = "checked" ;
      }else if(type.equals("3")){
        typeC = "checked" ;
      }
           
    }
    
    if(UDB != null && tellCheck.equals("tellOK")){
      telltell = tell ;
     }
    
    if(UDB != null && commentCheck.equals("commentOK")){
      commentcomment = comment ;
    }
   
    } 
%> 
    
       
        名前:
        <input type="text" name="name" value= "<%=namename%>">
        <br><br>
        
       
        
        生年月日:
        <select name="year">
            <option value="">----</option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>"> <%=i%> </option>
            <% } %>
         <%if(UDB != null ){ %>   
            <option value="${year}"selected>${year} 
         <%}%>
        </select>年
        
        <select name="month">
            <option value="">--</option>
            <%
            for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        <%if(UDB != null){ %>
        <option value = "${month}"selected>${month}
        <% } %>
        </select>月
        
        <select name="day">
            <option value="">--</option>
            <%
            for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        <% if(UDB != null){ %>
            <option value = "${day}"selected>${day}
        <% } %>
        </select>日
        <br><br>

        
                
        種別:
        <br>
        <input type="radio" name="type" value="1" <%=typeA%> >エンジニア<br>
        <input type="radio" name="type" value="2" <%=typeB%> >営業<br>
        <input type="radio" name="type" value="3" <%=typeC%> >その他<br>
        <br>

      
        電話番号:
        <input type="text" name="tell" value="<%=telltell%>">
        <br><br>

      
        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><%=commentcomment%></textarea><br><br>

        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
