// Ejercicio 2
// Pide al usuario un número del 1 al 7 y muestra el día de la semana correspondiente

// Importamos la clase Scanner para poder leer datos introducidos por el usuario desde el teclado
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado "entrada" para leer el número que escriba el usuario
        Scanner entrada = new Scanner(System.in);

        // Mostramos un mensaje pidiendo un número del 1 al 7
        System.out.print("Introduzca un número (1-7)");

        // Guardamos en la variable "numero" el valor introducido por el usuario
        int numero = entrada.nextInt();

        // La estructura switch evalúa el valor de "numero" y ejecuta el caso correspondiente
        switch (numero){
            case 1:
                System.out.println("Lunes");
                break;  // Evita que se ejecuten los demás casos
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                // Se ejecuta si el usuario introduce un número fuera del rango 1-7
                System.out.println("Numero incorrecto");
        }
    }
}
