// Ejercicio 4
// Comparar edades
// Compara dos edades y muestra quién es mayor

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la primera edad: ");
        int edad1 = entrada.nextInt();

        System.out.print("Introduce la segunda edad: ");
        int edad2 = entrada.nextInt();

        if(edad1 > edad2){
            System.out.println(edad1 + " es mayor que " + edad2);
        }else if(edad1 < edad2){
            System.out.println(edad2 + " es mayor que " + edad1);
        }else{
            System.out.println(edad1 + " es igual que " + edad2);
        }
    }
}
