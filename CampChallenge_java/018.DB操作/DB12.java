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
import javax.servlet.http.HttpSession;
/**
 *
 * @author sitak
 */
public class DB12 extends HttpServlet {

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
         //ログイン画面の情報を、loginテーブルで確認する。
         
         request.setCharacterEncoding("UTF-8");
         String name =  request.getParameter("name");
         String nametrim = name.trim();
         
         String ID = request.getParameter("ID");
         String IDtrim = ID.trim();
         
         Connection dbcon = null;
         PreparedStatement dbps = null;
         ResultSet dbrs = null;
         
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","GENKIJOB","sitakagenki");
            
            dbps = dbcon.prepareStatement("select * from login where LoginName = ? and LoginPass = ?");
            dbps.setString(1,nametrim);
            dbps.setString(2,IDtrim);
            
            dbrs = dbps.executeQuery();
            
           //ログイン画面で入力した「ログイン名」と「ログインID」が、MYSQL上の「loginテーブル」にあれば、ページ遷移する
           if(dbrs.next()){
               
            
          //ログイン名とログインIDが正しく指定されているか、DBに問い合わせ、問い合わせがされた名前を呼び出し、セッション
          //スコープに保存する。
           
            HttpSession session = request.getSession();
            session.setAttribute("User",nametrim);
            
            response.sendRedirect("DB12-2.jsp");
           }else{
            out.println("ログイン名あるいは、ログインIDが間違っています。");
           }
        
           
        }catch(Exception e){
         out.println("errar"+e.getMessage());
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
