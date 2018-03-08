

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;
import java.io.Serializable;

/**
 *
 * @author sitak
 */

//「insert.jsp」から、フォームでもらった情報を、「getParameter」で受け取って持ち回るクラス？
//フォームで受け取る「value値」は「String型」だから、このクラスで扱うのも「String型」？
//これの情報を基にして、「insertconfirm.jsp」で出力？

public class UserDataBeans implements Serializable{
    
    private String name;
    private String year;
    private String month;
    private String day;
    private String type;
    private String tell;
    private String comment;
    
    
    public String getName(){
      return name;
    }
    public void setName(String name){
      this.name = name;
    }
    public String getYear(){
      return year;
    }
    public void setYear(String year){
      this.year = year;
    }
    public String getMonth(){
      return month;
    }
    public void setMonth(String month){
      this.month = month;
    }
    public String getDay(){
      return day;
    }
    public void setDay(String day){
      this.day = day;
    }
    public String getType(){
      return type;    
    }
    public void setType(String type){
      this.type = type;
    }
    public String getTell(){
      return tell;
    }  
    public void setTell(String tell){
      this.tell =  tell;
    }
    public String getComment(){
       return comment;
    }
    public void setComment(String comment){
       this.comment = comment;
    }
    
    //オプション
    //各項目の内容が「未記入（空文字）」かどうかを判断する。
    
    public String NameCheck(String name ){   
        if(!name.equals("")){
          return "nameOK" ;
        }else{
          return "NOname";
        }   
    }
    public String BirthdayCheck(String year , String month , String day){
        if(year.equals("") || month.equals("") || day.equals("")){
          return "NObirthday";
        }else{
          return "birthdayOK";
        }
     }
    //種別は、入力しなければ、いずれの項目も選ばれない（nullかどうか）。
    public String TypeCheck(String type){
        if(type !=null){
          return "typeOK";
        }else{
          return "NOtype";
        }
    }
    
    public String TellCheck(String tell){
       if(!tell.equals("")){
          return "tellOK" ;
       }else{
          return "NOtell" ;
       } 
    }
    
    public String CommentCheck(String comment){
       if(!comment.equals("")){
          return "commentOK";
       }else{
          return "NOcomment";
       }
    }
    
}
