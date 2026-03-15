// Ejercicio 4. 
// Bucle for-each con var


import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {

        var nombres = List.of("Juan", "Ana", "Luis");

        for(var nombre : nombres){
            System.out.print(nombre + " ");
        }
    }
}
