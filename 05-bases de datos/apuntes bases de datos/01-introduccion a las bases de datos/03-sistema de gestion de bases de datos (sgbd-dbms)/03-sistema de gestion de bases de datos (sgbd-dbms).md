**3\. SISTEMAS DE GESTIÓN DE BASES DE DATOS (SGBD / DBMS)**

**🧩 1. ¿Qué es un SGBD?**

Un **Sistema de Gestión de Bases de Datos (SGBD)** es un **software especializado** que permite **crear, almacenar, organizar, modificar y consultar** bases de datos de forma eficiente y segura.

Es la herramienta que actúa como **intermediario** entre los usuarios y la base de datos.

**🎯 2. Funciones principales de un SGBD**

**A) Gestión del almacenamiento**

-   Controla cómo se guardan los datos en disco.
-   Optimiza el espacio y el acceso.

**B) Manipulación de datos**

-   Permite **insertar, modificar, eliminar y consultar** información.
-   Utiliza lenguajes como **SQL**.

**C) Control de seguridad**

-   Gestiona **usuarios, permisos y roles**.
-   Protege los datos frente a accesos no autorizados.

**D) Integridad de los datos**

-   Garantiza que la información sea **coherente y correcta**.
-   Aplica reglas como claves primarias, foráneas, restricciones, etc.

**E) Concurrencia**

-   Permite que **varios usuarios trabajen a la vez** sin conflictos.
-   Controla bloqueos y transacciones.

**F) Recuperación ante fallos**

-   Restaura la base de datos en caso de errores, caídas o pérdidas.
-   Utiliza copias de seguridad y registros de transacciones.

**🧱 3. Componentes de un SGBD**

| **Componente** | **Función** |
| --- | --- |
| **Motor de almacenamiento** | Gestiona cómo se guardan los datos físicamente. |
| **Procesador de consultas** | Interpreta y ejecuta las consultas SQL. |
| **Gestor de transacciones** | Controla operaciones atómicas y consistentes. |
| **Módulo de seguridad** | Control de accesos y permisos. |
| **Catálogo o diccionario de datos** | Metadatos sobre tablas, índices, usuarios, etc. |

**🧠 4. Tipos de SGBD**

**A) Según el modelo de datos**

-   **Relacionales (RDBMS)** Basados en tablas y SQL. Ej.: MySQL, PostgreSQL, Oracle, SQL Server.
-   **No relacionales (NoSQL)** Diseñados para grandes volúmenes y estructuras flexibles. Tipos: documentos, grafos, clave-valor, columnas. Ej.: MongoDB, Redis, Cassandra.
-   **Orientados a objetos** Manejan datos como objetos. Ej.: db4o, ObjectDB.
-   **Jerárquicos y en red** Más antiguos; usados en sistemas legacy.

**B) Según la ubicación**

-   **Locales**: instalados en un solo equipo.
-   **Cliente-servidor**: accesibles desde varios usuarios.
-   **En la nube**: gestionados por proveedores (AWS, Azure, Google Cloud).

**🔐 5. Ventajas de usar un SGBD**

-   **Centralización** de la información.
-   **Seguridad** y control de accesos.
-   **Reducción de redundancia** (evita duplicados).
-   **Integridad** y coherencia de los datos.
-   **Acceso concurrente** sin conflictos.
-   **Escalabilidad** para manejar grandes volúmenes.
-   **Respaldo y recuperación** ante fallos.

**⚠️ 6. Desventajas o limitaciones**

-   Requieren **recursos** (memoria, CPU, almacenamiento).
-   Pueden ser **costosos** en entornos empresariales.
-   Necesitan **administración especializada**.
-   La configuración inicial puede ser compleja.

**🛠️ 7. Ejemplos de SGBD populares**

**Relacionales**

-   **MySQL**
-   **PostgreSQL**
-   **Oracle Database**
-   **Microsoft SQL Server**
-   **SQLite**

**NoSQL**

-   **MongoDB**
-   **Redis**
-   **Cassandra**
-   **CouchDB**

**🧪 8. Lenguajes asociados a los SGBD**

**SQL (Structured Query Language)**

-   Lenguaje estándar para bases de datos relacionales.
-   Permite:
    -   Crear tablas (DDL)
    -   Insertar y modificar datos (DML)
    -   Consultar información (SELECT)
    -   Gestionar permisos (DCL)

**Lenguajes específicos de cada SGBD**

-   PL/SQL (Oracle)
-   T-SQL (SQL Server)

**📝 9. Resumen final**

Un **SGBD** es un software que permite **gestionar bases de datos de forma segura, eficiente y organizada**. Es fundamental en cualquier sistema moderno que maneje información: desde una web sencilla hasta aplicaciones empresariales, bancos, hospitales o redes sociales.