$(document).ready(function(){
    $("#nombre").on("input", function (){
        var campoNombre =$(this).val();
        if (campoNombre == ""){
            $(#nombre).css("border-color", "red");
        } else {
            $(#nombre).css("border-color", "green");
        }

    })
})