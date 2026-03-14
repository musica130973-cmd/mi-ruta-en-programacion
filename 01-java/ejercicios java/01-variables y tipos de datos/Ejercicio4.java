// Ejercicio 4. Operaciones con variables numéricas
// Calcula el área de un círculo usando un radio almacenado en una variable


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio en cm.: ");

        double radio = sc.nextDouble();
        double areaCirculo;

        areaCirculo = Math.PI * radio * radio;
        System.out.println("El radio del circulo es igual a: " + radio + "cm");
        System.out.printf("El área del círculo es igual a: %.2f cm²", areaCirculo);

    }
}
