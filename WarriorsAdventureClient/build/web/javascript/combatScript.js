/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function (){
    
    window.setInterval(function (){
        console.log("Ciao");
         $("#attack").click(function(){
            $.getJSON("FightServlet", {"val": "atk"}, function(object, status){

                document.getElementById("combatlog").innerHTML = object;

            });
        });
    
        $("#defense").click(function(){
            $.getJSON("FightServlet", {"val": "def"}, function(object, status){

            });
        });
    
        $("#heals").click(function(){
            $.getJSON("FightServlet", {"val": "hls"}, function(object, status){

            });
        });
    
        $("#leave").click(function(){
            $.getJSON("FightServlet", {"val": "lev"}, function(object, status){

            });
        });
         
    }, 1000);
     
});


