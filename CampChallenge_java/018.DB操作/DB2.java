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
       // ResultSet db_data = null;
        
     try{
         
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           
           db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","GENKIJOB","sitakagenki");
           
           
              // System.out.println("接続できました。");
           db_st = db_con.prepareStatement("insert into profiles values(?,?,?,?,?)");
           db_st.setInt(1,6);
           db_st.setString(2,"志鷹元気");
           db_st.setString(3,"090-1234-567");
           db_st.setInt(4,24);
           db_st.setString(5,"1993-04-15");
           
         int  i = db_st.executeUpdate();
           
          // db_st= db_con.prepareStatement("select * from profiles");
           
          // db_data = db_st.executeQuery();
           
           System.out.print("書き込み完了");
           
          
           //接続エラーが発生した場合の処理
     }catch(SQLException e_sql){
               System.out.println("SQL error");
     }catch(Exception e){
               System.out.println("error");
     
     }finally{
         if(db_con != null){ 
           try{ 
               db_con.close();
               db_st.close();
              // db_data.close();
               System.out.println("クローズ完了");
            }catch(Exception e){
               System.out.println("クローズエラー");
            }
         }
         }
        
    
    }
}
