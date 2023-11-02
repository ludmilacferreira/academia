package estoque;

public class EstoqueDeProdutos {
    private String nome;
    private double preco;
    private int quantidade;

    public EstoqueDeProdutos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Infelizmente acabou o estoque.");
        }
    }

    public static void main(String[] args) {
        SistemaAcademia sistema = new SistemaAcademia();

        sistema.adicionarProduto("Whey", 99.99, 100);
        sistema.adicionarProduto("Creatina", 49.99, 10);
        sistema.adicionarProduto("Luvas de treino", 15.00, 50);
        sistema.adicionarProduto("Suplemento polivitamínico", 80.00, 50);

        sistema.mostrarEstoque();

        sistema.venderProduto("Whey", 5);
        sistema.venderProduto("Creatina", 2);

        sistema.mostrarEstoque();
    }
}
