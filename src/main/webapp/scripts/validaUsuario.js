document.addEventListener("DOMContentLoaded", function() {

    $("#tipo").change( function (){
        var tipoUsuario = $(this).val();

        //alert( tipoUsuario) ;

        switch( tipoUsuario ){
            case "Cliente" :
                $("#form-cliente").css("display", "block");
                $("#form-profesional").css("display", "none");
                $("#form-administrativo").css("display", "none");

                break
            case "Profesional" :
                $("#form-profesional").css("display", "block");
                $("#form-cliente").css("display", "none");
                $("#form-administrativo").css("display", "none");

                break;
            case "Administrativo" :
                $("#form-administrativo").css("display", "block");
                $("#form-profesional").css("display", "none");
                $("#form-cliente").css("display", "none");

                break;

        }



    })

});
