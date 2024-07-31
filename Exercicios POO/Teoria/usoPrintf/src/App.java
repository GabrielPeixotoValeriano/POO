public class App {
    public static void main(String[] args) throws Exception {
        int idade = 25;
        double salario = 4567.89;
        String nome = "João";

        // Exemplo de impressão com printf
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d anos\n", idade);
        System.out.printf("Salário: %.2f\n", salario);

        // Definindo alguns números inteiros
        int num1 = 42;
        int num2 = 12345;
        int num3 = 678;

        // Usando printf para formatar a saída
        System.out.printf("Número 1: %10d\n", num1);
        System.out.printf("Número 2: %10d\n", num2);
        System.out.printf("Número 3: %10d\n", num3);
    }
}
