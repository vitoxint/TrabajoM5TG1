function validaRUT(rut) {
    // Eliminar puntos y guiones
    rut = rut.replace(/[.-]/g, "");

    // Validar longitud mínima del RUT (al menos un dígito)
    if (rut.length < 1) {
        return false;
    }

    // Obtener el dígito verificador
    var dv = rut.charAt(rut.length - 1);

    // Obtener solo el número del RUT
    rut = rut.substring(0, rut.length - 1);

    // Validar el dígito verificador según el algoritmo chileno
    var suma = 0;
    var factor = 2;
    for (var i = rut.length - 1; i >= 0; i--) {
        suma += parseInt(rut.charAt(i)) * factor;
        factor = factor === 7 ? 2 : factor + 1;
    }

    var dvCalculado = 11 - (suma % 11);
    dvCalculado = dvCalculado === 11 ? 0 : dvCalculado;
    dvCalculado = dvCalculado === 10 ? "K" : dvCalculado.toString();

    return dv === dvCalculado;
}