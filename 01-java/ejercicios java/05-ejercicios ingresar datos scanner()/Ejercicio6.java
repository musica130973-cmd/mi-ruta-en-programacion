// Ejercicio 6
// Pide tres notas y calcula el promedio


import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int media;

        for(int i = 0; i <= 2; i++){
            System.out.print("Introduzca un primer número: ");
            numero = sc.nextInt();
            suma += numero;

        }
        media = suma / 3;
        System.out.println("La media de los números introducidos es: " + media);
    }
}
