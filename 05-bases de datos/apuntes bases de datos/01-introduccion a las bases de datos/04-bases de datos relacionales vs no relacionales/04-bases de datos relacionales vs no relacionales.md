**4\. BASES DE DATOS RELACIONALES VS. NO RELACIONALES**

**🧩 1. Introducción**

Las bases de datos pueden clasificarse en dos grandes grupos según cómo organizan y gestionan la información:

-   **Relacionales (SQL)**: basadas en tablas y relaciones.
-   **No relacionales (NoSQL)**: más flexibles, diseñadas para grandes volúmenes y estructuras diversas.

Ambos modelos conviven hoy en día porque resuelven **necesidades distintas**.

**🧱 2. Bases de datos relacionales (SQL)**

**✔️ Definición**

Son bases de datos que organizan la información en **tablas** formadas por **filas (registros)** y **columnas (campos)**. Utilizan el lenguaje **SQL (Structured Query Language)** para consultar y manipular datos.

**🗂️ Características principales**

-   **Estructura fija**: las tablas tienen un esquema definido (tipos de datos, restricciones…).
-   **Relaciones** entre tablas mediante **claves primarias y foráneas**.
-   **Integridad referencial**: garantiza coherencia entre datos relacionados.
-   **Transacciones ACID**:
    -   **A**tomicidad
    -   **C**onsistencia
    -   **I**solamiento
    -   **D**urabilidad
-   Ideales para datos **estructurados** y bien organizados.

**🛠️ Ejemplos de SGBD relacionales**

-   MySQL
-   PostgreSQL
-   Oracle Database
-   Microsoft SQL Server
-   SQLite

**🎯 Cuándo usar bases de datos relacionales**

-   Cuando los datos tienen **relaciones claras**.
-   Cuando se necesita **consistencia estricta**.
-   En sistemas financieros, contables, ERP, gestión de inventarios, etc.

**🧬 3. Bases de datos no relacionales (NoSQL)**

**✔️ Definición**

Son bases de datos que **no utilizan tablas tradicionales**. Están diseñadas para manejar **grandes volúmenes de datos**, alta velocidad y estructuras flexibles.

**🗂️ Tipos de bases de datos NoSQL**

| **Tipo** | **Descripción** | **Ejemplo** |
| --- | --- | --- |
| **Documentos** | Guardan datos en documentos tipo JSON | MongoDB |
| **Clave–valor** | Cada dato tiene una clave única | Redis |
| **Columnas** | Datos organizados por columnas, no por filas | Cassandra |
| **Grafos** | Datos representados como nodos y relaciones | Neo4j |

**🔍 Características principales**

-   **Esquema flexible** (schema-less).
-   Escalabilidad **horizontal** (añadir más servidores).
-   Alto rendimiento en lecturas/escrituras masivas.
-   No siempre cumplen ACID; suelen usar **eventual consistency**.
-   Ideales para datos **semiestructurados o no estructurados**.

**🛠️ Ejemplos de SGBD NoSQL**

-   MongoDB
-   Redis
-   Cassandra
-   CouchDB
-   Neo4j

**🎯 Cuándo usar bases de datos NoSQL**

-   Grandes volúmenes de datos (Big Data).
-   Aplicaciones web con millones de usuarios.
-   Datos que cambian de estructura con frecuencia.
-   Sistemas de recomendación, redes sociales, IoT, análisis en tiempo real.

**⚖️ 4. Comparación directa: SQL vs NoSQL**

| **Característica** | **Relacional (SQL)** | **No relacional (NoSQL)** |
| --- | --- | --- |
| **Estructura** | Tablas fijas | Flexible, sin esquema |
| **Relaciones** | Muy fuertes | Pocas o inexistentes |
| **Consistencia** | Alta (ACID) | Eventual o configurable |
| **Escalabilidad** | Vertical | Horizontal |
| **Velocidad** | Óptima para consultas complejas | Óptima para grandes volúmenes |
| **Tipo de datos** | Estructurados | Semi/no estructurados |
| **Casos de uso** | Finanzas, ERP, gestión | Big Data, redes sociales, IoT |

**📝 5. Resumen final**

-   Las **bases de datos relacionales** son ideales para datos estructurados, relaciones claras y necesidad de consistencia.
-   Las **bases de datos no relacionales** destacan en flexibilidad, escalabilidad y manejo de grandes volúmenes de información.
-   No compiten: **se complementan** según el tipo de proyecto.