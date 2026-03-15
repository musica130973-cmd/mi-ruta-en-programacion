//Ejercicio 1. Declaración y uso de variables.
//Crea un programa que declare variables de distintos tipos y muestre sus valores.


public class Ejercicio1 {
    public static void main(String[] args) {
        // Variable de tipo String (cadena de texto) que almacena un nombre
        String nombre = "Juan";

        // Variable entera que guarda la edad
        int edad = 52;

        // Variable booleana: true o false. Aquí indica que NO está trabajando
        boolean trabajo = false;

         // Variable de tipo char (un solo carácter). Guarda la inicial del nombre
        char inicial = 'J';

        // Variable de tipo double para números decimales. Representa la estatura en metros
        double estatura = 1.73;

        // Imprime el texto "Nombre: " seguido del valor de la variable nombre
        System.out.println("Nombre: " + nombre);

        // Imprime la edad
        System.out.println("Edad: " + edad);

        // Imprime si trabaja o no (true/false)
        System.out.println("Trabajo: " + trabajo);

        // Imprime la inicial
        System.out.println("Inicial: " + inicial);

        // Imprime la estatura
        System.out.println("Estatura: " + estatura);
    }
}
