package cadastro;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeProdutos {
    static class Produto {
        private String nome;
        private double preco;

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

    public static class Academia {
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

        public void excluirProduto(String nome) {
            produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
        }
    }
}
