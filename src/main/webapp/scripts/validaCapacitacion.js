let nombreValidado = false;
let rutClienteValidado    = false;
let diaSemanaValidado = false;
let horaValidado   = false;
let lugarValidado  = false;
let duracionValidado = false;
let cantAsistentesValidado = false;


document.addEventListener("DOMContentLoaded", function(){

    function validaHora(hora){
        var formatoHora = /^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$/;
        return formatoHora.test(hora);
    }

    function validaDuracion(tiempo){
        var formatoTiempo = /^([0-9][0-9]):[0-5][0-9]$/;
        return formatoTiempo.test(tiempo);
    }

    $("#nombre").keyup(  function (){
        var campoNombre = $(this).val();
        if (campoNombre == ""){
            nombreValidado = false;
            $("#nombre").addClass("is-invalid")
                .removeClass("is-valid");
            validarCapacitacionBtn();
        } else {
            nombreValidado = true;
            $("#nombre").addClass("is-valid")
                .removeClass("is-invalid");
            validarCapacitacionBtn();

        }

    })

    $("#rutCliente").keyup( function (){
        var rut = $(this).val();
        if(validaRUT(rut)){
            rutClienteValidado    = true;
            $("#rutCliente").addClass("is-valid")
                .removeClass("is-invalid");
            validarCapacitacionBtn();
        } else {
            rutClienteValidado    = false;
            $("#rutCliente").addClass("is-invalid")
                .removeClass("is-valid");
            validarCapacitacionBtn();
        }
    })

    $("#diaSemana").change( function (){
        var diaSemana = $(this).val();
        if (!!diaSemana){
            diaSemanaValidado = true;
            $("#diaSemana").addClass("is-valid")
                .removeClass("is-invalid");
            validarCapacitacionBtn();
        } else {
            diaSemanaValidado = false;
            $("#diaSemana").addClass("is-invalid").removeClass("is-valid");
            validarCapacitacionBtn();

        }

    })

    $("#lugar").keyup(  function (){
        var lugar = $(this).val();
        if (!!lugar){
            lugarValidado = true;
            $("#lugar").addClass("is-valid")
                .removeClass("is-invalid");
            validarCapacitacionBtn();
        } else {
            lugarValidado = false;
            $("#lugar").addClass("is-invalid")
                .removeClass("is-valid");
            validarCapacitacionBtn();

        }

    })

    $("#hora").keyup(  function (){
        var hora = $(this).val().trim();
        if (validaHora(hora)){
            horaValidado = true;
            $("#hora").addClass("is-valid")
                .removeClass("is-invalid");;
            validarCapacitacionBtn();
        } else {
            horaValidado = false;
            $("#hora").addClass("is-invalid")
                .removeClass("is-valid");
            validarCapacitacionBtn();
        }
    })

    $("#duracion").keyup(function (){
        var duracion = $(this).val().trim();
        if (validaDuracion(duracion)){
            duracionValidado = true;
            $("#duracion").addClass("is-valid")
                .removeClass("is-invalid");
            validarCapacitacionBtn();
        } else {
            duracionValidado = false;
            $("#duracion").addClass("is-invalid")
                .removeClass("is-valid");
            validarCapacitacionBtn();
        }
    })


    $("#cantAsistentes").keyup( function (){
        var cantAsistentes = $(this).val();
        if ( cantAsistentes >= 1 ){
            cantAsistentesValidado = true;
            $("#cantAsistentes").addClass("is-valid")
                .removeClass("is-invalid");
            validarCapacitacionBtn();
        } else {
            cantAsistentesValidado = false;
            $("#cantAsistentes").addClass("is-invalid")
                .removeClass("is-valid");
            validarCapacitacionBtn();
        }

    })

    $('#formulario').submit(function(event) {

        event.preventDefault(); //this will prevent the default submit

        if( nombreValidado && rutClienteValidado && diaSemanaValidado && horaValidado && lugarValidado && duracionValidado && cantAsistentesValidado){
            $(this).unbind('submit').submit();
        }else{
            if( !nombreValidado ){
                $("#nombre").addClass("is-invalid")
                    .removeClass("is-valid");
            }
            if( !rutClienteValidado ){
                $("#rutCliente").addClass("is-invalid")
                    .removeClass("is-valid");
            }
            if( !diaSemanaValidado ){
                $("#diaSemana").addClass("is-invalid")
                    .removeClass("is-valid");
            }
            if( !horaValidado ){
                $("#hora").addClass("is-invalid")
                    .removeClass("is-valid");
            }
            if( !lugarValidado ){
                $("#lugar").addClass("is-invalid")
                    .removeClass("is-valid");
            }
            if( !duracionValidado ){
                $("#duracion").addClass("is-invalid")
                    .removeClass("is-valid");
            }
            if( !cantAsistentesValidado ){
                $("#cantAsistentes").addClass("is-invalid")
                    .removeClass("is-valid");
            }
        }

         // continue the submit unbind preventDefault
    })

    function validarCapacitacionBtn(){

        if( nombreValidado && rutClienteValidado && diaSemanaValidado && horaValidado && lugarValidado && duracionValidado && cantAsistentesValidado){
            $("#submit").removeClass("disabled");
        }else{
            $("#submit").addClass("disabled");
        }

    }
})
