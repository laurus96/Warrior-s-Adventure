/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.setInterval(function (){
    
    $.getJSON("NotifyDisplayServlet", function(object, status){
        var x = 0;
       
        if(object !== null){
            for(x in object){
               
                var msg = "<tr><td class=\"td\">" + object[x].name  +" ti ha sfidato a duello</td><td><form action=\"StartCombatServlet\" method=\"post\">\n\
                            <input class=\"fightbutton\" type=\"hidden\" value=\"" + object[x].id + "\" name=\"id_enemy\">\n\
                            <input class=\"notifybutton\" type=\"submit\" value=\"Accept\"></form></td></tr>";
                $(".notifytable").append(msg);
               
            }

           
        }
        
});}, 1000);





