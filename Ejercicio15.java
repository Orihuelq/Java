import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el lado del cuadrado:");
        double ladoC = entrada.nextDouble();

        System.out.println("Ingresa el lado del triangulo:");
        double ladoT = entrada.nextDouble();

        double perimetroCuadrado = ladoC * 4;
        double perimetroTriangulo = ladoT * 3;
        boolean esMenor = perimetroCuadrado < perimetroTriangulo;

        System.out.println("Perimetro del cuadrado: " + perimetroCuadrado);
        System.out.println("Perimetro del triangulo: " + perimetroTriangulo);
        System.out.println("El cuadrado tiene menor perimetro: " + esMenor);
    }
}
