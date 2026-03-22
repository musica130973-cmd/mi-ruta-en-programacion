// Ejercicio 9
// Casting entre clases (herencia)

public class Ejercicio9 {
    public static void main(String[] args) {

        // Clase base
        class Animal {}

        // Perro hereda de Animal
        class Perro extends Animal {}


        // Aquí creamos un Perro, pero lo guardamos en una variable de tipo Animal
        // Esto es válido porque Perro ES un Animal
        Animal a = new Perro();

        // Downcasting correcto:
        // El objeto REAL es un Perro, así que convertirlo a Perro funciona sin problema.
        Perro p = (Perro) a;

        // Aquí creamos un Animal "puro", NO un Perro.
        Animal a2 = new Animal();

        // Downcasting incorrecto:
        // Aunque el compilador lo permite (porque a2 es un Animal y podría ser un Perro),
        // en tiempo de ejecución Java comprueba el tipo REAL del objeto.
        // Como a2 NO es un Perro, se lanza ClassCastException.
        Perro p2 = (Perro) a2; // ERROR en tiempo de ejecución

    }
}
