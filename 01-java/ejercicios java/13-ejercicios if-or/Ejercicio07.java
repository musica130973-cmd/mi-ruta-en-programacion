// Descuento aplicable

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        int edad = entrada.nextInt();

        System.out.println("¿Tiene tarjeta de fidelidad? true/false");
        boolean tarjeta = entrada.nextBoolean();

        if(edad < 12 || edad > 65 || tarjeta){
            System.out.println("Descuento aplicado");
        }else{
            System.out.println("No tiene descuento");
        }
    }
}
