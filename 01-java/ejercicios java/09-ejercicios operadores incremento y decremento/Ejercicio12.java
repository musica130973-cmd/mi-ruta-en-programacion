// Ejercicio 12
// Recorrer un array con incremento
// Imprime todos los elementos de un array usando i++ dentro del print
public class Ejercicio12 {
    public static void main(String[] args) {

        // Declaración de un arry de 4 números
        int[] nums = {10, 20, 30, 40};

        // Variable para recorrer el array
        int i = 0;

        // Mientras i sea menor que la longitud del array (4)
        while(i < nums.length){

            // Imprime nums[i] y DESPUÉS incrementa i en 1
            // Iteración 1: imprime nums[0] = 10 luego i pasa a 1
            // Iteración 2: imprime nums[1] = 20 luego i pasa a 2
            // Iteración 3: imprime nums[2] = 30 luego i pasa a 3
            // Iteración 4: imprime nums[3] = 40 luego i pasa a 4
            System.out.print(nums[i++] + " ");
        }
    }
}
