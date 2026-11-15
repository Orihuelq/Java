import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer lado:");
        double l1 = entrada.nextDouble();

        System.out.println("Ingresa el segundo lado:");
        double l2 = entrada.nextDouble();

        System.out.println("Ingresa el tercer lado:");
        double l3 = entrada.nextDouble();

        boolean equilatero = l1 == l2 && l2 == l3 && l1 > 0 && l2 > 0 && l3 > 0;

        System.out.println("Es un triangulo equilatero: " + equilatero);
    }
}
