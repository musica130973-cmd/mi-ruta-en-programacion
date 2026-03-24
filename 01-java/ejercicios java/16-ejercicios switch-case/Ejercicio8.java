// Ejercicio 8
// Pide al usuario su edad y clasificar asi:
// 0-12 niño
// 13-17 adolescente
// 18-64 adulto
// 65+ anciano

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();

        // Se usa un switch basado en la decena de la edad (edad / 10)
        switch (edad / 10){
            case 0: // Edades entre 0 y 9
            case 1: // Edades entre 10 y 19
                // Dentro de estas dos decenas se distinguen entre niño y adolescente
                if(edad <= 12){
                    System.out.println("Niño");
                }else{
                    System.out.println("Adolescente");
                }
                break;

            // Edades entre 20 y 69 (2,3,4,5,6 )
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Adulto");
                break;

            // Cualquier otro valor de decena
            default:
                // Si la edad es 65 o más, se considera anciano
                if(edad >= 65){
                    System.out.println("Anciano");
                }else{
                    System.out.println("Edad no válida"); // Para edades negativas o incoherentes
                }


        }
    }
}
