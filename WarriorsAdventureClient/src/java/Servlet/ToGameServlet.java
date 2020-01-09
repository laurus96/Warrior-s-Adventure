/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import ejb.Giocatore;
import ejb.NotifyPlayerEJBService;
import ejb.OnlinePlayerEJBService;
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
public class ToGameServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/NotifyPlayerEJBService/NotifyPlayerEJB.wsdl")
    private NotifyPlayerEJBService service_2;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/OnlinePlayerEJBService/OnlinePlayerEJB.wsdl")
    private OnlinePlayerEJBService service_1;

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
        //ToGame
        
        synchronized(session){
            
            String username = request.getParameter("name_value");
            Giocatore logged_player = (Giocatore) session.getAttribute("player");

            
            Personaggio character = findCharacter(logged_player.getUsername(), username);
            
            inizialization(character.getId());
            
            addPlayer(logged_player, character);
            
            session.setAttribute("character", character);
            
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

    private Personaggio findCharacter(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.PersonaggioEJB port = service.getPersonaggioEJBPort();
        return port.findCharacter(arg0, arg1);
    }

    private void addPlayer(ejb.Giocatore arg0, ejb.Personaggio arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.OnlinePlayerEJB port = service_1.getOnlinePlayerEJBPort();
        port.addPlayer(arg0, arg1);
    }

    private void inizialization(java.lang.Long arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.NotifyPlayerEJB port = service_2.getNotifyPlayerEJBPort();
        port.inizialization(arg0);
    }

}
