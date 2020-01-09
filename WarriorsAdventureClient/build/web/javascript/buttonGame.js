/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.setInterval(function (){
    
    $.getJSON("ButtonDisplayServlet", function(object, status){
        if(object === null){
            $('.actionbuttonsx').attr('disabled','disabled');
            $('.actionbuttondx').attr('disabled','disabled');
        }else {
            $('.actionbuttonsx').removeAttr('disabled');
            $('.actionbuttonsx').removeAttr('disabled');
        }
       
        
});}, 1000);

