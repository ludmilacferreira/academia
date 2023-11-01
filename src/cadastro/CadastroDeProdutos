package cadastro;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeProdutos {
    static class Produto {
        private final String nome;
        private final double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }

    static class Academia {
        private final List<Produto> produtos;

        public Academia() {
            produtos = new ArrayList<>();
        }

        public void adicionarProduto(String nome, double preco) {
            Produto novoProduto = new Produto(nome, preco);
            produtos.add(novoProduto);
        }

        public void listarProdutos() {
            System.out.println("Lista de Produtos na Academia:");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() + ", Preço: R$" + produto.getPreco());
            }
        }
    }

    public static void main(String[] args) {
        Academia academia = new Academia();

        academia.adicionarProduto("Whey Protein", 49.99);
        academia.adicionarProduto("Barra de Proteína", 2.99);
        academia.adicionarProduto("Shaker", 9.99);

        academia.listarProdutos();

    }
}
