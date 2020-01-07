/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    $(".buttonBanList").click(function(){
        $.getJSON("AmministratorListPlayerBan", function(object, status){
            var title = "<a class=\"lista\">Giocatori Bannati:</a>";
            $(".table2").append(title);

            
            var x = 0;
            for(x in object){
                var ban = "<tr><td class=\"name\">" + object[x].username + "</td><td class=\"butd\">\n\
                <form action=\"UnbanServlet\" method=\"post\">\n\
                <input type=\"hidden\" name=\"name_unban\" value=\"" + object[x].username  + "\"><input type=\"submit\" value=\"Rimuovi BAN\">\n\
                </form></td></tr>";
                $(".table2").append(ban);
            }
              
        });

    });
});
