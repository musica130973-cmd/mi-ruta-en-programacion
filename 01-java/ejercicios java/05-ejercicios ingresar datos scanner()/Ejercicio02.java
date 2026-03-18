// Ejercicio 2
// Sumar dos números
import java.util.Scanner;

//Pide dos números enteros y muestra la suma
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + suma);
    }
}
