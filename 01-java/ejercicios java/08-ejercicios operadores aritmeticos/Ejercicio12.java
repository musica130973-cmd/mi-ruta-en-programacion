// Ejercicio 12
// Incremento dentro de una expresión

public class Ejercicio12 {
    public static void main(String[] args) {
        int a = 5;  // a empieza valiendo 5
        int b = 3;  // b empieza valiendo 3

        // En esta expresión ocurren tres cosas:
        // 1) a++ usa el valor 5 y luego a pasa a valer 6
        // 2) ++b primero incrementa b a 4 y usa ese valor (4)
        // 3) a ahora a vale 6, así que aporta 6
        //
        // Por tanto:
        // c = 5 + 4 + 6 = 15
        int c = a++ + ++b + a;

        System.out.println("El resultado de la operación es: " + c);
    }
}
