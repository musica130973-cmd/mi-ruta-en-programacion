**3\. PRINCIPIOS DE SEGURIDAD. CONFIDENCIALIDAD. INTEGRIDAD. DISPONIBILIDAD (CIA)**

El modelo **CIA** es el pilar central de la ciberseguridad. Toda medida de protección, control o política se diseña para garantizar uno o varios de estos tres principios.

**🔒 1. Confidencialidad**

La **confidencialidad** garantiza que la información solo sea accesible por las personas, sistemas o procesos **autorizados**.

**Objetivo**

Evitar accesos no autorizados, fugas de datos o espionaje.

**Cómo se protege**

-   **Cifrado** de datos en tránsito y en reposo.
-   **Control de acceso** (ACL, permisos, roles).
-   **Autenticación fuerte** (MFA, contraseñas seguras).
-   **Clasificación de la información** (pública, interna, confidencial).
-   **Políticas de mínimo privilegio**.

**Ejemplos**

-   Un archivo cifrado que solo puede abrir el personal autorizado.
-   Un sistema que requiere MFA para acceder a datos sensibles.
-   Un servidor que solo permite acceso por VPN.

**🧭 2. Integridad**

La **integridad** asegura que la información se mantiene **correcta, completa y sin alteraciones no autorizadas**.

**Objetivo**

Evitar modificaciones accidentales o maliciosas.

**Cómo se protege**

-   **Hashing** (SHA-256, etc.).
-   **Firmas digitales**.
-   **Controles de versiones**.
-   **Registros de auditoría** (logs).
-   **Validación de entradas** en aplicaciones.
-   **Backups** para restaurar datos originales.

**Ejemplos**

-   Verificar que un archivo descargado coincide con su hash oficial.
-   Detectar cambios no autorizados en un sistema mediante logs.
-   Evitar que un atacante modifique transacciones o registros.

**⚙️ 3. Disponibilidad**

La **disponibilidad** garantiza que los sistemas, servicios y datos estén **accesibles cuando se necesiten**.

**Objetivo**

Evitar interrupciones, caídas o bloqueos del servicio.

**Cómo se protege**

-   **Redundancia** (servidores, discos, redes).
-   **Sistemas de alta disponibilidad (HA)**.
-   **Balanceo de carga**.
-   **Backups y planes de recuperación**.
-   **Protección contra DDoS**.
-   **Mantenimiento y actualizaciones**.

**Ejemplos**

-   Un servidor con alimentación eléctrica redundante.
-   Un sitio web protegido contra ataques DDoS.
-   Un sistema que sigue funcionando aunque falle un nodo.

**🧠 Relación entre los tres principios**

Aunque se estudian por separado, en la práctica están **interconectados**:

-   Un ataque DDoS afecta a la **disponibilidad**.
-   Un ransomware afecta a la **integridad** y a la **disponibilidad**.
-   Una filtración de datos afecta a la **confidencialidad**.

En muchos casos, mejorar uno puede afectar a otro. Por ejemplo:

-   Cifrar datos mejora la **confidencialidad**, pero puede reducir la **disponibilidad** si el sistema es lento.
-   Restringir accesos mejora la **confidencialidad**, pero puede dificultar la **disponibilidad** para usuarios legítimos.

Por eso la seguridad siempre busca un **equilibrio**.

**🎯 Resumen**

| **Principio** | **Qué protege** | **Ejemplos** |
| --- | --- | --- |
| **Confidencialidad** | Acceso a la información | Cifrado, MFA, permisos |
| **Integridad** | Exactitud de la información | Hashes, firmas, logs |
| **Disponibilidad** | Acceso a sistemas y datos | HA, backups, anti-DDoS |
