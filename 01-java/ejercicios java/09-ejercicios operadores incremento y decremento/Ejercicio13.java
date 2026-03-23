// Ejercicio 13
// Recorrer el array al revés
// Imprime un array desde el final usando i--

public class Ejercicio13 {
    public static void main(String[] args) {

        // Array de nombres de 5 elementos
        String[] nombres = {"Juan", "María", "Sofía", "Mario", "Esteban"};

        // Contador empieza en el último índice del array (length -1 = 4)
        int contador = nombres.length - 1;


        // Mientras contador sea mayor o igual a 0, seguimos recorriendo
        while(contador >= 0){

            // Imprime el elemnento actual y luego decrementa contador en 1
            // Iteración 1: contador = 4 Imprime "Esteban" contador pasa a 3
            // Iteración 2: contador = 3 Imprime "Mario" contador pasa a 2
            // Iteración 3: contador = 2 Imprime "Sofía" contador pasa a 1
            // Iteración 4: contador = 1 Imprime "Mario" contador pasa a 0
            // Iteración 5: contador = 0 Imprime "Juan" contatdor pasa a -1
            // Cuando contador = -1, la condición falla y el bucle termina
            System.out.println(nombres[contador--]);
        }
    }
}
