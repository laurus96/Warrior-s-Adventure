/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
   $.getJSON("WeaponLoadServlet", function(object, status){
       console.log(object);
       var x = 0;
       
       for(x in object){
           var weapon ="<tr><td class=\"td\">" + object[x].name + " <b> " + object[x].prezzo + " G </b></td>\n\
                        <td><form action=\"\" method=\"post\">\n\
                        <input type=\"hidden\" name=\"id_value\" value=\"" + object[x].id  + "\">\n\
                        <input class=\"marketbutton\" type=\"submit\" value=\"Compra\"></form></td></tr>";
           
           $(".markettable").append(weapon);

       }
       
   }); 
   
   $.getJSON("ArmorLoadServlet", function(object, status){
       console.log(object);
        var x = 0;
       
        for(x in object){
           var armor ="<tr><td class=\"td\">" + object[x].name + " <b> " + object[x].prezzo + " G </b></td>\n\
                        <td><form action=\"\" method=\"post\">\n\
                        <input type=\"hidden\" name=\"id_value\" value=\"" + object[x].id  + "\">\n\
                        <input class=\"marketbutton\" type=\"submit\" value=\"Compra\"></form></td></tr>";
           
           $(".markettable").append(armor);

       }
       
   }); 
});


