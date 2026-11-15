import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero entero:");
        int n = entrada.nextInt();

        boolean esImpar = n % 2 != 0;

        System.out.println("Es impar: " + esImpar);
    }
}
