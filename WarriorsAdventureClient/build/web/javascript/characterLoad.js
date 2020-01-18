/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
        $.getJSON("CharacterLoadServlet", function(object, status){
            var x = 0;
            var limit = 3;
            
            
            for(x in object){
                
                var chars = "<tr><td><form action=\"ToGame\" method=\"post\">\n\
                        <input type=\"hidden\" name=\"id_value\" value=\"" + object[x].name  + "\">\n\
                        <input class=\"b"+ limit +"\" type=\"submit\" value=\"Nome: "+ object[x].name + ", Livello: " + object[x].livello + ", Classe: " + object[x].classe  +"\">\n\
                        </form></td></tr>";

                
                $(".chars").append(chars);
                limit--;
                
            }
            if(limit < 1){
                var elem = document.getElementById("b4");
                elem.parentNode.removeChild(elem);
            }
    });
    
});



