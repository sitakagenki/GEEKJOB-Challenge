/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageDB;
import java.sql.*;
/**
 *
 * @author sitak
 */
public class DB5 {
    public static void main (String[] args){
    
        Connection dbcon = null;
        PreparedStatement dbps = null;
        ResultSet dbrs = null ;
    
       try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","GENKIJOB","sitakagenki");
        
        dbps = dbcon.prepareStatement("select * from profiles where name like ?");
        dbps.setString(1,"%茂%");
        
        dbrs = dbps.executeQuery();
        
        while(dbrs.next()){
          System.out.println("ID"+dbrs.getInt("profilesID"));
          System.out.println("名前"+dbrs.getString("name"));
          System.out.println("電話"+dbrs.getString("tel"));
          System.out.println("年齢"+dbrs.getInt("age"));
          System.out.println("誕生日"+dbrs.getDate("birthday"));
        }
        
       }catch(Exception e){
        System.out.println("エラー");
       
       }finally{
        try{
         dbcon.close();
         dbps.close();
         dbrs.close();
        
        }catch(Exception ee){
         System.out.println("クローズエラー");
        
        }
       
       }
    }
}
