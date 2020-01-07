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
                var name_value = "<input type=\"hidden\" name=\"name_value\" value=\"" + object[x].name  + "\">";
                var character = "<input class=\"b"+ limit +"\" type=\"submit\" value=\"Nome: "+ object[x].name + ", Livello: " + object[x].livello + "\"><br>";
                $("#togameForm").append(name_value);
                $("#togameForm").append(character);
                limit--;
                
            }
            if(limit < 1){
                document.getElementById("b4").style.visibility = "hidden";
            }
    });
    
});



