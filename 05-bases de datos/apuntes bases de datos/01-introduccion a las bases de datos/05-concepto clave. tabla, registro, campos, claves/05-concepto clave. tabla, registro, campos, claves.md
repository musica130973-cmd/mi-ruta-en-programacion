**5\. CONCEPTOS CLAVE, TABLAS, REGISTROS, CAMPOS, CLAVES**

**🧩 1. Introducción**

En una base de datos relacional, la información se organiza de forma estructurada. Los elementos básicos de esa estructura son:

-   **Tablas**
-   **Registros**
-   **Campos**
-   **Claves**

Comprender estos conceptos es esencial para diseñar, consultar y mantener bases de datos.

**🗂️ 2. Tablas**

**✔️ Definición**

Una **tabla** es una estructura que organiza los datos en **filas y columnas**, similar a una hoja de cálculo.

Cada tabla representa una **entidad** del mundo real:

-   Ej.: *Clientes*, *Productos*, *Empleados*, *Pedidos*.

**✔️ Características**

-   Contiene **columnas** (campos) que definen qué información se guarda.
-   Contiene **filas** (registros) que representan cada elemento concreto.
-   Todas las filas tienen la **misma estructura**.

**🧾 3. Registros (Filas)**

**✔️ Definición**

Un **registro** es **una fila** dentro de una tabla. Representa **una instancia concreta** de la entidad.

Ejemplo en una tabla *Clientes*:

-   Un registro podría ser:
    -   ID: 001
    -   Nombre: Ana Pérez
    -   Teléfono: 600123456

**✔️ Características**

-   Cada registro contiene **valores** para todos los campos de la tabla.
-   No deben existir duplicados si hay una clave primaria.

**🔤 4. Campos (Columnas)**

**✔️ Definición**

Un **campo** es una **columna** de la tabla. Define un **tipo de dato** y una **propiedad** de la entidad.

Ejemplos de campos en una tabla *Productos*:

-   Nombre
-   Precio
-   Stock
-   Categoría

**✔️ Características**

-   Cada campo tiene un **tipo de dato** (texto, número, fecha…).
-   Puede tener **restricciones** (no nulo, único, longitud máxima…).
-   Todos los registros deben respetar el tipo de dato del campo.

**🔑 5. Claves**

Las **claves** son campos especiales que permiten **identificar**, **relacionar** y **proteger** la integridad de los datos.

**⭐ A) Clave primaria (Primary Key – PK)**

**✔️ Definición**

Es un campo (o conjunto de campos) que **identifica de forma única** cada registro de una tabla.

**✔️ Características**

-   No puede repetirse.
-   No puede ser nulo.
-   Suele ser un número autoincremental o un código único.

Ejemplo:

-   En *Clientes*, el campo **ID\_Cliente**.

**🔗 B) Clave foránea (Foreign Key – FK)**

**✔️ Definición**

Es un campo que **establece una relación** entre dos tablas. Hace referencia a la **clave primaria** de otra tabla.

**✔️ Ejemplo**

Tabla *Pedidos*:

-   ID\_Pedido (PK)
-   **ID\_Cliente (FK)** → apunta a *Clientes.ID\_Cliente*

Esto permite saber **qué cliente hizo cada pedido**.

**🧩 C) Clave única (Unique Key)**

**✔️ Definición**

Garantiza que un campo no tenga valores repetidos, aunque **no identifica** por sí solo a un registro.

Ejemplos:

-   DNI
-   Email
-   Número de serie

**🧪 D) Clave compuesta**

**✔️ Definición**

Clave primaria formada por **dos o más campos**.

Ejemplo:

-   En una tabla *Matriculas*:
    -   ID\_Alumno
    -   ID\_Asignatura Juntos forman la PK.

**📝 6. Resumen final**

-   Una **tabla** organiza datos en filas y columnas.
-   Un **registro** es una fila que representa un elemento concreto.
-   Un **campo** es una columna que define un atributo de la entidad.
-   Las **claves** garantizan la identificación única y las relaciones entre tablas.

Estos conceptos son la base del diseño de bases de datos relacionales y permiten mantener la información **ordenada, coherente y conectada**.