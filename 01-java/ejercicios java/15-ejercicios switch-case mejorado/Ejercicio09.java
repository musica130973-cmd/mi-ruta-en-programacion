// Crea un menú:
// 1. Convertir km a metros
// 2. Convertir metro a centímetros
// 3. Convertir kiligramos a gramos
// Pide el valor y raliza la conversion
// Si la opción no existe, muestra un error

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Convertir km. a m.");
        System.out.println("2. Convertir m. a cm.");
        System.out.println("3. Convertir kg. a g.");
        System.out.print("Elige una opción: ");
        int opcion = entrada. nextInt();

        System.out.print("Introduce el valor: ");
        double valor = entrada.nextDouble();

        switch (opcion){
            case 1 -> System.out.println(valor + " km.= " + (valor * 1000) + " m.");
            case 2 -> System.out.println(valor + " m.= " + (valor * 100) + " cm.");
            case 3 -> System.out.println(valor + " kg.= " + (valor * 1000) + " gr.");
            default -> System.out.println("Valor inválido");
        }
    }
}
