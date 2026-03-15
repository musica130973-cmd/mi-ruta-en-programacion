**TEMARIO LINUX**

**🐧 1. Introducción a Linux**

-   Historia y filosofía Unix
-   Distribuciones (Debian, Ubuntu, Red Hat, Arch, etc.)
-   Estructura general del sistema
-   Instalación en máquina física, máquina virtual y WSL
-   Diferencias entre kernel, shell y entorno gráfico

**📂 2. Sistema de archivos y navegación**

-   Jerarquía FHS (/bin, /etc, /var, /home, /usr, etc.)
-   Comandos esenciales: ls, cd, pwd, mkdir, rm, cp, mv
-   Rutas absolutas y relativas
-   Permisos y propietarios (chmod, chown, umask)
-   Enlaces duros y simbólicos

**🧰 3. Gestión de archivos y texto**

-   Visualización de contenido: cat, less, head, tail
-   Búsqueda: grep, find, locate
-   Manipulación de texto: cut, sort, uniq, awk, sed
-   Redirecciones y tuberías (>, >>, <, |)
-   Expresiones regulares básicas

**🖥️ 4. Shell y scripting**

-   Introducción a Bash
-   Variables, operadores y arrays
-   Condicionales y bucles
-   Funciones
-   Scripts automatizados
-   Cron jobs y tareas programadas
-   Buenas prácticas de scripting

**📦 5. Gestión de paquetes y software**

-   Sistemas de paquetes: APT, DNF/YUM, Pacman
-   Instalación, actualización y eliminación de software
-   Repositorios y PPAs
-   Compilación desde código fuente

**⚙️ 6. Procesos y administración del sistema**

-   Procesos y señales (ps, top, htop, kill)
-   Servicios y demonios (systemctl, service)
-   Logs del sistema (/var/log)
-   Gestión de usuarios y grupos (useradd, passwd, groupadd)
-   Control de recursos y monitoreo

**🌐 7. Redes en Linux**

-   Configuración de red
-   Comandos esenciales: ip, ifconfig, ping, netstat, ss, curl, wget
-   Puertos y sockets
-   SSH: conexión, claves, túneles
-   Firewall básico (UFW, firewalld, iptables)

**🗄️ 8. Almacenamiento y dispositivos**

-   Discos y particiones (lsblk, fdisk, parted)
-   Sistemas de archivos (ext4, xfs, btrfs)
-   Montaje y desmontaje (mount, umount)
-   LVM (Logical Volume Manager)
-   RAID (conceptos y configuración)

**🧱 9. Virtualización y contenedores**

-   Conceptos de virtualización
-   KVM/QEMU
-   Docker: imágenes, contenedores, volúmenes, redes
-   Introducción a Kubernetes (conceptos básicos)

**🔐 10. Seguridad en Linux**

-   Permisos avanzados: SUID, SGID, sticky bit
-   Gestión de claves SSH
-   Hardening básico del sistema
-   Auditoría y logs de seguridad
-   SELinux y AppArmor
-   Copias de seguridad (rsync, tar)
-   Buenas prácticas de ciberseguridad

**🧪 11. Automatización y administración avanzada**

-   Scripts avanzados
-   Ansible (conceptos básicos)
-   Gestión de configuraciones
-   Monitorización (Nagios, Prometheus, etc.)
-   Optimización del sistema

**🧩 12. Proyectos prácticos**

-   Configurar un servidor web (Apache o Nginx)
-   Crear un servidor SSH seguro
-   Automatizar tareas con Bash
-   Montar un servidor de bases de datos
-   Crear contenedores Docker para tus proyectos
-   Configurar un firewall completo
-   Implementar copias de seguridad automáticas

**🧭 13. Errores comunes y cómo evitarlos**

-   Ejecutar comandos como root sin necesidad
-   No revisar permisos antes de modificar archivos
-   No hacer copias de seguridad
-   No documentar scripts o configuraciones
-   No revisar logs al diagnosticar problemas