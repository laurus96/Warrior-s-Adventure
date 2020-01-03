<%-- 
    Document   : ingresso.jsp
    Created on : 3-gen-2020, 16.12.42
    Author     : laurus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresso</title>
        <link rel="stylesheet" type="text/css" href="css/ingresso.css">

    </head>
    <body>
        <% String player = (String) session.getAttribute("player"); %>
        <h1 class="username">Nome Utente: ${player}</h1> 
        <div class="div1">
            <form action="">

                <input class="b1" type="button" value="Personaggio 1 Mago livello 10"><br>
                <input class="b2" type="button" value="Personaggio 2 Mago livello 10"><br>
                <input class="b3" type="button" value="+">  
            </form>
            <div class="div2">
                <a class="a1"><b>Gilda:</b> (Funzionalita non ancora implementata)</a>
                <a class="a2"><b>Tornei:</b> (Funzionalita non ancora implementata)</a>
            </div> 
        </div>

        
    </body>
</html>
