// Ejercicio 1
// Pide al usuario su nombre y muestra un saludo

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");

        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre);

        sc.close();

    }
}
