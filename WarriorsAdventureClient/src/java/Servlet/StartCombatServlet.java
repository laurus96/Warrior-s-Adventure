/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;


import ejb.CombatCommonEJBService;
import ejb.Personaggio;
import ejb.PersonaggioEJBService;
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
public class StartCombatServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PersonaggioEJBService/PersonaggioEJB.wsdl")
    private PersonaggioEJBService service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CombatCommonEJBService/CombatCommonEJB.wsdl")
    private CombatCommonEJBService service;





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
            Personaggio session_ch = (Personaggio) session.getAttribute("character");
            long id_enemy = Long.parseLong(request.getParameter("id_enemy"));
            
            Personaggio enemy_ch = findByID(id_enemy);
            
            inizializationCombat(session_ch, enemy_ch);
            
            request.getRequestDispatcher("gioco.jsp").forward(request, response);
   
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

    private void inizializationCombat(ejb.Personaggio arg0, ejb.Personaggio arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.CombatCommonEJB port = service.getCombatCommonEJBPort();
        port.inizializationCombat(arg0, arg1);
    }

    private Personaggio findByID(long arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.PersonaggioEJB port = service_1.getPersonaggioEJBPort();
        return port.findByID(arg0);
    }

    private Personaggio findByID_1(long arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.PersonaggioEJB port = service_1.getPersonaggioEJBPort();
        return port.findByID(arg0);
    }

}
