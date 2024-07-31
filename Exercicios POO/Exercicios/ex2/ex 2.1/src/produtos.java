public class produtos {
    String nome;
    int codigo;
    double valor;

    produtos(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    void mostrarDados() {
        System.out.println("código " + this.codigo + " " + this.nome + " R$" + this.valor);

    }

}
