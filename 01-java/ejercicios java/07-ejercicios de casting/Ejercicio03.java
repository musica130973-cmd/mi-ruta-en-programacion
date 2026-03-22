// Ejercicio 3
// Casting entre caracteres y números

public class Ejercicio3 {
    public static void main(String[] args) {

        // Declaramos un char con la letra 'A'
        // En Java, los char no solo representan letras: internamente son números
        // según la tabla Unicode. 'A' corresponde al valor 65
        char letra = 'A';

        // Hacemos un casting explícito de char a int
        // Esto convierte la letra en su código numérico Unicode
        int codigo = (int) letra;   // Resultado 65

        // Ahora sumamos 1 al código y lo convertimos de nuevo a char
        // 65 + 1 = 66, y el código 66 corresponde a la letra 'B'
        char siguiente = (char) (codigo + 1);

        // Imprimimos los valores para ver el resultado
        System.out.println(codigo); // Imprime 65
        System.out.println(siguiente); // Imprime B


    }
}
