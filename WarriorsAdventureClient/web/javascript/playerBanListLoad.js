/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    $(".buttonBanList").click(function(){
        $.getJSON("AmministratorListPlayerBan", function(object, status){
            console.log(object);
              
        });

    });
});
