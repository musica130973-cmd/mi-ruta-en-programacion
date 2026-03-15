**3\. ESTRUCTURA GENERAL DEL SISTEMA LINUX**

**🧩 1. Introducción**

Linux está diseñado siguiendo la **filosofía UNIX**, basada en la simplicidad, modularidad y eficiencia. Su estructura se divide en capas, cada una con una función específica, lo que facilita la estabilidad, la seguridad y la flexibilidad del sistema.

**🏗️ 2. Estructura por capas del sistema Linux**

Linux puede entenderse como un conjunto de **capas** que trabajan juntas:

1.  **Hardware**
2.  **Kernel (núcleo)**
3.  **Shell**
4.  **Utilidades y herramientas del sistema**
5.  **Aplicaciones del usuario**

Vamos una por una.

**🔧 3. Hardware**

Es la base física del sistema:

-   CPU
-   Memoria RAM
-   Discos duros
-   Tarjetas de red
-   Periféricos

Linux interactúa con el hardware a través del **kernel**, que actúa como intermediario.

**🧠 4. Kernel (Núcleo de Linux)**

**✔️ ¿Qué es?**

El **kernel** es el corazón del sistema operativo. Gestiona los recursos y permite que el software se comunique con el hardware.

**✔️ Funciones principales**

-   **Gestión de procesos** (creación, planificación, finalización)
-   **Gestión de memoria**
-   **Gestión de dispositivos** (drivers)
-   **Gestión del sistema de archivos**
-   **Seguridad y permisos**
-   **Comunicación entre procesos (IPC)**

**✔️ Tipos de kernel en Linux**

-   **Monolítico** (Linux): incluye muchas funciones dentro del núcleo.
-   **Modular**: permite cargar y descargar módulos (drivers) dinámicamente.

**💻 5. Shell (Intérprete de comandos)**

**✔️ ¿Qué es?**

Es la **interfaz** entre el usuario y el sistema. Permite ejecutar comandos, scripts y automatizar tareas.

**✔️ Tipos de shell más comunes**

-   **Bash** (el más usado)
-   **Zsh**
-   **Fish**
-   **Sh**

**✔️ Funciones**

-   Interpretar comandos
-   Ejecutar programas
-   Gestionar variables de entorno
-   Automatizar tareas mediante scripts

**🛠️ 6. Utilidades y herramientas del sistema**

Son programas esenciales que permiten:

-   Administrar archivos
-   Configurar el sistema
-   Gestionar usuarios
-   Supervisar procesos
-   Instalar software

Ejemplos:

-   ls, cp, mv, rm
-   top, ps, kill
-   apt, dnf, pacman (gestores de paquetes)

Estas herramientas forman parte del proyecto **GNU**, por eso se habla de **GNU/Linux**.

**🗂️ 7. Sistema de archivos**

Linux organiza la información en un **árbol jerárquico** que comienza en / (root).

**Directorios principales**

| **Directorio** | **Función** |
| --- | --- |
| / | Raíz del sistema |
| /home | Carpetas de usuarios |
| /etc | Configuración del sistema |
| /bin | Comandos esenciales |
| /usr | Programas y librerías |
| /var | Datos variables (logs, colas…) |
| /dev | Dispositivos |
| /proc | Información del kernel y procesos |
| /boot | Archivos de arranque |

**👤 8. Aplicaciones de usuario**

Son los programas que el usuario final utiliza:

-   Navegadores (Firefox, Chrome)
-   Editores de texto (Nano, Vim, Gedit)
-   Suites ofimáticas (LibreOffice)
-   Reproductores multimedia
-   Herramientas de desarrollo

Estas aplicaciones se instalan mediante **gestores de paquetes** o desde repositorios.

**🔐 9. Gestión de usuarios y permisos**

Linux es un sistema **multiusuario** y **multitarea**.

**Tipos de usuarios**

-   **root**: administrador del sistema
-   **usuarios normales**
-   **usuarios del sistema** (para servicios)

**Permisos básicos**

-   **r** (read)
-   **w** (write)
-   **x** (execute)

Se aplican a:

-   **usuario propietario**
-   **grupo**
-   **otros**

**📝 10. Resumen final**

-   Linux se organiza en **capas**: hardware → kernel → shell → herramientas → aplicaciones.
-   El **kernel** es el núcleo que gestiona recursos y hardware.
-   El **shell** permite la interacción mediante comandos.
-   Las **herramientas GNU** y los **gestores de paquetes** facilitan la administración.
-   El sistema de archivos es jerárquico y comienza en /.
-   La gestión de usuarios y permisos garantiza seguridad y control.