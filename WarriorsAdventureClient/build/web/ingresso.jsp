<%-- 
    Document   : ingresso.jsp
    Created on : 3-gen-2020, 16.12.42
    Author     : laurus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="session_user" class="ejb.Giocatore"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <title>Ingresso</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/ingresso.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="javascript/characterLoad.js"></script>


    </head>
<body>
    <div class="usemlo">
        <h1 class="username">${player.username}</h1>
        <h1 class="email">${player.email}</h1> 
        <form action="LogoutServlet", method="post">
            <input type="submit" value="Logout" class="logout">
        </form>
    </div>
    <div class="div1">

        <table class="chars">
 
        </table>

        <input id="b4" class="b4" type="button" value="+">  

        <div class="div2">
            <a class="a1"><b>Gilda:</b> (Presto disponibile)</a>
            <a class="a2"><b>Tornei:</b> (Presto disponibile)</a>
            <a class="a3"><b>Il gioco non dispone della funzione di autosalvataggio, ricordati di salvare !</b></a>
        </div>

        <%String status = (String) session.getAttribute("status_c");
        if(status != null){
            session.removeAttribute("status_c");
            if(status.compareTo("L3C") == 0){%>
                <p id="login" class="ing_alert">Limite massimo di personaggi raggiunto.</p>  
            <%}
            if(status.compareTo("PASS") == 0){%>
                <p id="login" class="ing_alert">Personaggio correttamente creato.</p> 
            <%}
            if(status.compareTo("FE_NA") == 0){%>
                <p id="login" class="ing_alert">Il nome del personaggio può contenere solo lettere al suo interno.</p> 
            <%}%>
        <%}%>
    </div> 

    <!-- The Modal -->
    <div id="myModal" class="modal">
        <!-- Modal content -->
        <div class="modal-content">
            <span class="close">&times;</span>
            <form action="CharacterCreationServlet"  method="post">
                <input class="im3" type="text" name="name" placeholder="Nome personaggio">
                <select class="im2"name="classe">
                    <option value="Guerriero">Guerriero</option>
                    <option value="Paladino">Paladino</option>
                    <option value="Cavaliere">Cavaliere</option>
                </select>
                <input class="im" type="submit" value="Crea">
            </form> 
        </div>
    </div>

    <script>
        // Get the modal
        var modal = document.getElementById("myModal");

        // Get the button that opens the modal
        var btn = document.getElementById("b4");

        // Get the <span> element that closes the modal
        var span = document.getElementsByClassName("close")[0];

        // When the user clicks the button, open the modal 
        btn.onclick = function() {
            modal.style.display = "block";
        }

        // When the user clicks on <span> (x), close the modal
        span.onclick = function() {
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
