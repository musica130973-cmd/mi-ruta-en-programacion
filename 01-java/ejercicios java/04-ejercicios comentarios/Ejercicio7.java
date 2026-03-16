//Escribe un programa que calcule el área de un triángulo y coméntalo completamente para que cualquier persona pueda entenderlo

import java.util.Scanner;

public class Ejercicio7 {

    //Metodo que pide los datos y calcula el área de un triángulo
    public static double area(){
        //Crea un objeto Scanner (sc)
        Scanner sc = new Scanner(System.in);

        //Pide al usuario que introduzca el valor de la base y lo almacena en la variable base
        System.out.print("Introduzca el valor de la base en cm.: ");
        double base = sc.nextDouble();

        //Pide al usuario que introduzca el valor de la altura y lo almacena en la variable altura
        System.out.print("Introduzca el valor de la altura en cm.: ");
        double altura = sc.nextDouble();

         return base * altura / 2;
    }




    public static void main(String[] args) {

        //Imprime en consola el valor del área del triangulo
        System.out.println("El área del triángulo es igual a: " + area() + " cm²");
    }
}
