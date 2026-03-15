// Ejercicio 7
// Error por cambiar el tipo inferido

public class Ejercicio7 {
    public static void main(String[] args) {
        var dato = 10;
        //dato = "texto";

        //dato se infiere como int al inicio
        //Luego se intenta asignar un String, lo cual no es válido
        //Las variables declaradas con var no son dinámicas, solo infieren el tipo una vez
    }
}
