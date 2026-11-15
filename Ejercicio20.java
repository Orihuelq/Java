import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero entero positivo:");
        int numero = entrada.nextInt();

        boolean terminaEn5 = numero % 10 == 5;

        System.out.println("Termina en 5: " + terminaEn5);
    }
}
