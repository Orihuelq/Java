import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa los kilometros:");
        double km = entrada.nextDouble();

        double millas = km * 0.621371;
        double pies = km * 3280.84;

        System.out.println("Millas: " + millas);
        System.out.println("Pies: " + pies);
    }
}
