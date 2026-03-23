import java.util.Scanner;

// Mayor de dos números
// Lee dos números y muestra cuál es mayor (o si son iguales)
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Introduzca el segundo número: ");
        int numero2 = entrada.nextInt();

        if(numero1 > numero2){
            System.out.println(numero1 + " es mayor que " + numero2);
        }else if(numero1 < numero2){
            System.out.println(numero2 + " es mayor que " + numero1);
        }else{
            System.out.println(numero1 + " es igual que " + numero2);
        }
    }
}

