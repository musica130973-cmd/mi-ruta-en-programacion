**2\. JVM, JDK Y JRE**

**🧩 JVM: Java Virtual Machine**

La **JVM** es el componente que **ejecuta** el código Java. No ejecuta directamente el código fuente, sino el **bytecode**, un formato intermedio generado por el compilador.

**Funciones principales**

-   **Interpretar o compilar** el bytecode para el sistema operativo donde se ejecuta.
-   **Gestionar la memoria**, incluyendo el *Garbage Collector*, que libera memoria automáticamente.
-   **Asegurar la portabilidad**, permitiendo que el mismo programa funcione en Windows, Linux, macOS o Android.
-   **Proteger el sistema**, ejecutando el código en un entorno controlado.

**Por qué es importante**

La JVM es la razón del famoso lema de Java: *“Write Once, Run Anywhere”*. Cada sistema operativo tiene su propia implementación de JVM, pero todas ejecutan el mismo bytecode.

**🧰 JDK: Java Development Kit**

El **JDK** es el paquete completo para **desarrollar** aplicaciones Java. Incluye todo lo necesario para escribir, compilar, depurar y ejecutar programas.

**Qué contiene**

-   **Compilador (**javac**)** — convierte el código .java en bytecode .class.
-   **JRE** — para ejecutar el programa.
-   **Herramientas de desarrollo** — depuradores, generadores de documentación, analizadores, etc.
-   **Bibliotecas estándar** — colecciones, entrada/salida, redes, concurrencia, etc.

**Cuándo se usa**

Siempre que estés **programando** en Java. Si solo quieres ejecutar programas, no necesitas el JDK, pero sí el JRE.

**⚙️ JRE: Java Runtime Environment**

El **JRE** es el entorno necesario para **ejecutar** aplicaciones Java, pero **no** para desarrollarlas.

**Qué incluye**

-   **JVM** — el motor de ejecución.
-   **Bibliotecas estándar** — las clases básicas que necesita cualquier programa Java.
-   **Archivos de soporte** — configuraciones, recursos, etc.

**Cuándo se usa**

Cuando un usuario final quiere **correr** una aplicación Java sin necesidad de programar nada.

**🔗 Relación entre JVM, JRE y JDK**

**Visión jerárquica**

-   **JDK** ↳ contiene el **JRE**   ↳ que contiene la **JVM**

**Explicación rápida**

-   La **JVM** ejecuta el bytecode.
-   El **JRE** proporciona lo necesario para que la JVM funcione.
-   El **JDK** añade herramientas para programar y compilar.

**📝 Resumen para estudiar**

-   **JVM**: ejecuta el bytecode y gestiona la memoria.
-   **JRE**: entorno para ejecutar programas (incluye la JVM).
-   **JDK**: entorno para desarrollar programas (incluye el JRE y herramientas de desarrollo).
-   Si **programas**, necesitas el **JDK**.
-   Si solo **ejecutas**, basta con el **JRE**.