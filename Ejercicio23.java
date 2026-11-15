import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero entero:");
        int numero = entrada.nextInt();

        boolean divisible = numero % 2 == 0 && numero % 5 == 0;

        System.out.println("Es divisible entre 2 y 5: " + divisible);
    }
}
