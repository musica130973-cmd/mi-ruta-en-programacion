//Declara dos números enteros y muestra su concatenación como texto. Ejemplo: 4 y 7 "47"

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero1 = 4;
        int numero2 = 7;

        String resultado = "" + numero1  + numero2; //Al comenzar con "" java interpreta lo que sigue como un texto
        System.out.println("Concatenación: " + resultado);
    }
}
