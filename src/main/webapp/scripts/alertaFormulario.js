/*const formularioContacto = document.getElementById('contacto');
const exitoEnvio = document.getElementById('envio-exitoso');

formularioContacto.addEventListener('submit', (e) =>{
    //e.preventDefault();
    exitoEnvio.style.display = 'block'; // Muestra alerta envio exitoso.
    setTimeout(()=> {
        exitoEnvio.style.display = 'none';
    },5000); //Timer de 5 segundos para ocultar
    // formularioContacto.reset(); //limpiar formulario
})*/


document.addEventListener("DOMContentLoaded", function(){

    //const formularioContacto = document.getElementById('contacto');
    const exitoEnvio = document.getElementById('envio_exitoso');

    const msg = document.getElementById('message').innerText;

    if( !!msg && msg !== '' ){
        exitoEnvio.style.display = 'block'; // Muestra alerta envio exitoso.
        setTimeout(()=> {
            exitoEnvio.style.display = 'none';

        },5000); //Timer de 5 segundos para ocultar
    }



})