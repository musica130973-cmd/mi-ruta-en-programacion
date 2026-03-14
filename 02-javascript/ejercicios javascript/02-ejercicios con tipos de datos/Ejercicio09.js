// Ejercicio 9
// Escribe una expresión que determine si valor es un número válido

let valor = "123a";

let comprobacion = !isNaN(Number(valor)); // false no es un número válido
// number(valor) convierte valor a un número
// si puede convertirse, devuelve un número válido
// si no puede, devuelve NaN
// isNaN(...) comprueba si el resultado es NaN
// ! Invierte el resultado de isNaN
// Si valor es un número válido, Number(valor) NO es NaN → isNaN da false → !false = true
// Si valor no es un número, Number(valor) es NaN → isNaN da true → !true = false
console.log(comprobacion);
