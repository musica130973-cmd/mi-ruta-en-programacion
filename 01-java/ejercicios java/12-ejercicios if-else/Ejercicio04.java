// Edad válida para votar
// Pide la edad y muestra si puede votar >= 18 y si es mayor de 65, indica que es "voto preferente"

import java.sql.SQLOutput;
import java.util.Scanner;

class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        int edad = entrada.nextInt();

        if(edad >= 18){
            if(edad >= 65){
                System.out.println("Puede votar (voto preferente)");
            }else{
                System.out.println("Puede votar");
            }
        }else{
            System.out.println("No puede votar");
        }
    }
}