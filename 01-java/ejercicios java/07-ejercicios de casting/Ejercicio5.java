// Ejercicio 5
// Casting en operaciones mixtas

public class Ejercicio5 {
    public static void main(String[] args) {
        // Declaramos una variable entera.
        int a = 5;

        // Declaramos una variable de tipo double.
        // Este tipo permite decimales
        double b = 2.5;
        int resultado = (int) (a * b);


        // Aquí ocurre una operación mixta:
        // a (int) * b (double)
        // En Java, cuando mezclas tipos numéricos,
        // el resultado se convierte automáticamente al tipo más "grande".
        // En este caso: int -> double
        // Por eso (a * b) produce un double: 12.5
        // Como queremos guardarlo en un int, necesitamos un casting explícito.
        // El casting elimina la parte decimal, NO redondea
        System.out.println(a);  // 5
        System.out.println(b);  // 2.5
        System.out.println(resultado);  // 12
    }
}
