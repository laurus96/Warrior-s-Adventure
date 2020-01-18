<%-- 
    Document   : registration
    Created on : 3-gen-2020, 12.14.17
    Author     : laurus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registrazione</title>
        <link rel="stylesheet" type="text/css" href="css/login_reg.css">
    </head>
    <body>  
        <div>
            <h1>Registrazione</h1> 
            <form action="RegistrationServlet" method="post">
                <input type="text" placeholder="Username" name="username" required><br>

                <input type="text" placeholder="E-mail" name="email" required><br>
                
                <input type="password" placeholder="Password" name="password" required><br>
                
                <input type="password" placeholder="Re-Password" name="repassword" required><br>

                
                <input class="button" type="submit" value="Registrati"><br>
            </form>
            <%String status = (String) session.getAttribute("status");
            if(status != null){
                session.removeAttribute("status");
                if(status.compareTo("FE_UN") == 0){%>
                    <p id="login" class="login_alert_reg">L'username deve contenere solo lettere e numeri e deve essere compreso tra 5 e 20 caratteri.</p>   
                <%}
                if(status.compareTo("FE_PW") == 0){%>
                    <p id="login" class="login_alert_reg">La password deve contenere un carattere maiuscolo, un carattere speciale e almeno un numero e il tutto compreso tra 8 e 16 caratteri.</p> 
                <%}
                if(status.compareTo("FE_EM") == 0){%>
                    <p id="login" class="login_alert_reg">Formato email non valido.</p> 
                <%}
                if(status.compareTo("DE_UN") == 0){%>
                    <p id="login" class="login_alert_reg">Username già utilizzato.</p> 
                <%}
                if(status.compareTo("DE_EM") == 0){%>
                    <p id="login" class="login_alert_reg">Email già utilizzata.</p> 
                <%}
                if(status.compareTo("PW_MS") == 0){%>
                    <p id="login" class="login_alert_reg">Le password non corrispondono.</p> 
                <%}
            }%>
        </div>
    </body>
</html>
