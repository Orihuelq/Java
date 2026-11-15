import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un numero entero positivo:");
        int numero = entrada.nextInt();

        int ultimoDigito = numero % 10;

        System.out.println("Ultimo digito: " + ultimoDigito);
    }
}
