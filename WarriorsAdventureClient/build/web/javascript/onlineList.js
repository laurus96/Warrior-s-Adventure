/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function (){
   $.getJSON("OnlineListServlet", function(object, status){
       var x = 0;
       
       for(x in object){
            var online = "<tr><td class=\"td\">" + object[x].name +" Lv:"+ object[x].livello + "</td><td>\n\
                        <form action=\"NotifyServlet\" method=\"post\">\n\
                        <input class=\"fightbutton\" type=\"hidden\" value=\"" + object[x].id + "\" name=\"id_enemy\">\n\
                        <input class=\"fightbutton\" type=\"submit\" value=\"Fight\">\n\
                        </form></td></tr>";
           
           $(".ontable").append(online);

           
       }
       
       
   }) ;
});

