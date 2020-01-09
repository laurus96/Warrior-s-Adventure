/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.setInterval(function (){
    
    $.getJSON("ButtonDisplayServlet", function(object, status){
        if(object !== null){
            console.log("disable = false");
            $("#attack").prop("disabled", false);
            $("#defense").prop("disabled", false);
            $("#leave").prop("disabled", false);
            $("#heals").prop("disabled", false);


        }
        if(object === null){
            document.getElementById("attack").setAttribute("disabled", true);
            document.getElementById("defense").setAttribute("disabled", true);
            document.getElementById("heals").setAttribute("disabled", true);
            document.getElementById("leave").setAttribute("disabled", true);
        }
        
});}, 1000);

