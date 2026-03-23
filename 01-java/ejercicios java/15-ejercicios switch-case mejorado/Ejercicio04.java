// 1.Mostrar “Has elegido la opción 1”
// 2.Mostrar “Has elegido la opción 2”
// 3.Mostrar “Has elegido la opción 3”
// 4.Salir
// Si el usuario elige otra opción, mostrar “Opción no válida”


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("MENÚ");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");

        int opcion = entrada.nextInt();

        switch (opcion){
            case 1 -> System.out.println("Has elegido la opción 1");
            case 2 -> System.out.println("Has elegido la opción 2");
            case 3 -> System.out.println("Has elegido la opción 3");
            case 4 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción no válida");
        }
        entrada.close();
    }
}
