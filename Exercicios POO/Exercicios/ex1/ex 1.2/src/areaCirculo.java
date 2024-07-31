import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        /*
         * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
         * valor da área deste círculo com quatro casas decimais. Considere o valor de π
         * = 3.14159
         */

        System.out.println("Digite o raio do circulo:");
        double raio = scanner.nextDouble();

        double pi = 3.14159;

        double area = pi * Math.pow(raio, 2);

        System.out.println("A area do circulo de raio " + raio + " é: " + area);
        System.out.printf("A area do circulo de raio %.2f é: %.4f\n", raio, area);

        scanner.close();

    }
}
