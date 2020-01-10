/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import com.google.gson.Gson;
import ejb.CombatCommonEJBService;
import ejb.Personaggio;
import ejb.PersonaggioEJBService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
public class FightServlet extends HttpServlet {

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
            
            session_ch = (Personaggio) findByID(session_ch.getId());
            
            session.setAttribute("character", session_ch);
  
            
            String val = request.getParameter("val");
            List<String> result = new ArrayList<>();
            
            Long win = winner(session_ch.getCombatKey());
            
            if(-1L == win ){
                if(val.compareTo("atk") == 0){
                    result = attack(session_ch);
                }else if(val.compareTo("def") == 0){
                    result = defense(session_ch);

                }else if(val.compareTo("hls") == 0){
                    result = heals(session_ch);

                }else if(val.compareTo("lev") == 0){
                    result = leave(session_ch);

                }
                
            }else {
                String vincitore = findByID(win).getName();
                result.clear();
                
                result.add("Lo scontro è terminato");
                result.add("</br> <b>" + vincitore + "</b> ha vinto lo scontro, guadagna <b>" + 200 + " EXP</b> e <b>" + 150 + "GOLD </b>.");
                fineDuello(findByID(win));

                
            }

            PrintWriter out = response.getWriter();
            
            String json = new Gson().toJson(result);
            
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out.print(json);
            out.flush();
            
            
            
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



    private Personaggio findByID(long arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.PersonaggioEJB port = service_1.getPersonaggioEJBPort();
        return port.findByID(arg0);
    }

    private Long winner(java.lang.Long arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.CombatCommonEJB port = service.getCombatCommonEJBPort();
        return port.winner(arg0);
    }

    private java.util.List<java.lang.String> attack(ejb.Personaggio arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.CombatCommonEJB port = service.getCombatCommonEJBPort();
        return port.attack(arg0);
    }

    private java.util.List<java.lang.String> defense(ejb.Personaggio arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.CombatCommonEJB port = service.getCombatCommonEJBPort();
        return port.defense(arg0);
    }

    private java.util.List<java.lang.String> heals(ejb.Personaggio arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.CombatCommonEJB port = service.getCombatCommonEJBPort();
        return port.heals(arg0);
    }

    private java.util.List<java.lang.String> leave(ejb.Personaggio arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.CombatCommonEJB port = service.getCombatCommonEJBPort();
        return port.leave(arg0);
    }

    private void fineDuello(ejb.Personaggio arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ejb.PersonaggioEJB port = service_1.getPersonaggioEJBPort();
        port.fineDuello(arg0);
    }

}
