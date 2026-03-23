import java.sql.SQLOutput;
import java.util.Scanner;

// Validar acceso: mayor de edad y con entrada
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt();

        System.out.print("Tiene usted entrada (true/false): ");
        boolean tieneEntrada = sc.nextBoolean();


        boolean puedeEntrar = (edad >= 18) && tieneEntrada;
        System.out.println("Puede entrar: " + puedeEntrar);
    }
}
