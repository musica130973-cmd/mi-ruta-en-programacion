// Ejercicio 9
// Pide un número del 1 al 7 representando el dia de la semana.
// Si el día no es sábado (6) ni domingo (7), muestra "Hoy toca trabajar"

import java.util.Scanner;

class Ejercicio9 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.print("Introduzca un número del 1 al 7: ");
         int dia = entrada.nextInt();
         boolean finSemana= (dia == 6 || dia == 7);
         
         if(!finSemana){
             System.out.println("Hoy toca trabajar");
         }else{
             System.out.println("Es fin de semana");
         }
     }
}
