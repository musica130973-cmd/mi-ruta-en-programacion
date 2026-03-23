import java.util.Scanner;

// Pide una letra que represente una calificación:
// A: Excelente
// B: Notable
// C: Aprobado
// D: Insuficiente
// E: Muy Deficiente
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una calificación: (A-f): ");
        char nota = entrada.next().toUpperCase().charAt(0);

        switch (nota){
            case 'A' -> System.out.println("Excelente");
            case 'B' -> System.out.println("Notable");
            case 'C' -> System.out.println("Aprobado");
            case 'D' -> System.out.println("Insuficiente");
            case 'E' -> System.out.println("Muy Deficiente");
            default -> System.out.println("Calificación no válida");
        }
    }
}
