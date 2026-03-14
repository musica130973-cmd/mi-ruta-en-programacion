**3\. TIPOS DE DATOS PRIMITIVOS Y OBJETOS**

**🧩 Tipos de datos primitivos**

Los valores primitivos representan datos simples e **inmutables**. JavaScript define **siete tipos primitivos**: Number, BigInt, String, Boolean, Undefined, Null y Symbol.

**Number**

Incluye enteros y decimales, además de valores especiales como *Infinity*, *\-Infinity* y *NaN*. Ejemplo:

![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-001.png)

**BigInt**

Permite trabajar con enteros muy grandes que superan el límite de Number.

![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-002.png)

**String**

Representa texto entre comillas simples, dobles o backticks.

![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-003.png)

**Boolean**

Solo puede ser **true** o **false**.

![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-004.png)

**Undefined**

Valor asignado automáticamente a una variable declarada pero no inicializada.

![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-005.png)

**Null**

Representa la ausencia intencional de valor.

![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-006.png)

**Symbol**

Crea identificadores únicos, útil para propiedades privadas o internas.

![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-007.png)

**🧱 Características de los primitivos**

-   Son **inmutables**: no se pueden modificar directamente.
-   Se comparan por **valor**.
-   Se almacenan directamente en la memoria.
-   Son rápidos de copiar y pasar entre funciones.

**🧩 Tipo de dato objeto**

El tipo **Object** es el único tipo no primitivo. Representa colecciones de datos y funcionalidades. Puede contener múltiples valores y estructuras complejas.

**Objetos literales**

**![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-008.png)**

**Arrays**

**![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-009.png)**

**Funciones**

En JavaScript, las funciones también son objetos.

![](./03-tipos%20de%20datos%20primitivos%20y%20objetos_images/image-010.png)

**Fechas, Map, Set y más**

JavaScript incluye objetos nativos para manejar datos avanzados:

-   **Date** para fechas
-   **Map** y **Set** para colecciones
-   **RegExp** para expresiones regulares

**🧱 Características de los objetos**

-   Son **mutables**: sus propiedades pueden cambiar.
-   Se comparan por **referencia**, no por valor.
-   Pueden contener otros objetos o valores primitivos.
-   Son la base de estructuras complejas y del modelo orientado a objetos basado en prototipos.

**🔍 Diferencias clave entre primitivos y objetos**

| **Aspecto** | **Primitivos** | **Objetos** |
| --- | --- | --- |
| Mutabilidad | Inmutables | Mutables |
| Comparación | Por valor | Por referencia |
| Almacenamiento | Directo en memoria | Referencia a un espacio en memoria |
| Complejidad | Datos simples | Estructuras complejas |
| Métodos | No tienen métodos propios (aunque se envuelven temporalmente) | Pueden contener métodos |

**🧠 Por qué es importante esta distinción**

-   Afecta a cómo se copian los valores.
-   Influye en el comportamiento de las funciones y parámetros.
-   Determina cómo se comparan los datos.
-   Es clave para evitar errores comunes, como modificar objetos sin querer.

**📝 Resumen para estudiar**

-   JavaScript tiene **7 tipos primitivos** y **1 tipo objeto**.
-   Los primitivos son simples, inmutables y se comparan por valor.
-   Los objetos son complejos, mutables y se comparan por referencia.
-   Comprender esta diferencia ayuda a escribir código más seguro, eficiente y predecible.