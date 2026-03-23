// Pide un número:
// 1. Círculo
// 2. Cuadrado
// 3. Triángulo
// 4. Rectángulo
// Muestra el número de la figura
// Si el número no está entre el 1 y el 4, muestra "Opción no válida"

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número (1-4): ");
        int numero = entrada.nextInt();

        switch (numero){
            case 1 -> System.out.println("Círculo");
            case 2 -> System.out.println("Cuadrado");
            case 3 -> System.out.println("Triángulo");
            case 4 -> System.out.println("Rectángulo");
            default -> System.out.println("Opción no válida");
        }
        entrada.close();
    }
}
