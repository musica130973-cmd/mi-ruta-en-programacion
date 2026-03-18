// Ejercicio 9

/*Pide la edad y muestra:
    Niño: (0-12)
    Adolescente: (13-17)
    Adulto: (18-64)
    Mayor: (65+)
 */


import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt();

        if (edad <= 12){
            System.out.println("Niño: (0-12)");
        }else if(edad <= 17){
            System.out.println("Adolescente: (13-17)");
        }else if(edad <= 64){
            System.out.println("Adulto: (18-64)");
        }else{
            System.out.println("Mayor: (65+)");
        }
    }
}
