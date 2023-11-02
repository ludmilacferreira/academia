package estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueDeProduto {
    private String nome;
    private double preco;
    private int quantidade;
    public Produto(String nome, double preco, int quantidade) {
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
}
public class SistemaAcademia {
    private Map<String, Produto> estoque = new HashMap<>();
    public void adicionarProduto(String nome, double preco, int quantidade) {
        if (estoque.containsKey(nome)) {
            Produto produtoExistente = estoque.get(nome);
            produtoExistente.adicionarQuantidade(quantidade);
        } else {
            Produto novoProduto = new Produto(nome, preco, quantidade);
            estoque.put(nome, novoProduto);
        }
    }
    public void venderProduto(String nome, int quantidade) {
        if (estoque.containsKey(nome)) {
            Produto produto = estoque.get(nome);
            produto.removerQuantidade(quantidade);
            System.out.println("Vendido com sucesso: " + quantidade + " " + nome + "(s) por R$" + (produto.getPreco() * quantidade));
        } else {
            System.out.println("Poxa, não encontramos no estoque.");
        }
    }
    public void mostrarEstoque() {
        System.out.println("Estoque atual:");
        for (Produto produto : estoque.values()) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco() + " - Quantidade: " + produto.getQuantidade());
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