**6\. ENTRADA Y SALIDA console.log**

**📥 Qué es la salida por consola en JavaScript**

La consola es un panel donde el entorno de ejecución muestra mensajes, resultados y advertencias. Permite observar lo que ocurre “por dentro” del programa sin modificar la interfaz visual de la página o del terminal.

-   En el **navegador**, la consola se abre desde las herramientas de desarrollador (F12 → pestaña *Console*).
-   En **Node.js**, la salida aparece directamente en la terminal donde se ejecuta el archivo.

**🧩 Qué hace exactamente console.log**

console.log() imprime un mensaje o valor en la consola. Puede mostrar números, textos, arrays, objetos, resultados de funciones o cualquier expresión evaluable.

![](./06-entrada%20y%20salida.%20console.log_images/image-001.png)

Esta función es muy útil para:

-   Ver el valor de una variable en un momento concreto.
-   Comprobar si un bloque de código se está ejecutando.
-   Inspeccionar objetos y estructuras complejas.
-   Depurar errores sin detener el programa.

**🧱 Entrada y salida en JavaScript**

JavaScript no tiene un sistema de entrada estándar como otros lenguajes (por ejemplo, scanf en C o input en Python). La entrada depende del entorno:

-   En el **navegador**, la entrada suele venir de formularios, eventos del usuario o funciones como prompt().
-   En **Node.js**, se puede leer entrada desde la terminal con módulos como readline.

La salida, en cambio, es universal: console.log funciona en ambos entornos.

**🧠 Cómo se usa en el navegador**

En una página web, console.log permite ver información sin modificar el contenido visual.

![](./06-entrada%20y%20salida.%20console.log_images/image-002.png)

La salida aparecerá en la consola del navegador, útil para depurar scripts que manipulan el DOM o responden a eventos.

**⚙️ Cómo se usa en Node.js**

En Node.js, console.log es la forma más directa de mostrar información en la terminal.

![](./06-entrada%20y%20salida.%20console.log_images/image-003.png)

Es habitual usarlo para:

-   Ver el estado de un servidor.
-   Mostrar mensajes de progreso.
-   Depurar funciones backend.

**🔍 Otros métodos de consola útiles**

Aunque console.log es el más usado, existen otros métodos:

-   **console.error()** — muestra errores en rojo.
-   **console.warn()** — muestra advertencias.
-   **console.table()** — imprime arrays u objetos en formato tabla.
-   **console.clear()** — limpia la consola.

Ejemplo:

![](./06-entrada%20y%20salida.%20console.log_images/image-004.png)

**📝 Resumen para estudiar**

-   console.log muestra información en la consola del navegador o de Node.js.
-   Es la herramienta principal para depurar y entender el flujo del programa.
-   Permite imprimir cualquier tipo de dato: números, strings, arrays, objetos, funciones.
-   En el navegador se ve en las DevTools; en Node.js, en la terminal.
-   Existen métodos complementarios como console.error, console.warn y console.table.