**1\. INSTALACIÓN DE PYTHON Y USO DE ENTORNOS VIRTUALES**

**🧩 1. ¿Qué es Python y por qué instalarlo correctamente?**

Python es un lenguaje interpretado, multiplataforma y muy utilizado en desarrollo web, automatización, ciencia de datos, ciberseguridad y más. Instalarlo correctamente y trabajar con entornos virtuales evita conflictos entre versiones y librerías, especialmente cuando trabajas en varios proyectos a la vez.

**🛠️ 2. Instalación de Python**

**🖥️ Windows**

1.  Entra en la web oficial: https://www.python.org/downloads
2.  Descarga la última versión estable.
3.  **Muy importante:** marca la casilla *“Add Python to PATH”*.
4.  Instala con las opciones por defecto.
5.  Comprueba la instalación:

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-001.png)

**🍏 macOS**

En macOS puedes instalar Python de dos formas:

**Opción 1: Instalador oficial**

Descarga el .pkg desde python.org e instálalo.

**Opción 2: Homebrew (recomendada)**

**![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-002.png)**

**Comprobar versión:**

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-003.png)

**🐧 Linux**

La mayoría de distribuciones ya incluyen Python. Para instalar o actualizar:

**Debian/Ubuntu**

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-004.png)

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-005.png)

**Arch Linux**

**![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-006.png)**

**📦 3. Instalación de pip (gestor de paquetes)**

En la mayoría de sistemas viene incluido. Comprueba si está disponible:

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-007.png)

Si no aparece, prueba:

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-008.png)

**🧰 4. ¿Qué es un entorno virtual y por qué usarlo?**

Un **entorno virtual** es un espacio aislado donde instalas librerías sin afectar al sistema ni a otros proyectos.

**Ventajas:**

-   Evita conflictos entre versiones de librerías.
-   Permite tener proyectos con dependencias distintas.
-   Mantiene tu sistema limpio.
-   Es la práctica estándar en Python profesional.

**🧪 5. Crear y activar un entorno virtual**

**Crear un entorno virtual**

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-009.png)

Esto genera una carpeta con todo lo necesario para ejecutar Python de forma aislada.

**Activar el entorno**

**Windows**

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-010.png)

**macOS / Linux**

**![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-011.png)**

Cuando está activo, verás el nombre del entorno al inicio de la línea de comandos.

**Desactivar el entorno**

**![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-012.png)**

**📚 6. Instalar librerías dentro del entorno**

Una vez activado:

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-013.png)

Ejemplo:

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-014.png)

Listar librerías instaladas:

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-015.png)

Guardar dependencias en un archivo:

**![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-016.png)**

Instalar dependencias desde ese archivo:

![](./01-instalacion%20de%20python%20y%20uso%20de%20entornos%20virtuales_images/image-017.png)

**🧠 7. Buenas prácticas**

-   Crea un entorno virtual **para cada proyecto**.
-   Guarda siempre un requirements.txt.
-   No instales librerías globalmente.
-   Usa nombres claros para tus entornos (venv, .env, env, etc.).
-   Añade la carpeta del entorno al .gitignore si usas Git.