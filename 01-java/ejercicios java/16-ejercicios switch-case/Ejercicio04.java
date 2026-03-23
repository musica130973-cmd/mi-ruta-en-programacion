// Ejercicio 4
// Pide al usuario una nota del 0 al 10 y muestra su calificación
// 0-4 insuficiente
// 5 suficiente
// 6 bien
// 7-8 notable
// 9-10 sobresaliente

// Importamos la clase Scanner para poder leer datos del usuario desde el teclado
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado "entrada" para leer la nota introducida por el usuario
        Scanner entrada = new Scanner(System.in);

        // Leemos un número entero (la nota) y lo guardamos en la variable "nota"
        System.out.print("Introduzca su nota: ");
        int nota = entrada.nextInt();

        // La estructura switch evalúa el valor de "nota" y ejecuta el caso correspondiente.
        switch (nota){
            // Si la nota es 0, 1, 2, 3 o 4
            case 0, 1, 2, 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            // Si la nota es 7 u 8
            case 7, 8:
                System.out.println("Notable");
                break;
            // Si la nota es 9 o 10
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            // Si la nota no está entre 0 y 10
            default:
                System.out.println("Nota incorrecta");
        }
    }
}
