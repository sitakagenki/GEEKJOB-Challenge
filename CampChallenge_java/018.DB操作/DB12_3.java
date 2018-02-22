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
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import packageDB.DB_GENKIJOB;
import java.util.ArrayList;

/**
 *
 * @author sitak
 */
public class DB12_3 extends HttpServlet {
    //DB12-2.jspから送られてきたフォーム情報を、一覧表示なら「doget」この場合、処理を下に書いているので「processRequest」
    //は呼ばれない。
    //商品登録情報が送られてきた場合、「depost」で送信されているので、その処理を「processRequest」に書いています。

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

        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();

        if (session.getAttribute("User") != null) {
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                String productName = request.getParameter("productName");
                String producttrim = productName.trim();

                String stock = request.getParameter("stock");
                String stocktrim = stock.trim();
                int stockint = Integer.parseInt(stocktrim);

                Connection dbcon = null;
                PreparedStatement dbps = null;
                //ResultSet dbrs = null;

                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db", "GENKIJOB", "sitakagenki");

                    if (productName != null && stock != null) {

                        dbps = dbcon.prepareStatement("insert into stock values (?,?)");
                        dbps.setString(1, producttrim);
                        dbps.setInt(2, stockint);

                        int i = 0;
                        i = dbps.executeUpdate();

                        RequestDispatcher rd = request.getRequestDispatcher("/DB12-4.jsp");
                        rd.forward(request, response);
                    }

                } catch (Exception e) {
                    out.println("errar" + e.getMessage());
                } finally {
                    try {

                        dbcon.close();
                        dbps.close();
                        // dbrs.close();

                    } catch (Exception ee) {

                        out.println("クローズエラー" + ee.getMessage());;

                    }

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
        //processRequest(request, response);

        request.setCharacterEncoding("UTF-8");

        //DB_GENKIJOB genki = new DB_GENKIJOB();
        ArrayList<DB_GENKIJOB> al_genki = new ArrayList<DB_GENKIJOB>();

        Connection dbcon = null;
        PreparedStatement dbps = null;
        ResultSet dbrs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_DB", "GENKIJOB", "sitakagenki");

            //商品一覧ボタンで、商品一覧を表示する。
            dbps = dbcon.prepareStatement("select * from stock");
            dbrs = dbps.executeQuery();
            
            
            while (dbrs.next()) {

                //自作のクラスをどのような方法で、ArrayListに入れればよいか。 
                // genki.setGENKIJOB(dbrs.getString("product"), dbrs.getInt("stock"));
                
                DB_GENKIJOB dbGenki = new DB_GENKIJOB();
                
                dbGenki.setProduct(dbrs.getString("product"));
                dbGenki.setStock(dbrs.getInt("stock"));

                //  genki.GENKIJOB(dbrs.getString("product"),dbrs.getInt("stock"));
                 al_genki.add(dbGenki);
            }

           

            HttpSession session = request.getSession();
            session.setAttribute("itiran", al_genki);

//            RequestDispatcher rd = request.getRequestDispatcher("/DB12-6.jsp");
//            rd.forward(request, response);
             response.sendRedirect("/Web1/DB12-6.jsp");

            // テスト　response.sendRedirect("/Web1/DB12-1.jsp");
        } catch (Exception e) {

            System.out.println("エラー" + e.toString());

        } finally {

            try {
                dbcon.close();
                dbps.close();
                dbrs.close();

            } catch (Exception ee) {

                System.out.println("クローズエラー" + ee.getMessage());

            }
        }

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
