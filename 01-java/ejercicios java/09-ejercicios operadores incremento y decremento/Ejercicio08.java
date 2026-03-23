// Ejercicio 8
// Contador circular
// Imprime los números del 0 al 9 repetidamente usando incremento

public class Ejercicio8 {
    // Lo hace solo una vez
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
            if(i == 9) System.out.println("FIN");
        }

        // Lo repite mientras que z sea menor de 100
        int n = 0;
        for(int z = 0; z < 100; z++){
            System.out.print(n + " ");
            n++;
            if(n == 10) n = 0;
        }
    }
}
