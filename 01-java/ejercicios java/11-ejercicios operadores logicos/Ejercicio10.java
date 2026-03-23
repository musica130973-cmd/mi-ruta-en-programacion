// Validar si un usuario puede acceder a una zona restringida
// - Tiene más de 18 años
// - Tiene una tarjeta de acceso válida
// - o, si no tiene tarjeta, puede entrar solo si es empleado
// - Además no puede estar marcado como "vetado"


import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt();

        System.out.print("Tiene tarjeta de acceso (true/false): ");
        boolean tarjeta = sc.nextBoolean();

        System.out.print("Es usted empleado (true/false): ");
        boolean empleado = sc.nextBoolean();

        System.out.print("¿Está ustde vetado? (true/false): ");
        boolean vetado = sc.nextBoolean();

        boolean acceso = ((edad > 18) && (tarjeta || empleado)) && !vetado;

        System.out.println("Usted puede acceder: " + acceso);

    }
}
