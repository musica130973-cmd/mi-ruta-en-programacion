**2\. COMO SE EJECUTA EN EL NAVEGADOR Y EN NODE**

**🧭 Cómo se ejecuta JavaScript en el navegador**

El navegador es el entorno original de JavaScript. Su función principal es permitir que las páginas web reaccionen a las acciones del usuario y modifiquen su contenido dinámicamente.

**Motores de JavaScript en los navegadores**

Cada navegador incluye un motor que interpreta y ejecuta el código:

-   Chrome → **V8**
-   Firefox → **SpiderMonkey**
-   Safari → **JavaScriptCore**
-   Edge → **Chakra** (versiones antiguas) / **V8** (actual)

Estos motores leen el código, lo optimizan y lo ejecutan directamente en el dispositivo del usuario.

**Cómo se carga y ejecuta el código**

El navegador ejecuta JavaScript cuando:

-   Encuentra una etiqueta <script> en el HTML.
-   Descarga un archivo .js externo.
-   El usuario interactúa con la página (eventos).
-   Se realizan peticiones asíncronas (fetch, AJAX).

Ejemplo básico:

html

<script>

console.log("Hola desde el navegador");

</script>

**Capacidades del navegador**

El navegador permite:

-   Manipular el DOM (contenido de la página).
-   Escuchar eventos (clics, teclado, scroll).
-   Realizar peticiones HTTP.
-   Crear animaciones, efectos visuales y validaciones.

Pero **no** permite:

-   Acceder directamente al sistema de archivos.
-   Ejecutar procesos del sistema.
-   Usar módulos nativos del sistema operativo.

Esto se debe a razones de seguridad.

**⚙️ Cómo se ejecuta JavaScript en Node.js**

Node.js es un entorno de ejecución que permite usar JavaScript **fuera del navegador**, especialmente en servidores y herramientas de backend.

**Qué es Node.js**

Node.js utiliza el motor **V8** de Chrome, pero lo combina con:

-   Librerías del sistema operativo.
-   Módulos para manejar archivos, redes, procesos, etc.
-   Un modelo asíncrono basado en eventos.

Esto lo convierte en una plataforma ideal para servidores rápidos y escalables.

**Ejecución de un archivo en Node.js**

El código se guarda en un archivo .js y se ejecuta desde la terminal:

bash

node app.js

Ejemplo:

js

console.log("Hola desde Node.js");

**Capacidades de Node.js**

Node permite:

-   Leer y escribir archivos.
-   Crear servidores web.
-   Gestionar bases de datos.
-   Ejecutar procesos del sistema.
-   Crear herramientas CLI.
-   Desarrollar aplicaciones en tiempo real (chats, juegos online).

Pero **no** permite:

-   Manipular el DOM.
-   Acceder a APIs del navegador (alert, document, window).

**🔍 Diferencias clave entre navegador y Node.js**

| **Aspecto** | **Navegador** | **Node.js** |
| --- | --- | --- |
| Entorno | Cliente (frontend) | Servidor / sistema (backend) |
| Motor | V8, SpiderMonkey, etc. | V8 |
| APIs disponibles | DOM, eventos, fetch | fs, http, procesos, módulos |
| Seguridad | Muy restringido | Acceso al sistema |
| Uso típico | Interactividad web | Servidores, automatización, backend |

**🧠 Cómo decide JavaScript qué hacer en cada entorno**

El mismo lenguaje se comporta distinto según el entorno porque:

-   El **motor** ejecuta el código.
-   El **entorno** proporciona las APIs disponibles.
-   El **contexto** determina qué se puede o no hacer.

Por ejemplo:

-   document.querySelector() solo existe en el navegador.
-   require("fs") solo existe en Node.js.

**📝 Resumen para estudiar**

-   En el navegador, JavaScript se ejecuta mediante motores integrados y controla la interfaz web.
-   En Node.js, JavaScript se ejecuta en el servidor con acceso al sistema operativo.
-   Ambos usan JavaScript, pero con APIs y capacidades diferentes.
-   El navegador se centra en el DOM y la interacción; Node.js en archivos, redes y procesos.
-   Esta dualidad permite usar JavaScript en **toda la pila**: frontend y backend.