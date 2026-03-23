// Pide un número y muestra "El número NO está entre 10 y 20" si el número no pertenece al intervalo cerrado [10, 20]

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = entrada.nextInt();

        boolean rango = (numero >= 10 && numero <= 20);

        if(!rango){
            System.out.println(numero + " no está entre 10 y 20");
        }else{
            System.out.println(numero + " está entre 10 y 20");
        }
    }
}
