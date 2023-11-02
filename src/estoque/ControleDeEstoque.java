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
public class ControleEstoque {
    private Map<String, ControleDeEstoque> estoque;

    public void ControleEstoque() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(ControleDeEstoque produto) {
        estoque.put(produto.getNome(), produto);
    }

    public ControleDeEstoque buscarProduto(String nome) {
        return estoque.get(nome);
    }

    public void atualizarEstoque(String nome, int quantidade) {
        ControleDeEstoque produto = buscarProduto(nome);
        if (produto != null) {
            produto.adicionarQuantidade(quantidade);
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public void removerProduto(String nome) {
        estoque.remove(nome);
    }

    public void listarProdutosEmEstoque() {
        System.out.println("Produtos em estoque:");
        for (ControleDeEstoque produto : estoque.values()) {
            System.out.println(produto.getNome() + ": " + produto.getQuantidadeEmEstoque() + " unidades");
        }
    }
}

