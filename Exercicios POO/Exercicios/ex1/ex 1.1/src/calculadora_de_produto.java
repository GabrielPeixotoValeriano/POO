import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class calculadora_de_produto {
    public static void main(String[] args) throws Exception {

        /*
         * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
         * valor unitário de cada peça 1, o
         * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago.
         */

        Scanner scanner = new Scanner(System.in);
        int codigo;
        int codigoProduto;
        List<produtos> listaprodutos = new ArrayList<>();
        String nome;
        double valor;
        double valorTotal;
        double valordamercadoria = 0;

        do {
            System.out.println(
                    "Digite o que deseja fazer: \n0 - Sair \n1 - Adicionar produto \n2 - Comprar \n3 - Lista de produtos \n4 - Produtos padrões");
            codigoProduto = scanner.nextInt();
            switch (codigoProduto) {
                case 0:
                    break;
                case 1:
                    System.out.println("Digite o codigo do produto");
                    codigo = scanner.nextInt();
                    System.out.println("Digite o nome do produto");
                    nome = scanner.next();
                    System.out.println("Digite o valor do produto");
                    valor = scanner.nextDouble();

                    produtos p1 = new produtos(codigo, nome, valor);

                    listaprodutos.add(p1);
                    break;
                case 2:
                    if (listaprodutos.size() > 0) {
                        for (produtos produto : listaprodutos) {

                            System.out.println("Digita a quantidade que deseja comprar do produto " + produto.nome);
                            int quantidade = scanner.nextInt();
                            valorTotal = quantidade * produto.valor;
                            System.out.println("Total do produto: " + produto.nome + " R$" + valorTotal);
                            valordamercadoria += valorTotal;
                            System.out.println("O valor total da mercadoria é de: R$" + valordamercadoria);
                        }
                    }
                    break;
                case 3:
                    if (listaprodutos.size() > 0) {
                        for (produtos produto : listaprodutos) {
                            produto.mostrarDados();
                        }
                    }
                    break;
                case 4:
                    produtos p5 = new produtos(1, "tesoura", 2.50);
                    p5.mostrarDados();
                    listaprodutos.add(p5);
                    produtos p2 = new produtos(2, "apontador", 1.00);
                    p2.mostrarDados();
                    listaprodutos.add(p2);
                    produtos p3 = new produtos(3, "borracha", 0.50);
                    p3.mostrarDados();
                    listaprodutos.add(p3);
                    produtos p4 = new produtos(4, "cola", 3.00);
                    p4.mostrarDados();
                    listaprodutos.add(p4);
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }

        } while (codigoProduto != 0);

        scanner.close();
    }
}
