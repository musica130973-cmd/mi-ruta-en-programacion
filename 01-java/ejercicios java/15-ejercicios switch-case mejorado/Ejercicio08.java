// Pide una letra y determina si es:
// - Vocal
// - Consonante
// - No es una letra

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca una letra: ");
        char letra = entrada.next().toLowerCase().charAt(0);

        switch (letra){
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Es una vocal");
            default -> System.out.println("Es una consonante");
        }
    }
}
