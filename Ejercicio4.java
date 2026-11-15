import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el total de dias:");
        int totalDias = entrada.nextInt();

        int semanas = totalDias / 7;
        int diasRestantes = totalDias % 7;

        System.out.println("Semanas completas: " + semanas);
        System.out.println("Dias restantes: " + diasRestantes);
    }
}
