// Ejercicio 3
// Número dentro de un rango
// Comprueba si un número está entre 1 y 100

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");

        int numero = entrada.nextInt();

        if(numero > 0 && numero < 101){
            System.out.println("El número " + numero + " está entre 1 y 100");
        }else{
            System.out.println("El número " + numero + " no está entre 1 y 100");
        }
    }
}
