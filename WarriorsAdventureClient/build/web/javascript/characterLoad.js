/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
        $.getJSON("CharacterLoadServlet", function(object, status){
            var x = 0;
            var limit = 1;
            console.log(object);

            for(x in object){
                console.log("ciao");
                var character = "<input class=\"b"+ limit +"\" type=\"button\" value=\"Nome: "+ object[x].name + ", Livello: " + object[x].level + "\"><br>";
                $(".div1").append(character);
                limit++;
                
            }
            console.log(limit);
            if(limit > 3){
                document.getElementById("b4").style.visibility = "hidden";
            }
    });
});



