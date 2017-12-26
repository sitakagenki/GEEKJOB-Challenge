/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sitak
 */
@WebServlet(urlPatterns = {"/mesod6"})
public class mesod6 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
      String[] MyData(String ID){
     
         if(ID=="GENKI"){
             
           String[]Data1={"GENKI","志鷹元気","平成５年4月15日","杉並区"};        
           
           return Data1;
         
         }else if(ID=="hokkai"){
         
            String[]Data2={"hokkai","北海　道","平成12年12月12日","北海道"};
            
            return Data2;
         
         }else if(ID=="okinawa"){
            
            String[]Data3={"okinawa","沖縄　県","平成8年8月8日","沖縄県"};
            
            return Data3;
            
         }else{
         
            String[] nothing={"該当なし"};
            
            return nothing;
            
         }
      }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String ID="hokkai";
            
            if(ID=="GENKI"){
                   
                     String[]a=MyData("GENKI");
                     out.print(a[1]+"<br>"+a[2]+"<br>"+a[3]);
            
            }else if(ID=="hokkai"){
                
                     String[]b=MyData("hokkai");
                    out.print(b[1]+"<br>"+b[2]+"<br>"+b[3]);
                    
            }else if(ID=="okinawa"){
                
                    String[]c=MyData("okinawa");
                    out.print(c[1]+"<br>"+c[2]+"<br>"+c[3]);
            }
      
            
            
            
//            String ID="hokkai";
//            
//            if(ID=="GENKI"){
//            
//                out.println(MyData("GENKI"));
//            
//            }else if(ID=="hokkai"){
//            
//                out.println(MyData("hokkai"));
//                
//            }else if(ID=="okinawa"){
//            
//                out.println(MyData("okinawa"));
//                
//            }else {
//            
//                out.println(MyData("nothing"));
//                
//            }           
                   
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
