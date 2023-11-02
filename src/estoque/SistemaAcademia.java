package estoque;

import java.util.HashMap;
import java.util.Map;

public class SistemaAcademia {
    private Map<String, EstoqueDeProdutos> estoque = new HashMap<>();

    public void adicionarProduto(String nome, double preco, int quantidade) {
        if (estoque.containsKey(nome)) {
            EstoqueDeProdutos produtoExistente = estoque.get(nome);
            produtoExistente.adicionarQuantidade(quantidade);
        } else {
            EstoqueDeProdutos novoProduto = new EstoqueDeProdutos(nome, preco, quantidade);
            estoque.put(nome, novoProduto);
        }
    }

    public void venderProduto(String nome, int quantidade) {
        if (estoque.containsKey(nome)) {
            EstoqueDeProdutos produto = estoque.get(nome);
            produto.removerQuantidade(quantidade);
            System.out.println("Vendido com sucesso: " + quantidade + " " + nome + "(s) por R$" + (produto.getPreco() * quantidade));
        } else {
            System.out.println("Poxa, não encontramos no estoque.");
        }
    }

    public void mostrarEstoque() {
        System.out.println("Estoque atual:");
        for (EstoqueDeProdutos produto : estoque.values()) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco() + " - Quantidade: " + produto.getQuantidade());
        }
    }
}
