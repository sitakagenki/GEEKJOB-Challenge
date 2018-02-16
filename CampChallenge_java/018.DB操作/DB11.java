/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageDB;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 *
 * @author sitak
 */
public class DB11 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");
        //フォームで更新する値を受け取る    
           
            String name = request.getParameter("name");
            String nametrim = name.trim();
            
            String age = request.getParameter("age");
            String agetrim = age.trim();
            int ageint = Integer.parseInt(agetrim);
            
            String birthday = request.getParameter("birthday");
            String birthdaytrim = birthday.trim();
            
          //受け取った値で、dbに反映させる。
          
              Connection dbcon = null;
             PreparedStatement dbps = null;
             ResultSet dbrs = null;
          try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","GENKIJOB","sitakagenki");
            
            dbps = dbcon.prepareStatement("select * from profiles where name = ? and age = ? and birthday = ?");
            dbps.setString(1,nametrim);
            
            dbps.setInt(2,ageint);
            dbps.setString(3,birthdaytrim);
         
            
            
            dbrs = dbps.executeQuery();
                
         //
           //更新後の、テーブルの情報を出力する.
            
            while(dbrs.next()){
              out.println("ID…"+dbrs.getInt("profilesID")+"<br>");
              out.println("名前…"+dbrs.getString("name")+"<br>");
              out.println("電話番号…"+dbrs.getString("tel")+"<br>");
              out.println("年齢…"+dbrs.getInt("age")+"<br>");
              out.println("誕生日…"+dbrs.getDate("birthday")+"<br>");
            
            
            }
                
            
          }catch(Exception e){
            System.out.println("エラー"+e.getMessage());
          }finally{
            try{
               dbcon.close();
               dbps.close();
               dbrs.close();
                
               
            }catch(Exception ee){
               out.println("クローズエラー"+ee.getMessage());
            }
          
          }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
