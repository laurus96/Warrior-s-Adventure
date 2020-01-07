/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {

        $.getJSON("AmministratorListPlayer", function(object, status){
            console.log(object);
            var x = 0;
            
            for(x in object){
                var player = "<tr><td class=\"name\">"+ object[x].username +"</td>\n\
                                <td class=\"butd\"><form action=\"RemoveServlet\" method=\"post\">\n\
                                <input type=\"hidden\" name=\"name_rm\" value=\"" + object[x].username  + "\"> <input type=\"submit\" value=\"Rimuovi\"></form></td>\n\
                                <td class=\"butd\"><form action=\"BanServlet\" method=\"post\">\n\
                                <input type=\"hidden\" name=\"name_ban\" value=\"" + object[x].username  + "\"> <input type=\"submit\" value=\"BAN\"></form></td>\n\
                                <td class=\"butd\"><input type=\"button\" value=\"Promuovi (Non disponibile)\">\n\
                                </td></tr>";
                $(".table").append(player);
            }            
        });
});


