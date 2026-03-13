**3\. Instalación del JDK (Java Development Kit)**

El **JDK** es el paquete de herramientas necesario para programar en Java. Incluye:

-   El **JRE** (Java Runtime Environment) → para ejecutar programas Java
-   El **compilador** javac → para convertir tu código en bytecode
-   Herramientas de desarrollo (depurador, documentación, etc.)

Sin el JDK, no puedes compilar ni ejecutar programas Java desde tu PC.

**🟦 1. Descargar el JDK**

El JDK se descarga desde la página oficial de Oracle o desde otras distribuciones como OpenJDK.

**✔️ Opción recomendada: Oracle JDK**

-   Página oficial: *Busca “Oracle JDK download” en tu navegador*
-   Elige tu sistema operativo (Windows, Linux o macOS)
-   Descarga el instalador .exe si estás en Windows

**✔️ Alternativa: OpenJDK**

-   Es libre y gratuito
-   Funciona igual que el JDK de Oracle
-   Puedes buscar “OpenJDK download” y elegir la versión más reciente

**✔️ ¿Qué versión elegir?**

-   Para aprender: **JDK 17** o **JDK 21** Son versiones LTS (Long Term Support), estables y recomendadas.

**🟩 2. Instalar el JDK en Windows**

Una vez descargado el archivo .exe:

1.  Haz doble clic para iniciar el instalador
2.  Acepta los términos de licencia
3.  Elige la ruta de instalación (por defecto está bien)
4.  Pulsa **Next** hasta que termine
5.  Cierra el instalador

Esto instalará:

-   El JDK
-   El JRE
-   Las herramientas de desarrollo

**🟧 3. Configurar la variable de entorno JAVA\_HOME**

Aunque algunos IDE lo hacen automáticamente, es buena práctica configurarlo manualmente.

**✔️ Pasos:**

1.  Abre el menú Inicio y escribe: **“Editar las variables de entorno del sistema”**
2.  En la ventana, pulsa **Variables de entorno**
3.  En “Variables del sistema”, pulsa **Nueva**
4.  Nombre de la variable: JAVA\_HOME
5.  Valor de la variable: La ruta donde instalaste el JDK, por ejemplo: C:\\Program Files\\Java\\jdk-17
6.  Acepta todo

**🟨 4. Añadir Java al PATH**

Esto permite usar java y javac desde la consola.

1.  En “Variables del sistema”, busca la variable **Path**
2.  Pulsa **Editar**
3.  Añade una nueva entrada: %JAVA\_HOME%\\bin
4.  Acepta todo

**🟪 5. Comprobar la instalación**

Abre una terminal (CMD o PowerShell) y escribe:

![](./03-instalacion%20jdk_images/image-001.png)

Debe mostrar la versión instalada.

Luego:

![](./03-instalacion%20jdk_images/image-002.png)

Si aparece la versión del compilador, todo está correcto.

**🟫 6. ¿Qué incluye el JDK?**

-   java → ejecuta programas
-   javac → compila código
-   javadoc → genera documentación
-   jar → empaqueta archivos
-   jshell → consola interactiva para probar código
-   Librerías estándar de Java

**🟦 7. Resumen rápido**

-   Descarga el JDK (Oracle o OpenJDK)
-   Instálalo con el instalador
-   Configura JAVA\_HOME
-   Añade %JAVA\_HOME%\\bin al PATH
-   Comprueba con java -version y javac -version