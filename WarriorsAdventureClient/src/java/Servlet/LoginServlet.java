/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import ejb.Amministratore;
import ejb.AmministratoreEJBService;
import ejb.Giocatore;
import ejb.GiocatoreEJBService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author laurus
 */
public class LoginServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AmministratoreEJBService/AmministratoreEJB.wsdl")
    private AmministratoreEJBService service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/GiocatoreEJBService/GiocatoreEJB.wsdl")
    private GiocatoreEJBService service;


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
        
        HttpSession session = request.getSession();
        
        synchronized(session){
            String username = request.getParameter("username").toLowerCase();
            String password = request.getParameter("password");
            
            //Check if amministrator has logged
            Amministratore trylog = logginAmministratore(username, password);
            
            if(trylog != null){
                session.setAttribute("amministratore", trylog);
                request.getRequestDispatcher("amministratore.jsp").forward(request, response);
            }
            else{
                ejb.Giocatore logged = login(username, password);
                
                if(logged != null && logged.isBan()){
                    session.setAttribute("login", "BAN");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            
                else if(logged != null && !logged.isBan()){
                    session.setAttribute("player", logged);
                    request.getRequestDispatcher("ingresso.jsp").forward(request, response);
                }
                
                else{
                    session.setAttribute("login", "FAIL");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
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

    private Giocatore login(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.GiocatoreEJB port = service.getGiocatoreEJBPort();
        return port.login(arg0, arg1);
    }

    private ejb.Amministratore logginAmministratore(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.AmministratoreEJB port = service_1.getAmministratoreEJBPort();
        return port.logginAmministratore(arg0, arg1);
    }
    
    
}
