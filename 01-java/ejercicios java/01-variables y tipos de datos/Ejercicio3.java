//Ejercicio 3. Entrada de datos con Scanner
//Pide al usuario su nombre, edad y si está activo.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Introduzca su edad: ");
        int edad = entrada.nextInt();

        System.out.print("¿Estas trabajando? True/False: ");
        boolean activo = entrada.nextBoolean();

        System.out.println("Hola " + nombre + "; usted tiene " + edad + " años y su actividad es: " + activo);

        entrada.close();
    }
}
