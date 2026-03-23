// Ejercicio 6
// Pide un carácter por teclado y muestra "No es vocal" si el carácter no es una vocal minúscula

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca una letra: ");
        char caracter = entrada.nextLine().charAt(0);

        boolean esVocal = (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u');

        if(!(esVocal)){
            System.out.println(caracter + " no es una vocal");
        }else{
            System.out.println(caracter + " es una vocal");
        }

    }
}
