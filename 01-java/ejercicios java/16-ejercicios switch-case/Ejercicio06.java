// Ejercicio 6
// Identificador de vocales y consonantes
// Pide al usuario una letra y determina si es:
// -vocal
// -consonante
// -No es una letra

// Importamos Scanner para poder leer lo que escriba el usuario por teclado
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado "entrada"
        Scanner entrada = new Scanner(System.in);

        // Leemos un texto del usuario, tomamos SOLO el primer carácter con charAt(0)
        // y lo convertimos a minúscula con toLowerCase() para simplificar las comparaciones
        System.out.print("Introduzca una letra: ");
        char letra = Character.toLowerCase(entrada.next().charAt(0));

        // Primer switch: comprueba si el carácter es una letra válida del alfabeto español
        switch (letra){
            // Si la letra está dentro de este grupo, entonces es una letra válida
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                 'j', 'k','l', 'm', 'n', 'ñ', 'o', 'p', 'q',
                 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z':
                // Segundo switch: determina si la letra es vocal o consonante
                switch (letra){
                    // Si coincide con alguna vocal
                    case 'a', 'e', 'i', 'o', 'u':
                        System.out.println("Es una vocal");
                        break;
                    // Si no es vocal, pero sí es letra, entonces es consonante
                    default:
                        System.out.println("Es una consonante");
                }
                break;
            // Si NO coincide con ninguna letra del alfabeto
            default:
                System.out.println("No es una letra válida");
        }

    }
}
