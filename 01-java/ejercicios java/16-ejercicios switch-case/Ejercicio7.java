// Ejercicio 7
// Tipo de figura geométrica

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.print("Elige una figura: ");
        int opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Has elegido un Círculo");
                break;
            case 2:
                System.out.println("Has elegido un Cuadrado");
                break;
            case 3:
                System.out.println("Has elegido un Triángulo");
                break;
            case 4:
                System.out.println("Has elegido un Rectángulo");
                break;
            default:
                System.out.println("Opción no válida");
        }
        entrada.close();
    }
}
