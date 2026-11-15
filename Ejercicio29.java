import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la edad:");
        int edad = entrada.nextInt();

        System.out.println("Ingresa el peso en kilogramos:");
        double peso = entrada.nextDouble();

        boolean puedeDonar = edad >= 18 && edad <= 65 && peso > 50.0;

        System.out.println("Puede donar sangre: " + puedeDonar);
    }
}
