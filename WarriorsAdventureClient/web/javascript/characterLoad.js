/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
        $.getJSON("CharacterLoadServlet", function(object, status){
            for(x in object){
                var limit = 1;
                var character = "<input class=\"b"+ limit +"\" type=\"button\" value=\"Nome: "+ object[x].name + ", Livello: " + object[x].level + "\"><br>";
                $(".div1").append(character);
                limit++;
                
            }    
    });
});



