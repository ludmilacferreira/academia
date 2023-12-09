package pagamentos;

import estoque.SistemaAcademia;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CompraDeProdutos {

    public void mostrarCompraDeProdutosComPagamento() {
        SistemaAcademia sistema = new SistemaAcademia();

        sistema.adicionarProduto("Whey", 99.99, 100);
        sistema.adicionarProduto("Creatina", 49.99, 10);
        sistema.adicionarProduto("Luvas de treino", 15.00, 50);
        sistema.adicionarProduto("Suplemento polivitamínico", 80.00, 50);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de compras!");
        sistema.mostrarEstoque();

        System.out.print("Digite o nome do produto que deseja comprar (ou 'pagar' para ir ao menu de pagamento): ");
        String input;
        boolean realizarPagamento = false;

        while (!realizarPagamento) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("pagar")) {
                realizarPagamento = true;
                break;
            }

            try {
                System.out.print("Digite a quantidade que deseja comprar: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                sistema.venderProduto(input, quantidade);
                sistema.mostrarEstoque();
                System.out.print("Digite o nome do produto que deseja comprar (ou 'pagar' para ir ao menu de pagamento): ");
            } catch (NumberFormatException e) {
                System.out.println("Quantidade inválida. Por favor, insira um número inteiro.");
            } catch (NoSuchElementException e) {
                System.out.println("Produto não encontrado. Por favor, escolha um produto válido.");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro ao processar a compra. Por favor, tente novamente.");
            }
        }

        System.out.println("Chamando o Menu de Pagamento...");
        MenuDePagamento menuDePagamento = new MenuDePagamento();
        menuDePagamento.realizarPagamento();

        scanner.close();
    }
}
