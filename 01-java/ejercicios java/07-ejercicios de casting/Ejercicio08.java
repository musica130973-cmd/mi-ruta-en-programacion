// Ejercicio 8
// Casting en Arrays (downcasting)

public class Ejercicio8 {


    public static void main(String[] args) {

        // Creamos un array de Object que contiene distintos tipos:
        // - String ("Hola") // - Integer (42) // - Double (3.14)
        // Un array de Object puede almacenar cualquier tipo de dato
        // porque todos los tipos en Java heredan de Object.
        Object[] datos = {"Hola", 42, 3.14};    // OK

        // Aquí accedemos al elemento en la posición 1 → 42
        // Ese valor es un Integer, y se puede convertir a int sin problema.
        int numero = (int) datos[1];            // OK

        // Aquí accedemos al elemento en la posición 2 → 3.14
        // Ese valor es un Double, y se puede convertir a double sin problema.
        double decimal = (double) datos[2];     // OK

        // Aquí está el problema:
        // datos[1] contiene un Integer (42), NO un String.
        // El compilador permite el casting porque Object podría ser un String,
        // pero en tiempo de ejecución Java detecta que el objeto real es un Integer
        // y lanza una excepción: ClassCastException.
        String error = (String) datos[1]; // Error en tiempo de ejecución
    }
}
