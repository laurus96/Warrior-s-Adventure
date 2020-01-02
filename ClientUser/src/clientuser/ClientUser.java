/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientuser;

import webservices_client.Giocatore;

/**
 *
 * @author laurus
 */
public class ClientUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println(registration("Laurus", "Ciao@ciao12", "lorenzo.cocchinone@gmail.com"));
        if(login("Lau12367rus", "Ciao@ciao12") == null)
            System.out.println("Username o password errati");
        
    }

    private static String registration(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        webservices_client.LoginRegistrationEJBService service = new webservices_client.LoginRegistrationEJBService();
        webservices_client.LoginRegistrationEJB port = service.getLoginRegistrationEJBPort();
        return port.registration(arg0, arg1, arg2);
    }

    private static Giocatore login(java.lang.String arg0, java.lang.String arg1) {
        webservices_client.LoginRegistrationEJBService service = new webservices_client.LoginRegistrationEJBService();
        webservices_client.LoginRegistrationEJB port = service.getLoginRegistrationEJBPort();
        return port.login(arg0, arg1);
    }
    
}
