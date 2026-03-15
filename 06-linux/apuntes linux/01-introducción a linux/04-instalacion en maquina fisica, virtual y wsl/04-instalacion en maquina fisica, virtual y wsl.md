**4\. INSTALACIÓN EN MÁQUINA FÍSICA, VIRTUAL Y WSL**

**🧩 1. Introducción**

Linux puede instalarse de varias formas según las necesidades del usuario:

-   **Máquina física** → Instalación tradicional en un ordenador real.
-   **Máquina virtual** → Instalación dentro de un entorno simulado.
-   **WSL (Windows Subsystem for Linux)** → Integración de Linux dentro de Windows sin máquina virtual completa.

Cada método tiene ventajas, limitaciones y usos recomendados.

**🖥️ 2. Instalación en Máquina Física**

**✔️ ¿Qué es?**

Consiste en instalar Linux directamente en el **hardware real** del equipo, ya sea como único sistema operativo o junto a otro (dual boot).

**✔️ Requisitos**

-   Imagen ISO de la distribución.
-   USB booteable.
-   Configurar BIOS/UEFI para arrancar desde USB.

**✔️ Pasos generales**

1.  Descargar la ISO de la distribución (Ubuntu, Debian, Fedora…).
2.  Crear un USB booteable (con Rufus, Etcher…).
3.  Arrancar desde el USB.
4.  Elegir instalación:
    -   Solo Linux
    -   Dual boot con Windows
5.  Particionar el disco (automático o manual).
6.  Configurar usuario, zona horaria y software.
7.  Instalar y reiniciar.

**✔️ Ventajas**

-   Máximo rendimiento.
-   Acceso completo al hardware.
-   Ideal para servidores o uso diario.

**✔️ Desventajas**

-   Requiere modificar particiones.
-   Riesgo de pérdida de datos si se hace mal.
-   No es tan flexible como una máquina virtual.

**🧪 3. Instalación en Máquina Virtual**

**✔️ ¿Qué es?**

Consiste en instalar Linux dentro de un **entorno virtualizado**, usando programas como:

-   VirtualBox
-   VMware
-   Hyper-V

El sistema operativo se ejecuta como si fuera un programa más dentro del host.

**✔️ Requisitos**

-   Software de virtualización.
-   ISO de la distribución.
-   Recursos asignados (RAM, CPU, disco).

**✔️ Pasos generales**

1.  Crear una nueva máquina virtual.
2.  Asignar memoria, procesadores y disco virtual.
3.  Montar la ISO como unidad de arranque.
4.  Iniciar la máquina virtual.
5.  Instalar Linux como si fuera un equipo real.

**✔️ Ventajas**

-   No afecta al sistema principal.
-   Permite probar varias distribuciones.
-   Ideal para prácticas, desarrollo y pruebas.
-   Fácil de borrar o restaurar mediante snapshots.

**✔️ Desventajas**

-   Menor rendimiento que en hardware real.
-   Acceso limitado a GPU y hardware avanzado.
-   Requiere buena cantidad de RAM y CPU.

**🪟 4. Instalación en WSL (Windows Subsystem for Linux)**

**✔️ ¿Qué es?**

WSL permite ejecutar **Linux dentro de Windows** sin necesidad de máquina virtual completa. Es una capa de compatibilidad integrada en Windows 10 y 11.

Existen dos versiones:

-   **WSL 1** → Traducción de llamadas del kernel.
-   **WSL 2** → Kernel Linux real con virtualización ligera.

**✔️ Instalación básica**

1.  Activar WSL desde Windows.
2.  Instalar una distribución desde Microsoft Store (Ubuntu, Debian…).
3.  Configurar usuario y entorno.

**✔️ Ventajas**

-   Muy rápido de instalar.
-   Integración total con Windows (carpetas, comandos, herramientas).
-   Ideal para desarrollo web, Python, Docker (WSL2).
-   No requiere particiones ni máquinas virtuales completas.

**✔️ Desventajas**

-   No es un sistema completo como en hardware real.
-   Algunas funciones avanzadas pueden no estar disponibles.
-   Dependencia del entorno Windows.

**⚖️ 5. Comparativa general**

| **Característica** | **Máquina Física** | **Máquina Virtual** | **WSL** |
| --- | --- | --- | --- |
| **Rendimiento** | Máximo | Medio | Alto (WSL2) |
| **Dificultad** | Media | Baja | Muy baja |
| **Acceso al hardware** | Completo | Limitado | Parcial |
| **Riesgo para el sistema** | Medio | Muy bajo | Nulo |
| **Uso recomendado** | Uso diario, servidores | Pruebas, aprendizaje | Desarrollo en Windows |

**📝 6. Resumen final**

-   **Máquina física**: mejor rendimiento y control total, ideal para uso real.
-   **Máquina virtual**: perfecta para aprender, probar y experimentar sin riesgos.
-   **WSL**: solución rápida y práctica para desarrolladores que usan Windows.

Cada método tiene su propósito, y elegir uno depende de tus necesidades, experiencia y hardware disponible.