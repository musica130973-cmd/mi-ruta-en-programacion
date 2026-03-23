// Determinar si un año es bisiesto
// Un año es bisiesto si cumple:
// Es divisible por 4, pero no es divisible por 100, excepto si también es divisible por 400

import java.util.Scanner;

class Ejercicio7 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.print("Introduzca el año: ");
         int fecha = entrada.nextInt();

         if(fecha % 4 == 0 && fecha % 100 != 0 || fecha % 400 ==0){
             System.out.println(fecha + " Es año bisiesto");
         }else{
             System.out.println(fecha + " No es bisiesto");
         }
     }
}
