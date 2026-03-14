**4\. ESTRUCTURA MÍNIMA DE UN DOCUMENTO. !DOCTYPE html, html, head, body**

Todo documento HTML necesita una estructura básica para que el navegador pueda interpretarlo correctamente. Esta estructura define:

-   el tipo de documento
-   el contenido visible
-   la información interna del sitio
-   la organización general de la página

Vamos a ver cada parte paso a paso.

**🟦 1. Plantilla mínima de un documento HTML**

![](./04-estructura%20minima%20de%20un%20documento%20!DOCTYPE%20html%2C%20html%2C%20head%2C%20body_images/image-001.png)

Esta es la base de cualquier página web moderna.

**🟩 2. <!DOCTYPE html> — Declaración del tipo de documento**

**✔️ ¿Qué es?**

Es una instrucción que se coloca **al inicio del archivo** para indicar al navegador que el documento usa **HTML5**.

**✔️ ¿Para qué sirve?**

-   Activa el **modo estándar** del navegador
-   Evita comportamientos antiguos o inconsistentes
-   Asegura que el navegador interprete el HTML correctamente

**✔️ Importante**

No es una etiqueta HTML, sino una **declaración**.

**🟦 3. <html> — Elemento raíz del documento**

Todo el contenido de la página debe estar dentro de esta etiqueta.

![](./04-estructura%20minima%20de%20un%20documento%20!DOCTYPE%20html%2C%20html%2C%20head%2C%20body_images/image-002.png)

**✔️ Atributo importante: lang**

Indica el idioma del documento.

Ejemplos:

-   lang="es" → español
-   lang="en" → inglés
-   lang="fr" → francés

Esto ayuda a:

-   lectores de pantalla
-   motores de búsqueda
-   accesibilidad

**🟩 4. <head> — Información interna del documento**

El <head> contiene **metadatos**, es decir, información que no se muestra directamente en la página, pero que es esencial para su funcionamiento.

Dentro del <head> se incluyen:

**✔️ 1. Codificación del documento**

![](./04-estructura%20minima%20de%20un%20documento%20!DOCTYPE%20html%2C%20html%2C%20head%2C%20body_images/image-003.png)

Permite usar tildes, ñ y caracteres especiales.

**✔️ 2. Título de la página**

![](./04-estructura%20minima%20de%20un%20documento%20!DOCTYPE%20html%2C%20html%2C%20head%2C%20body_images/image-004.png)

Es lo que aparece en la pestaña del navegador.

**✔️ 3. Otros elementos comunes**

-   Hojas de estilo (<link>)
-   Scripts (<script>)
-   Descripción para SEO (<meta name="description">)
-   Icono de la página (favicon)

Ejemplo:

![](./04-estructura%20minima%20de%20un%20documento%20!DOCTYPE%20html%2C%20html%2C%20head%2C%20body_images/image-005.png)

**🟦 5. <body> — Contenido visible de la página**

Todo lo que el usuario ve en la pantalla va dentro del <body>:

-   textos
-   imágenes
-   botones
-   formularios
-   tablas
-   secciones
-   navegación

Ejemplo:

![](./04-estructura%20minima%20de%20un%20documento%20!DOCTYPE%20html%2C%20html%2C%20head%2C%20body_images/image-006.png)

🟩 6. Resumen visual de la estructura

![](./04-estructura%20minima%20de%20un%20documento%20!DOCTYPE%20html%2C%20html%2C%20head%2C%20body_images/image-007.png)

**🟦 7. Buenas prácticas**

-   Siempre incluye <!DOCTYPE html>
-   Usa lang="es" o el idioma correspondiente
-   Coloca <meta charset="UTF-8"> al inicio del <head>
-   Mantén el código indentado y ordenado
-   Usa títulos descriptivos
-   No coloques contenido visible dentro del <head>

**📌 Resumen**

-   <!DOCTYPE html> indica que el documento usa HTML5.
-   <html> es el elemento raíz que contiene toda la página.
-   <head> guarda metadatos, estilos, scripts y el título.
-   <body> contiene todo lo que el usuario ve.
-   Esta estructura es obligatoria para cualquier documento HTML válido.