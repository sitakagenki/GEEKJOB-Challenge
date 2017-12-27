/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
//import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sitak
 */
public class mesod7 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     ArrayList<String> MyData(String ID){
     
         if(ID=="GENKI"){
             
           ArrayList<String>Data1=new ArrayList<String>();
           
           for(String nakami:new String[]{"GENKI","志鷹元気","平成５年4月15日",null})
           Data1.add(nakami);
                          
           return Data1;
         
         }else if(ID=="hokkai"){
             
             ArrayList<String>Data2=new ArrayList<String>();
           
           for(String nakami:new String[]{"hokkai","北海　道","平成12年12月12日","北海道"})
           Data2.add(nakami);
                          
           return Data2;
         
           
         }else if(ID=="okinawa"){
             
             
             ArrayList<String>Data3=new ArrayList<String>();
           
           for(String nakami:new String[]{"okinawa","沖縄　県","平成8年8月8日","沖縄県"})
           Data3.add(nakami);
                          
           return Data3;
            
         }else{
              ArrayList<String>nothing=new ArrayList<String>();
         
            nothing.add("該当なし");
            
            return nothing;
            
         }
      }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */     
            //out.print(Arrays.toString(MyData("GENKI")));
            
            ArrayList<String>Data1=MyData("GENKI");
            ArrayList<String>Data2=MyData("hokkai");
            ArrayList<String>Data3=MyData("okinawa");
            
            ArrayList<String> hako=Data1;
            int b=0;
            
            for(int i=1;i<=3;++i){
                
                for(int j=1;j<=3;++j){
                
                    if(hako.get(j)==null){ continue; }
                    else{  out.print(hako.get(j)+"<br>");   }              
                    ++b;
                
                
                    if(b==3){hako=Data2;}
                    if(b==6){hako=Data3;}
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
