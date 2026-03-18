// Ejercicio 8. Calculadora simple
// Pide dos números y una operación(+,-,*,/) y muestra el resultado

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Introduzca el segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Introduzca la operacion a realizar (+, -, *, /)");
        char operacion = sc.next().charAt(0); // Lee lo que escribe el usuario y da solo el primer caracter

        double resultado = 0;

        switch (operacion){
            case '+': resultado = numero1 + numero2; break;
            case '-': resultado = numero1 - numero2; break;
            case '*': resultado = numero1 * numero2; break;
            case '/': resultado = numero1 / numero2; break;
            default: System.out.println("Operación no válida");
        }
        System.out.println("Resultado: " + resultado);
    }
}
