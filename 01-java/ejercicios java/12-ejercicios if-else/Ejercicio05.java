// Calculadora simple
// Pide dos números y un operador (+,-,*,/). Realiza la operación usando if-else

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.println("Introduce el segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Elija la operación que quiere realizar (+,-,*,/): ");
        char operacion = entrada.next().charAt(0);
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int producto = numero1 * numero2;



        if(operacion == '+'){
            System.out.println(suma);

        }else if(operacion == '-'){
            System.out.println(resta);

        }else if(operacion == '*'){
            System.out.println(producto);

        } else if (operacion == '/'){
            if(numero2 != 0){
                System.out.println(numero1 / numero2);
            }else{
                System.out.println("Error: división entre cero");
            }
        }else{
            System.out.println("Operador no válido");
        }
    }
}
