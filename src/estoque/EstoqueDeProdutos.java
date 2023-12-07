package estoque;

import java.util.HashMap;
import java.util.Map;

public class ControleEstoque {
    private Map<String, ControleDeEstoque> estoque;

    public ControleEstoque() {
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
