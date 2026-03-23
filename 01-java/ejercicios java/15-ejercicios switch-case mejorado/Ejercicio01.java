// Escribe un programa que pida un número del 1 al 7 y muestre el día de la semana correspondiente.
// Si el número no está entre 1 y 7, debe mostrar "Número inválido"

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número del 1 al 7: ");
        int numero = entrada.nextInt();

        switch (numero){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número incorrecto");
        }
    }
}
