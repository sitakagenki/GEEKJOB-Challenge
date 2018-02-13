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
public class DB1 {
    public static void main (String[] args){
        
    
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
     try{
         
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           
           db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","GENKIJOB","sitakagenki");
           
           
               System.out.println("接続できました。");
           
           //接続エラーが発生した場合の処理
     }catch(Exception e){
               System.out.println("error");
     
     }
        
    
    }
}
