/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
        $.getJSON("CharacterLoadServlet", function(){
            for(i in object){
                var limit = 1;
                var character = "<input class=\"b"+ limit +"\" type=\"button\" value=\""+ object[i].name + " " + object[i].classe +"\"><br>";
                limit++;
                
                $(".div1").append(character);
            }
    })
})



