// Ejercicio 7
// Comparación de double
// Compara dos valores decimales

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número decimal: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Introduzca otro número decimal: ");
        double numero2 = entrada.nextDouble();

        if(numero1 == numero2){
            System.out.println(numero1 + " es igual a " + numero2);
        }else{
            System.out.println(numero1 + " no es igual a " + numero2);
        }
    }
}
