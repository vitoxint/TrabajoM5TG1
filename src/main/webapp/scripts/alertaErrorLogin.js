document.addEventListener("DOMContentLoaded", function(){

    //const formularioContacto = document.getElementById('contacto');
    const error = document.getElementById('error');

    const msg = document.getElementById('message').innerText;

    if( !!msg && msg !== '' ){
        error.style.display = 'block'; // Muestra alerta envio exitoso.
        setTimeout(()=> {
            exitoEnvio.style.display = 'none';

        },10000); //Timer de 5 segundos para ocultar
    }



})