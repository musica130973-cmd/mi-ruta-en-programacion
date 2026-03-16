**2\. REPOSITORIOS LOCALES VS REMOTOS**

En Git, todo gira en torno a los **repositorios**, que son los lugares donde se almacena el historial del proyecto. Existen dos tipos principales:

-   **Repositorio local** → en tu ordenador
-   **Repositorio remoto** → en un servidor (GitHub, GitLab, Bitbucket…)

Entender la diferencia entre ambos es clave para trabajar con Git de forma profesional.

**📌 1. ¿Qué es un repositorio local?**

Un **repositorio local** es la copia del proyecto que tienes en tu propio ordenador. Es donde trabajas la mayor parte del tiempo.

**✔ Características del repositorio local**

-   No necesita internet
-   Contiene **todo el historial** del proyecto
-   Permite hacer commits, ramas, merges…
-   Es rápido y seguro
-   Es privado por defecto

**✔ ¿Qué puedes hacer en un repositorio local?**

![](./03-repositorios%20locales%20vs%20remotos_images/image-001.png)

👉 **Todo esto ocurre solo en tu máquina.**

**📌 2. ¿Qué es un repositorio remoto?**

Un **repositorio remoto** es una copia del repositorio almacenada en un servidor externo, normalmente en la nube.

Ejemplos:

-   GitHub
-   GitLab
-   Bitbucket

**✔ Características del repositorio remoto**

-   Necesita internet
-   Permite compartir el proyecto
-   Facilita la colaboración
-   Sirve como copia de seguridad
-   Permite Pull Requests, Issues, CI/CD…

**✔ ¿Qué puedes hacer con un repositorio remoto?**

![](./03-repositorios%20locales%20vs%20remotos_images/image-002.png)

👉 **El repositorio remoto es el punto de encuentro del equipo.**

**📌 3. Diferencias clave entre repositorio local y remoto**

| **Característica** | **Repositorio Local** | **Repositorio Remoto** |
| --- | --- | --- |
| Ubicación | Tu ordenador | Servidor (GitHub, GitLab…) |
| Internet | No necesario | Sí necesario |
| Privacidad | Totalmente privado | Puede ser público o privado |
| Velocidad | Muy rápido | Depende de la conexión |
| Colaboración | Limitada | Ideal para trabajar en equipo |
| Copia de seguridad | No garantizada | Sí, en la nube |
| Comandos típicos | init, add, commit | push, pull, clone |

**📌 4. ¿Cómo se relacionan local y remoto?**

Normalmente trabajas así:

1.  **Creas o clonas un repositorio local**
2.  Haces cambios y commits en tu máquina
3.  Cuando quieres compartirlos, haces un **push** al remoto
4.  Si otros han trabajado, haces **pull** para traer sus cambios
5.  Git sincroniza ambos repositorios

👉 El repositorio local es tu espacio de trabajo

👉 El repositorio remoto es el espacio compartido

**📌 5. Ejemplo visual del flujo**

![](./03-repositorios%20locales%20vs%20remotos_images/image-003.png)

**📌 6. ¿Puedo trabajar solo con repositorios locales?**

Sí. Git funciona perfectamente sin repositorios remotos.

Pero perderías:

-   Copias de seguridad
-   Colaboración
-   Pull Requests
-   Issues
-   Integración continua

**📌 7. ¿Puedo trabajar solo con repositorios remotos?**

No. Git **siempre** necesita un repositorio local para funcionar. GitHub solo almacena la copia remota.

**🎯 Resumen final**

-   El **repositorio local** es tu copia personal del proyecto.
-   El **repositorio remoto** es la copia compartida en la nube.
-   Git trabaja principalmente en local; GitHub sirve para colaborar.
-   La sincronización se hace con push, pull y fetch.