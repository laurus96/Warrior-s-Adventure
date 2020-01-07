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

    </head>
    <body>
        <div class="ussa">
            <h1 class="username">${character.name}</h1>
            <form action="LogoutServlet", method="post">
                <input type="submit" value="Logout" class="logout">
            </form>
            <%String status_save = (String) session.getAttribute("status_save");
            if(status_save != null){
                session.removeAttribute("status_save");
                if(status_save.compareTo("FAIL") == 0){%>
                        <script>
                            alert("Salvataggio non effettuato");
                        </script>
                    <%}
                if(status_save.compareTo("PASS") == 0){
                    session.removeAttribute("status_save");%>
                        <script>
                            alert("Salvataggio effettuato correttamente");
                        </script>
                    <%}%>
            <%}%>
            <form action="SaveServlet", method="post">
                <input type="submit" value="Salvataggio" class="save">
            </form>
            <h1 class="saldo">Saldo: ${character.gold} G</h1>
        </div>
        <div class="fight">
            <h1 class="logcombat">Log Combattimento:</h1>
            <div class="textarea">
            <p class="text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sit amet consectetur adipiscing elit ut. 
                Blandit volutpat maecenas volutpat blandit aliquam. Eget egestas purus viverra accumsan. Blandit massa enim nec dui nunc mattis enim ut. Cursus metus aliquam eleifend mi in nulla posuere sollicitudin. 
                Ultricies lacus sed turpis tincidunt id aliquet risus feugiat in. Blandit turpis cursus in hac habitasse platea. Urna id volutpat lacus laoreet non curabitur. Nibh praesent tristique magna sit amet purus.
                Aliquam ut porttitor leo a. Sit amet luctus venenatis lectus. Velit dignissim sodales ut eu sem integer. Vivamus arcu felis bibendum ut tristique et. Senectus et netus et malesuada fames ac turpis. Volutpat sed cras ornare arcu dui vivamus. 
                Neque vitae tempus quam pellentesque nec nam. Nulla pharetra diam sit amet nisl. Gravida rutrum quisque non tellus orci. Non enim praesent elementum facilisis leo vel fringilla est ullamcorper.  
                Nulla malesuada pellentesque elit eget gravida cum sociis natoque penatibus. Neque aliquam vestibulum morbi blandit cursus. At consectetur lorem donec massa sapien faucibus et molestie. Eget velit aliquet sagittis id consectetur. 
                Diam maecenas sed enim ut sem viverra aliquet eget sit. Varius morbi enim nunc faucibus a. Eu ultrices vitae auctor eu. Elit duis tristique sollicitudin nibh sit. Ornare suspendisse sed nisi lacus sed viverra tellus in. 
                Tincidunt tortor aliquam nulla facilisi cras. Gravida dictum fusce ut placerat orci nulla. Mauris pellentesque pulvinar pellentesque habitant morbi. Volutpat est velit egestas dui id ornare arcu odio. 
                Bibendum neque egestas congue quisque egestas diam in. Mauris ultrices eros in cursus turpis massa tincidunt. Tellus molestie nunc non blandit.</p>
            </div>
        </div>
        <div class="onpl">
            <h1 class="onlineplayer"> Giocatori online:</h1>
            <div class="onlinelist">
                <table class="ontable">
                    <tr><td class="td">Tempesta58</td><td><form action=""><input class="fightbutton" type="button" value="Fight"></form></td></tr>
                    <tr><td class="td">Laurus</td><td><form action=""><input class="fightbutton" type="button" value="Fight"></td></tr>
                </table>
            </div>
        </div>
        <div class="notify">
            <h1 class="notifytitle"> Notifiche:</h1>
            <div class="notifylist">
                <table class="notifytable">
                    <tr><td class="td">Vittorio scarano ti ha invitato al combattimento</td><td><form action=""><input class="notifybutton" type="button" value="Accept"></form></td></tr>
                    <tr><td class="td">Laurus ti ha invitato a un gilda</td><td><form action=""><input class="notifybutton" type="button" value="Accept"></form></td></tr>
                    <tr><td class="td">Laurus ti ha invitato a un torneo</td><td><form action=""><input class="notifybutton" type="button" value="Accept"></form></td></tr>
                </table>
            </div>
        </div>
        <div class="market">
            <%String status = (String) session.getAttribute("status_bought");
            if(status != null){
                session.removeAttribute("status_bought");
                if(status.compareTo("FAIL") == 0){%>
                        <script>
                            alert("Saldo insufficiente o hai già acquistato questo oggetto");
                        </script>
                    <%}
                if(status.compareTo("PASS") == 0){
                    session.removeAttribute("status_bought");%>
                        <script>
                            alert("Acquisto effettuato");
                        </script>
                    <%}%>
            <%}%>
            <h1 class="markettitle"> Mercato:</h1>
            <div class="marketlist">
                <table class="markettable">
                    <!--
                    <tr><td class="td">Spada LV5 <b>200G</b></td><td><form action=""><input class="marketbutton" type="button" value="Compra"></form></td></tr>
                    <tr><td class="td">Martello LV5 <b>200G</b></td><td><form action=""><input class="marketbutton" type="button" value="Compra"></form></td></tr>
                    <tr><td class="td">Scudo LV5 <b>200G</b></td><td><form action=""><input class="marketbutton" type="button" value="Compra"></form></td></tr>
                    -->
                </table>
            </div>
        </div>
        <div class="buttonlist">
            <form action=""><input class="actionbuttonsx" type="button" value="Attacco"></form>
            <form action=""><input class="actionbuttondx" type="button" value="Difesa"></form>
            <form action=""><input class="actionbuttonsx" type="button" value="Cura"></form>
            <form action=""><input class="actionbuttondx" type="button" value="Fuga"></form>
        </div>
        <div class="stats">
            <h1 class="statstitle"> Statistiche:</h1>
            <div class="statslist">
                <table class="statstable">
                    <tr><td class="td"><b>Punti vita base: ${character.baseVit},   Punti Vita: ${character.vitality} </b></td></tr>
                    <tr><td class="td"><b>Punti Forza base: ${character.baseStr},   Forza ${character.strenght} </b></td></tr>
                    <tr><td class="td"><b>Punti Difesa base: ${character.baseDef},   Difesa: ${character.defense}</b></td></tr>
                    <tr><td class="td"><b>Arma: ${character.arma}, Lv: ${character.weaponLv}, +${character.weaponStr} a Forza</b></td></tr>
                    <tr><td class="td"><b>Armatura: ${character.armatura}, Lv: ${character.armorLv}, +${character.armorStr} a Forza, +${character.armorDef} a Difesa, +${character.armorVit} a Vitalità</b></td></tr>
                    <tr><td class="td"><b>livello: ${character.livello}</b>(<b>${character.remainexp}</b> per il prossimo livello)</td></tr>
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
