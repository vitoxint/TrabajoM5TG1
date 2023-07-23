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

    $("#nombre").on("change", function (){
        var campoNombre = $(this).val();
        if (campoNombre == ""){
            nombreValidado = false;
            $("#nombre").addClass("is-invalid")
                .removeClass("is-valid");
        } else {
            nombreValidado = true;
            $("#nombre").addClass("is-valid")
                .removeClass("is-invalid");
            validarCapacitacionBtn();

        }

    })

    $("#rutCliente").on("change",function (){
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
        }
    })

    $("#diaSemana").on("change","select", function (){
        var diaSemana = $(this).val();
        if (!!diaSemana){
            diaSemanaValidado = true;
            $("#diaSemana").addClass("is-valid")
                .removeClass("is-invalid");
            validarCapacitacionBtn();
        } else {
            diaSemanaValidado = false;
            $("#diaSemana").addClass("is-invalid").removeClass("is-valid");

        }

    })

    $("#lugar").on("change", function (){
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

        }

    })

    $("#hora").on("change","input", function (){
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
        }
    })

    $("#duracion").on("change","input", function (){
        var duracion = $(this).val().trim();
        if (validaDuracion(duracion)){
            duracionValidado = true;
            $("#duracion").addClass("is-valid")
                .removeClass("is-invalid");;
            validarCapacitacionBtn();
        } else {
            duracionValidado = false;
            $("#duracion").addClass("is-invalid")
                .removeClass("is-valid");
        }
    })





    $("#cantAsistentes").on("change","input", function (){
        var cantAsistentes = $(this).val();
        if ( cantAsistentes >= 1 ){
            cantAsistentesValidado = true;
            $("#cantAsistentes").addClass("is-valid")
                .removeClass("is-invalid");;
            validarCapacitacionBtn();
        } else {
            cantAsistentesValidado = false;
            $("#cantAsistentes").addClass("is-invalid")
                .removeClass("is-valid");;
        }

    })
})