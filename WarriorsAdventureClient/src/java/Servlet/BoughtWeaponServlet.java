/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import ejb.Arma;
import ejb.ArmaEJBService;
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
public class BoughtWeaponServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ArmaEJBService/ArmaEJB.wsdl")
    private ArmaEJBService service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PersonaggioEJBService/PersonaggioEJB.wsdl")
    private PersonaggioEJBService service;

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
            long id = Long.parseLong(request.getParameter("id_value"));
            Personaggio session_player = (Personaggio) session.getAttribute("character");
            
            session_player = boughtWeapon(session_player, findWeaponsBylv(id));
            
            if(session_player == null){
                session.setAttribute("status_bought", "FAIL" );
                request.getRequestDispatcher("gioco.jsp").forward(request, response);

            } else {
                session.setAttribute("status_bought", "PASS" );
                session.setAttribute("character", session_player);
                request.getRequestDispatcher("gioco.jsp").forward(request, response);
                
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

    private Personaggio boughtWeapon(ejb.Personaggio arg0, ejb.Arma arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.PersonaggioEJB port = service.getPersonaggioEJBPort();
        return port.boughtWeapon(arg0, arg1);
    }

    private Arma findWeaponsBylv(long arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.ArmaEJB port = service_1.getArmaEJBPort();
        return port.findWeaponsBylv(arg0);
    }

    

    
}
