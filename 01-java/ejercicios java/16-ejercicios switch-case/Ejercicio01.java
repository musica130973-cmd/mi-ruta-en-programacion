// Ejercicio 1
// Crea un programa que muestre un menú con 4 opciones
// 1. Sumar
// 2. Restar
// 3. Multiplicar
// 4. Dividir
// El usuario introduce una opción (1-4) y el programa muestra un mensaje indicando la operación elegida.

// Importamos la clase Scanner para poder leer datos del teclado
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado "entrada" para poder leer números o textos
        Scanner entrada = new Scanner(System.in);

        // Mostramos un menú con las opciones disponibles
        System.out.println("Elige una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        // Leemos un número entero que el usuario introduce y lo guardamos en la variable "numero"
        int numero = entrada.nextInt();

        // La estructura switch evalúa el valor de "numero" y ejecuta el caso correspondiente
        switch(numero){
            case 1:
                System.out.println("Has elegido SUMAR");
                break;  // break evita que el programa siga ejecutandose los demás casos
            case 2:
                System.out.println("Has elegido RESTAR");
                break;
            case 3:
                System.out.println("Has elegido MULTIPLICAR");
                break;
            case 4:
                System.out.println("Has elegido DIVIDIR");
                break;
            default:
                System.out.println("Opción no válida"); // Se ejecuta si el usuario introduce un número que no está entre 1 y 4
        }
    }
}
