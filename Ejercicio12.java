import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero entero:");
        int numero = entrada.nextInt();

        boolean multiploDe7 = numero % 7 == 0;

        System.out.println("Es multiplo de 7: " + multiploDe7);
    }
}
