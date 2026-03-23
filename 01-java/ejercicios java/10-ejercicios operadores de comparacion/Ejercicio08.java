// Ejercicio 8
// Comparar caracteres
// Compara dos caracteres según su código Unicode

import java.util.Scanner;

 class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca una letra: ");
        char letra1 = entrada.next().charAt(0);

        System.out.print("Introduzca otra letra: ");
        char letra2 = entrada.next().charAt(0);

        if(letra1 > letra2){
            System.out.println(letra1 + " es mayor que " + letra2);
        }else if(letra1 < letra2){
            System.out.println(letra1 + " es menor que " + letra2);
        }else{
            System.out.println(letra1 + " es igual que " + letra2);
        }
    }
}
