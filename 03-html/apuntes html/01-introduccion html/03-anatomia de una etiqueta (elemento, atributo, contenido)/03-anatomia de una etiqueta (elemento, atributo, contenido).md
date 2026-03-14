**3\. ANATOMÍA DE UNA ETIQUETA (ELEMENTO, ATRIBUTO, CONTENIDO)**

HTML está formado por **elementos**, y cada elemento se construye usando **etiquetas**. Para escribir HTML correctamente, es fundamental entender qué partes componen una etiqueta y cómo funcionan.

**🟦 1. ¿Qué es un elemento HTML?**

Un **elemento HTML** es la unidad básica de un documento web. Representa una pieza de contenido: un párrafo, una imagen, un enlace, un título, etc.

Un elemento suele estar formado por:

-   una **etiqueta de apertura**
-   un **contenido**
-   una **etiqueta de cierre**

Ejemplo:

![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-001.png)

**🟩 2. Partes de una etiqueta HTML**

Vamos a desglosar la estructura:

![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-002.png)

**✔️ 1. Etiqueta de apertura**

![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-003.png)

Incluye:

-   el **nombre del elemento** (p)
-   opcionalmente, **atributos**

**✔️ 2. Contenido**

![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-004.png)

Es lo que aparece dentro del elemento.

Puede ser texto, otras etiquetas, imágenes, etc

**✔️ 3. Etiqueta de cierre**

**![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-005.png)**

Indica dónde termina el elemento. Siempre lleva una barra /.

**🟦 3. ¿Qué es un atributo?**

Los **atributos** añaden información extra a un elemento. Se escriben dentro de la etiqueta de apertura.

Ejemplo:

![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-006.png)

Aquí:

-   src="foto.jpg" → atributo que indica la ruta de la imagen
-   alt="Descripción de la imagen" → atributo de accesibilidad

**✔️ Estructura de un atributo**

![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-007.png)

Ejemplos comunes:

-   id="header"
-   class="boton"
-   href="https://example.com"
-   type="text"

**🟩 4. Elementos vacíos (sin contenido)**

Algunos elementos **no tienen contenido** ni etiqueta de cierre. Se llaman *void elements*.

Ejemplos:

![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-008.png)

Estos elementos **no pueden** tener contenido dentro.

🟦 5. Ejemplo completo explicado

![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-009.png)

| **Parte** | **Explicación** |
| --- | --- |
| &lt;a ...&gt; | Etiqueta de apertura |
| href="https://google.com" | Atributo obligatorio del enlace |
| target="_blank" | Atributo opcional (abre en nueva pestaña) |
| Ir a Google | Contenido del enlace |
| &lt;/a&gt; | Etiqueta de cierre |

**🟩 6. Buenas prácticas**

-   Usa atributos **solo cuando sean necesarios**
-   Escribe siempre el atributo alt en imágenes
-   Mantén el HTML **semántico** (usa la etiqueta adecuada para cada caso)
-   Evita atributos obsoletos como align, bgcolor, etc.
-   Mantén el código indentado y legible

**📌 Resumen**

-   Un elemento HTML se compone de **etiqueta de apertura**, **contenido** y **etiqueta de cierre**.
-   Los **atributos** añaden información extra al elemento.
-   Algunos elementos son **vacíos** y no tienen contenido (<br>, <img>, <meta>…).
-   La estructura básica es:

![](./03-anatomia%20de%20una%20etiqueta%20(elemento%2C%20atributo%2C%20contenido)_images/image-010.png)

Es importante escribir HTML semántico, accesible y limpio.