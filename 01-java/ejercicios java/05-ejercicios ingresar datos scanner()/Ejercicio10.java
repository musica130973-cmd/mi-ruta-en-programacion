// Ejercicio 10
// Pide al usuario una frase y muestra cuántos caracteres tiene

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine();

        int caracteres = frase.length();
        System.out.println("Número de caracteres de la frase: " + caracteres);
    }
}
