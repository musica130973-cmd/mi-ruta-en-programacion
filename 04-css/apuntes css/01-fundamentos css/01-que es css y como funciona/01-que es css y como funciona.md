1\. QUÉ ES CSS Y CÓMO FUNCIONA

**🧩 1. ¿Qué es CSS?**

**CSS** significa **Cascading Style Sheets** o **Hojas de Estilo en Cascada**. Es un lenguaje que se utiliza para **describir la apariencia visual** de un documento HTML.

En otras palabras: 👉 **HTML construye la estructura** 👉 **CSS define el diseño, los colores, las formas, el tamaño, la posición y la estética general**

Sin CSS, todas las páginas web se verían como documentos de texto sin estilo.

**🎯 2. ¿Para qué sirve CSS?**

CSS permite:

-   Cambiar colores, tipografías y tamaños de texto
-   Crear diseños responsivos para móviles y pantallas grandes
-   Posicionar elementos en la página
-   Añadir animaciones y transiciones
-   Crear layouts complejos con Flexbox y Grid
-   Personalizar la experiencia visual del usuario

Es la herramienta principal para convertir un HTML básico en una web atractiva y profesional.

**🧠 3. ¿Cómo funciona CSS?**

CSS funciona mediante **reglas** que se aplican a elementos HTML. Cada regla tiene dos partes:

![](./01-que%20es%20css%20y%20como%20funciona_images/image-001.png)

**✔ Selector**

Indica **a qué elemento** se aplica el estilo. Ejemplo: p, .clase, #id, h1, div > span

**✔ Propiedad**

Define **qué aspecto** quieres modificar. Ejemplo: color, font-size, margin, background

**✔ Valor**

Especifica **cómo** quieres que sea ese aspecto. Ejemplo: red, 20px, center, #333

**🧬 4. La “cascada” en CSS**

La palabra *cascading* significa que los estilos se aplican siguiendo un **orden de prioridad**.

La cascada se basa en tres factores:

**1\. Especificidad**

Cuanto más concreto es un selector, más prioridad tiene. Orden de menor a mayor:

1.  Selector de etiqueta → p
2.  Selector de clase → .boton
3.  Selector de ID → #principal
4.  Estilos en línea → <p style="color:red">
5.  !important (evitarlo salvo casos extremos)

**2\. Orden de aparición**

Si dos reglas tienen la misma especificidad, **gana la que aparece más abajo** en el CSS.

**3\. Herencia**

Algunas propiedades se heredan automáticamente de un elemento padre a sus hijos. Ejemplos de propiedades que se heredan:

-   font-family
-   color
-   line-height

Ejemplos de propiedades que **no** se heredan:

-   margin
-   padding
-   border

**🧱 5. ¿Dónde se escribe CSS?**

CSS puede colocarse en tres lugares:

**✔ 1. Archivo externo (recomendado)**

**![](./01-que%20es%20css%20y%20como%20funciona_images/image-002.png)**

**✔ 2. Dentro del <style> en el HTML**

**![](./01-que%20es%20css%20y%20como%20funciona_images/image-003.png)**

**✔ 3. En línea (inline) — evitarlo**

**![](./01-que%20es%20css%20y%20como%20funciona_images/image-004.png)**

**🧪 6. Cómo interpreta CSS el navegador**

Cuando cargas una página, el navegador:

1.  Lee el HTML y construye el **DOM**
2.  Lee el CSS y construye el **CSSOM**
3.  Combina ambos para generar el **Render Tree**
4.  Calcula tamaños, posiciones y estilos
5.  Dibuja la página en pantalla

Este proceso se llama **renderizado**.

**🧭 7. Ventajas de usar CSS**

-   Separa contenido y presentación
-   Facilita el mantenimiento
-   Permite reutilizar estilos
-   Mejora la accesibilidad
-   Reduce el peso del HTML
-   Permite diseños modernos y responsivos

**📝 Resumen rápido**

-   CSS es el lenguaje que define el estilo visual de una web
-   Funciona mediante reglas: selector + propiedad + valor
-   La “cascada” determina qué estilos se aplican
-   Se puede escribir en archivos externos, internos o en línea
-   El navegador combina HTML + CSS para renderizar la página