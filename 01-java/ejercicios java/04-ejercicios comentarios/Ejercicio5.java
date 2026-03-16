//Crea un metodo que devuelva el doble de un número y docuemta el metodo con comentarios estilo JavaDoc

public class Ejercicio5 {


    public static void main(String[] args) {
        int numero = 10;
        System.out.println("El doble de " + numero + " es " + doble(numero));
    }


    /**
     * Devuelve el doble del número recibido
     * @param n número a duplicar
     * @return el doble del número
     */
    public static int doble(int n){
        return n * 2;
    }
}
