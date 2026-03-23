// Ejercicio 2
// Pide la edad de una persona y muestra "No es mayor de edad" si NO tiene 18 o mas

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        int edad = entrada.nextInt();

        if(!(edad >= 18)){
            System.out.println("Usted no es mayor de edad");
        }
        entrada.close();
    }
}
