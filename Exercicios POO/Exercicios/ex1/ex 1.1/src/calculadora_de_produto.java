import java.util.Scanner;

public class calculadora_de_produto {
    public static void main(String[] args) throws Exception {

        /*
         * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
         * valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago.
         */

        Scanner scanner = new Scanner(System.in);

        produtos p1 = new produtos(1, "tesoura", 2.50);
        p1.mostrarDados();

        produtos p2 = new produtos(2, "apontador", 1.00);
        p2.mostrarDados();

        produtos p3 = new produtos(3, "borracha", 0.50);
        p3.mostrarDados();

        produtos p4 = new produtos(4, "cola", 3.00);
        p4.mostrarDados();

        System.out.println("Digite o código do produto que deseja comprar:");
        int codigoProduto = scanner.nextInt();

        System.out.println("Digita a quantidade que deseja comprar:");
        int quantidade = scanner.nextInt();

        double valorTotal = 0.0;

        switch (codigoProduto) {
            case 1:
                valorTotal = quantidade * p1.valor;
                System.out.println("Produto selecionado: " + p1.nome + " no valor de R$" + valorTotal);
                break;
            case 2:
                valorTotal = quantidade * p2.valor;
                System.out.println("Produto selecionado: " + p2.nome + " no valor de R$" + valorTotal);
                break;
            case 3:
                valorTotal = quantidade * p3.valor;
                System.out.println("Produto selecionado: " + p3.nome + " no valor de R$" + valorTotal);
                break;
            case 4:
                valorTotal = quantidade * p4.valor;
                System.out.println("Produto selecionado: " + p4.nome + " no valor de R$" + valorTotal);
                break;
            default:
                System.out.println("Código de produto invalido.");
                break;
        }
        scanner.close();
    }
}
