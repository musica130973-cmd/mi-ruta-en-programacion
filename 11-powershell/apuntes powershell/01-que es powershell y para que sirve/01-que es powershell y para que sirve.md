1.  **QUÉ ES POWERSHELL Y PARA QUÉ SIRVE**

**📌 1. ¿Qué es PowerShell?**

PowerShell es un **lenguaje de scripting** y un **entorno de automatización** desarrollado por Microsoft. Su principal característica es que está basado en **objetos**, no en texto, lo que lo hace mucho más potente y flexible que otros intérpretes de comandos tradicionales.

PowerShell combina:

-   Un **shell interactivo** (como CMD o Bash)
-   Un **lenguaje de programación completo**
-   Un sistema de **automatización y administración** para Windows, Linux y macOS

Es una herramienta diseñada para administradores de sistemas, desarrolladores y profesionales IT que necesitan automatizar tareas, gestionar equipos y controlar sistemas de forma eficiente.

**📌 2. ¿Por qué PowerShell es diferente a CMD?**

CMD es un intérprete de comandos muy limitado y basado en texto. PowerShell, en cambio:

| **CMD** | **PowerShell** |
| --- | --- |
| Basado en texto | Basado en **objetos** |
| Comandos simples | Cmdlets potentes y estructurados |
| Difícil de automatizar | Ideal para automatización |
| Solo Windows | Multiplataforma (Windows, Linux, macOS) |
| Sintaxis antigua | Lenguaje moderno y extensible |

La diferencia clave es que **PowerShell no devuelve texto, sino objetos completos**, lo que permite manipular datos de forma mucho más precisa.

**📌 3. PowerShell Core vs Windows PowerShell**

Existen dos versiones principales:

**Windows PowerShell (5.1)**

-   Solo para Windows
-   Basado en .NET Framework
-   Incluye módulos clásicos del sistema operativo

**PowerShell Core (7.x)**

-   Multiplataforma
-   Basado en .NET 6/7
-   Más rápido, moderno y actualizado
-   Recomendado para nuevos proyectos

Ambas versiones comparten la mayoría de comandos, pero PowerShell Core es el futuro del ecosistema.

**📌 4. ¿Para qué sirve PowerShell?**

PowerShell sirve para **automatizar prácticamente cualquier tarea** relacionada con sistemas, redes, aplicaciones o servicios.

**✔️ Administración del sistema operativo**

-   Procesos, servicios, tareas programadas
-   Archivos, carpetas, permisos
-   Registro de Windows
-   Hardware y drivers

**✔️ Gestión de usuarios y seguridad**

-   Usuarios y grupos locales
-   ACLs y permisos
-   Políticas de ejecución
-   Firmado de scripts

**✔️ Automatización de tareas repetitivas**

-   Backups
-   Limpieza de logs
-   Instalación de software
-   Configuración de equipos

**✔️ Administración remota**

-   Ejecutar comandos en múltiples equipos
-   Sesiones remotas
-   Gestión de servidores

**✔️ Integración con la nube**

-   Azure PowerShell
-   AWS Tools for PowerShell
-   Automatización de recursos cloud

**✔️ Trabajo con APIs y datos**

-   APIs REST
-   JSON, CSV, XML
-   Generación de informes

**✔️ Creación de scripts y módulos**

-   Scripts complejos
-   Funciones reutilizables
-   Módulos personalizados

En resumen: **PowerShell es una navaja suiza para administradores y automatizadores**.

**📌 5. Conceptos clave para entender PowerShell**

Antes de profundizar, es importante conocer estos conceptos:

**Cmdlets**

Comandos nativos de PowerShell con formato **Verbo-Nombre**, como:

-   Get-Process
-   Set-Location
-   Start-Service

**Objetos**

Todo lo que devuelve PowerShell es un objeto con propiedades y métodos.

**Pipelines (|)**

Permiten encadenar comandos pasando **objetos**, no texto.

Ejemplo:

![](./01-que%20es%20powershell%20y%20para%20que%20sirve_images/image-001.png)

**Módulos**

Colecciones de cmdlets y funciones que amplían PowerShell.

**Scripts (.ps1)**

Archivos que contienen código para automatizar tareas.

**📌 6. ¿Por qué aprender PowerShell?**

PowerShell es una habilidad clave para:

-   Administradores de sistemas
-   Técnicos de soporte
-   DevOps
-   Administradores de redes
-   Profesionales cloud
-   Pentesters y analistas de seguridad
-   Cualquier persona que quiera automatizar tareas

Aprender PowerShell te permite:

-   Ahorrar tiempo
-   Reducir errores
-   Gestionar cientos de equipos a la vez
-   Crear herramientas propias
-   Integrarte con entornos cloud y CI/CD

**📝 Resumen final**

PowerShell es un **lenguaje de automatización moderno, potente y multiplataforma**, diseñado para administrar sistemas, automatizar tareas y trabajar con objetos de forma eficiente.

Es una herramienta imprescindible en entornos profesionales y una de las competencias más valoradas en IT.