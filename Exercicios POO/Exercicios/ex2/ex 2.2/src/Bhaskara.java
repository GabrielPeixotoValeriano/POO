import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Lendo os coeficientes a, b e c
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        // Verificando se a é zero
        if (a == 0) {
            System.out.println("Impossível calcular");
            scanner.close();
            return;
        }

        // Calculando o valor de delta
        double delta = b * b - 4 * a * c;

        // Verificando se delta é negativo
        if (delta < 0) {
            System.out.println("Impossível calcular");
            scanner.close();
            return;
        }

        // Calculando as raízes
        double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        // Exibindo os resultados
        System.out.printf("R1 = %.5f%n", raiz1);
        System.out.printf("R2 = %.5f%n", raiz2);

        // Fechando o scanner
        scanner.close();
    }

}
