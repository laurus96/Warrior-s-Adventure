/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function (){
    
    $("#attack").click(function(){
        $.getJSON("FightServlet", {"val": "atk"}, function(object, status){
            
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
    
});


