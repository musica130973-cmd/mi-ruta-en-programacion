// Negar una condición
// Comprueba si un usuario No está registrado



public class Ejercicio3 {
    public static void main(String[] args) {

        // Variable booleana que indica si el usuario está registrado
        // En este caso, 'false' significa que NO está registrado
        boolean registrado = false;

        // El operador ! (NOT) niega el valor de la variable
        // Si registrado = false, entonces !registrado = true
        // Por tanto, puedeEntrar será true
        boolean puedeEntrar = !registrado;

        // Imprime el resultado por pontalla
        // En este caso mostrará: true
        System.out.println(puedeEntrar);
    }
}
