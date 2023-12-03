package estoque;

public class ControleDeEstoque {
    private String nome;
    private int quantidadeEmEstoque;

    public ControleDeEstoque(String nome, int quantidadeEmEstoque) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarQuantidade(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque para " + nome);
        }
    }
}

