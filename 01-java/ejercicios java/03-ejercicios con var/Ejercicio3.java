// Ejercicio 3
// Listas con var

import java.util.ArrayList; //Se importa la clase ArrayList, necesaria para crear listas dinámicas en Java

public class Ejercicio3 {
    public static void main(String[] args) {

        // Se declara una variable usando "var". El compilador infiere el tipo automáticamente
        // En este caso, como estamos creando un new ArrayList<String>()
        // el tipo inferido será: ArrayList<String>
        var lista = new ArrayList<String>();

        //Se añaden elementos a la lista usando el método add()
        lista.add("Piano");
        lista.add("Astra");
        lista.add("Studio");

        // Se imprime el contenido de la lista
        // ArrayList tiene un toString() que muestra los elementos entre corchetes.
        System.out.println(lista);
    }
}
