// Ejercicio 3
// Pide el usuario dos números y un operador matemático(+,-,*,/)
// Usa switch para realizar la operación correspondiente

// Importamos la clase Scanner para poder leer datos del usuario desde el teclado.
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner llamado "entrada" para leer números y texto.
        Scanner entrada = new Scanner(System.in);

        // Leemos el primer número introducido por el usuario y lo guardamos en numero1.
        System.out.print("Introduzca el primer número: ");
        double numero1 = entrada.nextDouble();

        // Leemos el segundo número y lo guardamos en numero2.
        System.out.print("Introduzca el segundo número: ");
        double numero2 = entrada.nextDouble();

        // Leemos un texto y nos quedamos solo con el primer carácter (el operador).
        System.out.print("Introduzca un operador: (+,-,*,/)");
        char operador = entrada.next().charAt(0);

        // Evaluamos qué operador ha introducido el usuario.
        switch (operador){
            // SUMA
            case '+':
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            // RESTA
            case '-':
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            // PRODUCTO
            case '*':
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            // COCIENTE
            case '/':
                // Antes de dividir, comprobamos que el divisor no sea cero
                if(numero2 != 0){
                    System.out.println("Resultado: " + (numero1 / numero2));
                }else{
                    System.out.println("Error: división entre cero");
                }
            default:
                // Se ejecuta si el usuario introduce un operador distinto de + - * /
                System.out.println("Operador incorrecto");

        }
    }
}

