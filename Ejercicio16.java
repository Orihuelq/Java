import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el saldo actual:");
        double saldo = entrada.nextDouble();

        System.out.println("Ingresa el monto a retirar:");
        double retiro = entrada.nextDouble();

        boolean saldoSuficiente = saldo >= retiro;

        System.out.println("Saldo suficiente: " + saldoSuficiente);
    }
}
