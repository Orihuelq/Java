import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero entero positivo:");
        int numero = entrada.nextInt();

        boolean noEsMultiplo = !(numero % 3 == 0);

        System.out.println("No es multiplo de 3: " + noEsMultiplo);
    }
}
