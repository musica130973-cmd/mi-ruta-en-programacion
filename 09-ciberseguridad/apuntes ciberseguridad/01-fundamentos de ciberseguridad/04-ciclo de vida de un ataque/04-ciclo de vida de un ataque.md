**4\. CICLO DE VIDA DE UN ATAQUE**

El ciclo de vida de un ataque describe las **etapas que sigue un atacante** desde que identifica un objetivo hasta que logra sus metas (robo de datos, control del sistema, sabotaje, etc.). Conocer estas fases permite **anticiparse**, **detectar señales tempranas** y **romper la cadena** antes de que el ataque tenga éxito.

A continuación tienes las fases más aceptadas en el sector, basadas en modelos como **Lockheed Martin Cyber Kill Chain**, **MITRE ATT&CK** y metodologías de pentesting.

**🔍 1. Reconocimiento (Reconnaissance)**

El atacante recopila información sobre el objetivo.

**Qué busca**

-   Direcciones IP, dominios, puertos abiertos.
-   Empleados, correos, perfiles públicos.
-   Tecnologías usadas (CMS, servidores, versiones).
-   Vulnerabilidades conocidas.

**Técnicas típicas**

-   OSINT (Open Source Intelligence).
-   Escaneos pasivos y activos.
-   Recolección de metadatos.
-   Google Dorking.

**Objetivo**

Conocer al objetivo para planificar el ataque con precisión.

**🧪 2. Enumeración y análisis**

El atacante profundiza en la información obtenida para identificar **puntos débiles concretos**.

**Qué hace**

-   Identificar servicios vulnerables.
-   Enumerar usuarios, directorios, versiones.
-   Analizar configuraciones incorrectas.

**Técnicas**

-   Escaneo de puertos (Nmap).
-   Enumeración SMB, LDAP, DNS.
-   Fingerprinting de sistemas.

**💣 3. Explotación (Exploitation)**

El atacante aprovecha una vulnerabilidad para **obtener acceso inicial**.

**Qué puede explotar**

-   Vulnerabilidades de software (CVE).
-   Inyecciones (SQLi, XSS).
-   Contraseñas débiles.
-   Phishing o ingeniería social.

**Resultado**

Acceso inicial al sistema o ejecución de código.

**🚪 4. Acceso inicial y ejecución**

Una vez explotada la vulnerabilidad, el atacante ejecuta acciones dentro del sistema.

**Acciones típicas**

-   Crear una sesión remota.
-   Ejecutar comandos.
-   Descargar herramientas adicionales.

**🧗 5. Escalada de privilegios**

El atacante intenta obtener **mayor control** del sistema.

**Cómo lo hace**

-   Explotar vulnerabilidades locales.
-   Abusar de permisos mal configurados.
-   Capturar credenciales.
-   Bypass de UAC o sudo.

**Objetivo**

Convertirse en administrador/root.

**🔄 6. Movimiento lateral**

El atacante se desplaza por la red para comprometer **otros sistemas**.

**Técnicas**

-   Uso de credenciales robadas.
-   Pivoting y tunneling.
-   Explotación de servicios internos.

**Objetivo**

Llegar a sistemas más valiosos o críticos.

**📦 7. Persistencia**

El atacante asegura un **acceso continuo**, incluso si se reinicia el sistema o se cambia la contraseña.

**Métodos**

-   Crear usuarios ocultos.
-   Instalar backdoors o webshells.
-   Modificar tareas programadas.
-   Manipular servicios del sistema.

**📤 8. Exfiltración de datos**

El atacante roba información o la prepara para su extracción.

**Qué puede exfiltrar**

-   Bases de datos.
-   Credenciales.
-   Documentos sensibles.
-   Información personal o financiera.

**Técnicas**

-   Cifrado y compresión de datos.
-   Canales encubiertos (DNS, HTTPS).
-   Transferencias fragmentadas.

**🧨 9. Impacto final**

El atacante ejecuta su objetivo final.

**Puede incluir**

-   Ransomware.
-   Sabotaje o borrado de datos.
-   Manipulación de sistemas.
-   Publicación de información robada.
-   Extorsión.

**🛡️ 10. Limpieza de huellas**

El atacante intenta borrar evidencias para evitar ser detectado.

**Acciones**

-   Eliminar logs.
-   Borrar herramientas usadas.
-   Modificar marcas de tiempo.
-   Desactivar alertas.

**🎯 Resumen**

| **Fase** | **Objetivo** |
| --- | --- |
| Reconocimiento | Recopilar información |
| Enumeración | Identificar vulnerabilidades |
| Explotación | Obtener acceso inicial |
| Acceso y ejecución | Control básico del sistema |
| Escalada de privilegios | Obtener permisos elevados |
| Movimiento lateral | Expandir el compromiso |
| Persistencia | Mantener acceso |
| Exfiltración | Robar datos |
| Impacto | Cumplir el objetivo del ataque |
| Limpieza | Ocultar evidencias |