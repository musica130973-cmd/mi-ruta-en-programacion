// Pide dos números y un operador (+,-,*,/)
// Usa switch para realizar la operación correspondiente

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Introduzca el segundo número: ");
        double numero2 = entrada.nextInt();

        System.out.println("Introduzca el operador: (+,-,*,/)");
        char operador = entrada.next().charAt(0);

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double producto = numero1 * numero2;
        double cociente = numero1 / numero2;

        switch (operador){
            case '+' -> System.out.println("Resultado: " + suma);
            case '-' -> System.out.println("Resultado: " + resta);
            case '*' -> System.out.println("Resultado: " + producto);
            case '/' -> {
                if(numero2 == 0) System.out.println("Error: división entre cero");
                else System.out.println("Resultado: " + cociente);
            }
            default -> System.out.println("Operador no válido");
        }
        entrada.close();
    }
}
