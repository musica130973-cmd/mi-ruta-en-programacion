// Ejercicio 6
// Casting en división entera

 class Ejercicio6 {
     public static void main(String[] args) {

         // Declara dos variables enteras
         int x = 7;
         int y = 2;

         // Aquí ocurre una división entre dos enteros.
         // En Java, cuando divides int / int, el resultado SIEMPRE es una división entera.
         // Eso significa que se descarta la parte decimal.
         // 7 / 2 = 3.5, pero como es división entera → 3
         // Luego ese 3 se convierte a double al asignarlo a r1 → 3.0
         double r1 = x / y;

         // Aquí hacemos un casting antes de la división:
         // (double) x convierte x en 7.0
         // Ahora la operación es: double / int → división REAL
         // 7.0 / 2 = 3.5
         double r2 = (double) x / y;

         System.out.println(r1);    // 3.0
         System.out.println(r2);    // 3.5
     }
}
