import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el peso del pasajero 1:");
        double peso1 = entrada.nextDouble();

        System.out.println("Ingresa el peso del pasajero 2:");
        double peso2 = entrada.nextDouble();

        System.out.println("Ingresa el peso del pasajero 3:");
        double peso3 = entrada.nextDouble();

        System.out.println("Ingresa el peso del pasajero 4:");
        double peso4 = entrada.nextDouble();

        double pesoTotal = peso1 + peso2 + peso3 + peso4;
        boolean cargaPermitida = pesoTotal <= 320.0;

        System.out.println("Peso total: " + pesoTotal);
        System.out.println("Carga permitida: " + cargaPermitida);
    }
}
