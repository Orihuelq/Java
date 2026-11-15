import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la temperatura ambiente:");
        double temperatura = entrada.nextDouble();

        boolean confortable = temperatura >= 18.0 && temperatura <= 25.0;

        System.out.println("Temperatura confortable: " + confortable);
    }
}
