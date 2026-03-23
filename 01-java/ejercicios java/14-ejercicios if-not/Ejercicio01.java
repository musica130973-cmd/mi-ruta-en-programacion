// Ejercicio 1
// Escribe un programa que pida un número entero por teclado y muestre un mensaje solo si el número NO es positivo

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número");
        int numero = entrada.nextInt();

        if(!(numero > 0)){
            System.out.println(numero + " no es positivo");
        }
        entrada.close();
    }
}
