// ¿El número está fuera de rango 10-20?

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();

        if(numero < 10 || numero > 20){
            System.out.println("El número está fuera del rango");
        }else{
            System.out.println("El número está dentro del rango");
        }
    }
}
