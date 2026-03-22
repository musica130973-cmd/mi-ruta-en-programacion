// Ejercicio 7
// Overflow por casting

public class Ejercicio7 {
    public static void main(String[] args) {

        // Declaramos un int con valor 130.
        // Un int usa 32 bits, así que puede almacenar este número sin problema.
        int grande = 130;


        // Hacemos un casting explícito de int a byte.
        // Un byte solo puede almacenar valores entre -128 y 127 (8 bits).
        // Como 130 está fuera de ese rango, ocurre un OVERFLOW.
        // El valor "da la vuelta" dentro del rango permitido por byte.
        byte small = (byte) grande;

        // Imprimimos el resultado
        System.out.println(small);  // -126
    }
}
