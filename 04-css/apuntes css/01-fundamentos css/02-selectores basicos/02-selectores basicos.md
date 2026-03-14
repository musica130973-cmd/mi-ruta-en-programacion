2\. SELECTORES BÁSICOS

Los **selectores** son la forma en la que CSS elige qué elementos de HTML va a estilizar. Son la base de cualquier hoja de estilos, así que entenderlos bien es fundamental.

Los selectores básicos permiten seleccionar elementos por:

-   **nombre de etiqueta**
-   **clase**
-   **id**
-   **atributos**
-   **agrupación**
-   **universal**

Vamos uno por uno.

**🟦 1. Selector por etiqueta (elemento)**

Selecciona **todas** las etiquetas de un tipo.

![](./02-selectores%20basicos_images/image-001.png)

Esto aplica el color azul a **todos los** <p> del documento.

**✔️ Útil para:**

-   Estilos generales
-   Resetear estilos por defecto

**🟩 2. Selector por clase (.)**

Selecciona elementos que tengan un **atributo class** específico.

HTML:

![](./02-selectores%20basicos_images/image-002.png)

CSS:

![](./02-selectores%20basicos_images/image-003.png)

**✔️ Características:**

-   Se puede usar en **muchos elementos**
-   Es el selector más usado en CSS moderno

**🟥 3. Selector por ID (#)**

Selecciona un elemento con un **id único**.

HTML:

![](./02-selectores%20basicos_images/image-004.png)

CSS:

![](./02-selectores%20basicos_images/image-005.png)

**✔️ Importante:**

-   El **id debe ser único** en toda la página
-   Se usa para elementos muy específicos

**🟦 4. Selector universal (\*)**

Selecciona **todos los elementos**.

![](./02-selectores%20basicos_images/image-006.png)

**✔️ Se usa para:**

-   Resets globales
-   Normalizar estilos

**🟩 5. Selector por atributo**

Selecciona elementos que tengan un atributo concreto.

**✔️ Ejemplos:**

![](./02-selectores%20basicos_images/image-007.png)

**✔️ Muy útil para:**

-   Formularios
-   Enlaces específicos
-   Componentes reutilizables

**🟦 6. Agrupación de selectores**

Permite aplicar el mismo estilo a varios elementos.

![](./02-selectores%20basicos_images/image-008.png)

**✔️ Ventaja:**

-   Evita repetir código

**🟩 7. Selectores combinados (básicos)**

**✔️ Selector descendiente (espacio)**

Selecciona elementos dentro de otros:

![](./02-selectores%20basicos_images/image-009.png)

Afecta a todos los p que estén **dentro de un** div.

✔️ Selector hijo directo (>)

![](./02-selectores%20basicos_images/image-010.png)

Solo afecta a los li que son **hijos directos** de ul.

✔️ Selector hermano adyacente (+)

![](./02-selectores%20basicos_images/image-011.png)

Selecciona el **primer** p justo después de un h1.

**✔️ Selector hermano general (~)**

![](./02-selectores%20basicos_images/image-012.png)

Selecciona **todos los** p que estén después de un h2 en el mismo nivel.

**📌 Resumen**

-   **Etiqueta:** p {}
-   **Clase:** .clase {}
-   **ID:** #id {}
-   **Universal:** \* {}
-   **Atributo:** input\[type="text"\] {}
-   **Agrupación:** h1, h2 {}
-   **Descendiente:** div p {}
-   **Hijo directo:** div > p {}
-   **Hermano adyacente:** h1 + p {}
-   **Hermano general:** h2 ~ p {}