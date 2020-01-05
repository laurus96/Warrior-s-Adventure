<%-- 
    Document   : amministratore
    Created on : 4-gen-2020, 11.25.39
    Author     : laurus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amministratore</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="javascript/playerBanListLoad.js"></script>
        <script src="javascript/playerListLoad.js"></script>
        <link rel="stylesheet" type="text/css" href="css/amministratore.css">


    </head>
    <body>
        <%String status_ban = (String) session.getAttribute("status_ban");
            if(status_ban != null){
                if(status_ban.compareTo("ER_BAN") == 0){
                    session.removeAttribute("status_ban");%>
                        <script>
                            alert("Giocatore non bannato");
                        </script>    
                <%}
                if(status_ban.compareTo("BAN_OK") == 0){
                    session.removeAttribute("status_ban");%>
                        <script>
                            alert("Giocatore bannato");
                        </script>    
                <%}%>
            <%}%>
            
            <%String status_unban = (String) session.getAttribute("status_unban");
            if(status_unban != null){
                if(status_unban.compareTo("ER_BAN") == 0){
                    session.removeAttribute("status_unban");%>
                        <script>
                            alert("Impossibile eiminare il ban");
                        </script>    
                <%}
                if(status_unban.compareTo("BAN_OK") == 0){
                    session.removeAttribute("status_unban");%>
                        <script>
                            alert("Ban al giocatore eliminato");
                        </script>    
                <%}%>
            <%}%>
        
            <%String status_rm = (String) session.getAttribute("status_rm");
            if(status_rm != null){
                if(status_rm.compareTo("PASS") == 0){
                    session.removeAttribute("status_rm");%>
                        <script>
                            alert("Giocatore Rimosso");
                        </script>    
                <%}%>
            <%}%>

        
        <div class="tp">
            <div class="usdiv">
                <h1 class="username">Nome Amministratore</h1>
            </div>
            <div class="tablediv">
                <a class="lista">Giocatori Registrati:</a>
                <table class="table">
                    <!--
                    <tr><td class="name">Laurus</td><form action=""><td class="butd"><input type="button" value="Cancella"></td><td><input type="button" value="Promuovi (NI)"></td></form></tr>
                    <tr><td class="name">ZeroRonin</td><form action=""><td class="butd"><input type="button" value="Cancella"></td><td><input type="button" value="Promuovi (NI)"></td></form></tr>
                    <tr><td class="name">VitScar</td><form action=""><td class="butd"><input type="button" value="Cancella"></td><td><input type="button" value="Promuovi (NI)"></td></form></tr>
                    -->
                </table> 
                <input class="buttonBanList" type="button" id="b3" value="Visualizza Giocatori Bannati">
                
                <form action="LogoutServlet", method="post">
                    <input type="submit" value="Logout" class="logout">
                </form>
            </div>
        </div>
        <!-- The Modal -->
        <div id="myModal" class="modal">
            <!-- Modal content -->
            <div class="modal-content">
                <span class="close">&times;</span>
                <table class="table2">
                    <!--
                    <tr><td class="name">Nome utente</td></tr>
                    <tr><td class="name">Funzionalita presto disponibile</td></tr>
                    -->
                </table>
            </div>
        </div>

        <script>
            // Get the modal
            var modal = document.getElementById("myModal");

            // Get the button that opens the modal
            var btn = document.getElementById("b3");

            // Get the <span> element that closes the modal
            var span = document.getElementsByClassName("close")[0];

            // When the user clicks the button, open the modal 
            btn.onclick = function() {
                modal.style.display = "block";
            }

            // When the user clicks on <span> (x), close the modal
            span.onclick = function() {
                $(".table2").empty();
                modal.style.display = "none";
            }

            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function(event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
    </body>
</html>
