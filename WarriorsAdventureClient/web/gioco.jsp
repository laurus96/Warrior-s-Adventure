<%-- 
    Document   : gioco
    Created on : 4-gen-2020, 15.47.10
    Author     : laurus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="session_character" class="ejb.Personaggio"></jsp:useBean>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Warrior's Adventure</title>
        
        <link rel="stylesheet" type="text/css" href="css/gioco.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Warrior's Adventure</title>
        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="javascript/marketLoad.js"></script>
        <script src="javascript/onlineList.js"></script>
        <script src="javascript/notify.js"></script>
        <!--
        <script src="javascript/buttonGame.js"></script>
        -->
        <script src="javascript/combatScript.js"></script>
        
    </head>
    <body>
        <div class="ussa">
            <h1 class="username">${character.name}</h1>
            <form action="LogoutServlet", method="post">
                <input type="submit" value="Logout" class="logout">
            </form>
            <form action="SaveServlet", method="post">
                <input type="submit" value="Salvataggio" class="save">
            </form>
            <h1 class="saldo">Saldo: ${character.gold} G</h1>

            <%String status_save = (String) session.getAttribute("status_save");
            if(status_save != null){
                session.removeAttribute("status_save");
                if(status_save.compareTo("FAIL") == 0){%>-->
                    <p id="login" class="save_alert">Salvataggio non effettuato.</p>  
                <%}
                if(status_save.compareTo("PASS") == 0){
                    session.removeAttribute("status_save");%>
                    <p id="login" class="save_alert">Salvataggio correttamente effettuato.</p> 
                <%}%>
            <%}%>
        </div>
        <div class="fight">
            <h1 class="logcombat">Log Combattimento:</h1>
            <div class="textarea">
            <p id="combatLog" class="text"></p>
            </div>
        </div>
        <div class="onpl">
            <h1 class="onlineplayer"> Giocatori online:</h1>
            <div class="onlinelist">
                <table class="ontable">
                    <!--
                    <tr><td class="td">Tempesta58</td><td><form action=""><input class="fightbutton" type="button" value="Fight"></form></td></tr>
                    <tr><td class="td">Laurus</td><td><form action=""><input class="fightbutton" type="button" value="Fight"></td></tr>
                    -->
                </table>
            </div>
        </div>
        <div class="notify">
            <h1 class="notifytitle"> Notifiche:</h1>
            <div class="notifylist">
                <table class="notifytable">
                    <!--
                    <tr><td class="td">Vittorio scarano ti ha invitato al combattimento</td><td><form action=""><input class="notifybutton" type="button" value="Accept"></form></td></tr>
                    <tr><td class="td">Laurus ti ha invitato a un gilda</td><td><form action=""><input class="notifybutton" type="button" value="Accept"></form></td></tr>
                    <tr><td class="td">Laurus ti ha invitato a un torneo</td><td><form action=""><input class="notifybutton" type="button" value="Accept"></form></td></tr>
                -->
                </table>
            </div>
        </div>
        <div class="market">
            <h1 class="markettitle"> Mercato:</h1>
            <div class="marketlist">
                <table class="markettable">
                    <!--
                    <tr><td class="td">Spada LV5 <b>200G</b></td><td><form action=""><input class="marketbutton" type="button" value="Compra"></form></td></tr>
                    <tr><td class="td">Martello LV5 <b>200G</b></td><td><form action=""><input class="marketbutton" type="button" value="Compra"></form></td></tr>
                    <tr><td class="td">Scudo LV5 <b>200G</b></td><td><form action=""><input class="marketbutton" type="button" value="Compra"></form></td></tr>
                    -->
                </table>
                <%String status = (String) session.getAttribute("status_bought");
                if(status != null){
                    session.removeAttribute("status_bought");
                    if(status.compareTo("FAIL") == 0){%>
                        <p id="login" valign="bottom" class="market_alert">Saldo insufficiente o oggetto già acquistato.</p> 
                    <%}
                if(status.compareTo("PASS") == 0){
                    session.removeAttribute("status_bought");%>
                    <p id="login" class="market_alert">Acquisto effettuato.</p> 
                    <%}%>
                <%}%>
            </div>
        </div>
        <div class="buttonlist">
            <input id="attack" class="actionbuttonsx" type="button" value="Attacco">
            <input id="defense" class="actionbuttondx" type="button" value="Difesa">
            <input id="heals" class="actionbuttonsx" type="button" value="Cura">
            <input id="leave" class="actionbuttondx" type="button" value="Fuga">
        </div>
        <div class="stats">
            <h1 class="statstitle"> Statistiche:</h1>
            <div class="statslist">
                <table class="statstable">
                    <tr><td class="td"><b>Punti Vita base: ${character.baseVit},   Punti Vita: ${character.vitality} </b></td></tr>
                    <tr><td class="td"><b>Punti Forza base: ${character.baseStr},   Forza ${character.strenght} </b></td></tr>
                    <tr><td class="td"><b>Punti Difesa base: ${character.baseDef},   Difesa: ${character.defense}</b></td></tr>
                    <tr><td class="td"><b>Arma: ${character.arma}, Lv: ${character.weaponLv}, +${character.weaponStr} a Forza</b></td></tr>
                    <tr><td class="td"><b>Armatura: ${character.armatura}, Lv: ${character.armorLv}, +${character.armorStr} a Forza, +${character.armorDef} a Difesa, +${character.armorVit} a Vitalità</b></td></tr>
                    <tr><td class="td"><b>livello: ${character.livello}</b>(<b>${character.remainexp}EXP</b> per il prossimo livello)</td></tr>
                </table>
            </div>
        </div>
        <div class="mission">
            <h1 class="missiontitle"> Missioni: (prossimamente disponibile)</h1>
            <div class="missionlist">
                <table class="missiontable">
                    <tr><td class="td">Salva il principe Vittorio Scarano</td><td><form action=""><input class="missionbutton" type="button" value="Accept"></form></td></tr>
                    <tr><td class="td">Consegna la pizza all'uomo misterioso</td><td><form action=""><input class="missionbutton" type="button" value="Accept"></form></td></tr>
                    <tr><td class="td">Carro in fuga</td><td><form action=""><input class="missionbutton" type="button" value="Accept"></form></td></tr>
                </table>
            </div>
        </div>
    </body>
</html>
