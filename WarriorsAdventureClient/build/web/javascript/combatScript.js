/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function (){
    
    function updateScroll(){
        
        var element = document.getElementById("combatLog");
        element.scrollTop = element.scrollHeight;
        
    }
    
    window.setInterval(updateScroll,100);

    
    $("#attack").click(function(){
        $.getJSON("FightServlet", {"val": "atk"}, function(object, status){
            document.getElementById("combatLog").innerHTML = object;
            
        });
    });
    
    $("#defense").click(function(){
        $.getJSON("FightServlet", {"val": "def"}, function(object, status){
            document.getElementById("combatLog").innerHTML = object;

        });
    });
    
    $("#heals").click(function(){
        $.getJSON("FightServlet", {"val": "hls"}, function(object, status){
            document.getElementById("combatLog").innerHTML = object;

        });
    });
    
    $("#leave").click(function(){
        $.getJSON("FightServlet", {"val": "lev"}, function(object, status){
            document.getElementById("combatLog").innerHTML = object;

        });
    });
    

    
});


