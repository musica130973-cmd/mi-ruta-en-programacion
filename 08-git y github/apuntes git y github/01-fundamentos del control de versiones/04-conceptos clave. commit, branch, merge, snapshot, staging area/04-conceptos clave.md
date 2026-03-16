**4\. CONCEPTOS CLAVE. COMMIT, BRANCH, MERGE, SNAPSHOT, STAGING AREA**

**📌 1. Snapshot**

Git **no guarda archivos como diferencias**, sino como **fotografías completas del estado del proyecto** en un momento concreto.

**📝 Ideas clave**

-   Cada vez que haces un commit, Git crea un **snapshot** del contenido.
-   Si un archivo no ha cambiado, Git **no lo duplica**, solo apunta al anterior.
-   Esto hace que Git sea **muy rápido y eficiente**.

**📎 Ejemplo mental**

Piensa en un álbum de fotos: cada commit es una foto completa del proyecto.

**📌 2. Staging Area (o *index*)**

Es una **zona intermedia** donde preparas los cambios antes de confirmarlos.

**📝 Ideas clave**

-   Permite elegir **qué cambios** quieres incluir en el próximo commit.
-   Se llena con git add.
-   Es como una “cesta” donde vas metiendo archivos antes de empaquetarlos.

**📎 Ejemplo mental**

Como preparar ingredientes en la encimera antes de cocinar: solo lo que pongas ahí irá a la receta (commit).

**📌 3. Commit**

Un commit es una **confirmación** de los cambios que están en el *staging area*.

**📝 Ideas clave**

-   Representa un **punto en la historia** del proyecto.
-   Incluye un **mensaje** que explica qué se hizo.
-   Tiene un **hash único** que lo identifica.
-   Es inmutable: una vez creado, no cambia (aunque puedes crear commits nuevos que lo modifiquen).

**📎 Ejemplo mental**

Un commit es como guardar una versión del documento en un historial con una nota explicativa.

**📌 4. Branch**

Una branch (rama) es una **línea de desarrollo independiente**.

**📝 Ideas clave**

-   Permite trabajar en nuevas funciones sin afectar al código principal.
-   La rama principal suele ser main o master.
-   Crear ramas es muy barato y rápido en Git.
-   Cada rama es simplemente un **puntero a un commit**.

**📎 Ejemplo mental**

Imagina un árbol: cada rama crece desde el tronco, pero puede avanzar por su propio camino.

**📌 5. Merge**

El merge combina los cambios de una rama con otra.

**📝 Ideas clave**

-   Une dos líneas de desarrollo.
-   Puede ser:
    -   **Fast-forward**: si no hay divergencia, Git solo mueve el puntero.
    -   **Merge commit**: si hay cambios en ambas ramas, crea un commit especial.
-   Si los mismos archivos se modifican en partes incompatibles, aparece un **conflicto**.

**📎 Ejemplo mental**

Es como juntar dos versiones de un documento en una sola versión final.

**🧩 Resumen**

| **Concepto** | **Qué es** | **Para qué sirve** |
| --- | --- | --- |
| **Snapshot** | Foto del proyecto | Guardar el estado completo |
| **Staging Area** | Zona de preparación | Elegir qué va al commit |
| **Commit** | Punto en la historia | Registrar cambios |
| **Branch** | Línea de desarrollo | Trabajar en paralelo |
| **Merge** | Unión de ramas | Integrar cambios |