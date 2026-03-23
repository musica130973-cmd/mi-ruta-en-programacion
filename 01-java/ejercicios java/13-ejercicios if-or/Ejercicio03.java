// ¿Es fin de semana?


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el día de la semana: ");
        String dia = entrada.nextLine().toLowerCase();

        if(dia.equals("sabado") || dia.equals("sábado") || dia.equals("domingo")){
            System.out.println("Es fin de semana");
        }else{
            System.out.println("No es fin de semana");
        }
    }
}
