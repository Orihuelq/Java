import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el subtotal de la cuenta:");
        double subtotal = entrada.nextDouble();

        double iva = subtotal * 0.16;
        double propina = subtotal * 0.15;
        double total = subtotal + iva + propina;

        System.out.println("IVA: " + iva);
        System.out.println("Propina: " + propina);
        System.out.println("Total a pagar: " + total);
    }
}
