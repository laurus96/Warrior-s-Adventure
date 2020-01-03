<%-- 
    Document   : ingresso.jsp
    Created on : 3-gen-2020, 16.12.42
    Author     : laurus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="session_user" class="Entity.Giocatore"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/ingresso.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="javascript/characterLoad.js"></script>


    </head>
<body>
    
    <h1 class="username">Nome Utente: ${player.username}</h1> 

    <div class="div1">
        <form action="">
            <input class="b1" type="button" value="Personaggio 1 Mago livello 10"><br>
            <input class="b2" type="button" value="Personaggio 2 Mago livello 10"><br>
            <input id="b3" class="b3" type="button" value="+">  
        </form>
        <div class="div2">
            <a class="a1"><b>Gilda:</b> (Presto disponibile)</a>
            <a class="a2"><b>Tornei:</b> (Presto disponibile)</a>
        </div>
    </div> 

    <!-- The Modal -->
    <div id="myModal" class="modal">
        <!-- Modal content -->
        <div class="modal-content">
            <span class="close">&times;</span>
            <form action="/action_page.php">
                <input class="im3" type="text" name="name" placeholder="Nome personaggio">
                <select class="im2"name="cars">
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
        var btn = document.getElementById("b3");

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
