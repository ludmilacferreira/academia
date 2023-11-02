package pagamentos;

import estoque.SistemaAcademia;
import java.util.Scanner;

public class CompraDeProdutos {

    public static void main(String[] args) {
        SistemaAcademia sistema = new SistemaAcademia();

        sistema.adicionarProduto("Whey", 99.99, 100);
        sistema.adicionarProduto("Creatina", 49.99, 10);
        sistema.adicionarProduto("Luvas de treino", 15.00, 50);
        sistema.adicionarProduto("Suplemento polivitamínico", 80.00, 50);

        Scanner scanner = new Scanner(System.in);
        boolean realizarPagamento = false;

        System.out.println("Bem-vindo ao sistema de compras!");
        sistema.mostrarEstoque();

        while (!realizarPagamento) {
            System.out.print("Digite o nome do produto que deseja comprar (ou 'pagar' para ir ao menu de pagamento): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("pagar")) {
                realizarPagamento = true;
                continue;
            }

            System.out.print("Digite a quantidade que deseja comprar: ");
            int quantidade = Integer.parseInt(scanner.nextLine());

            sistema.venderProduto(input, quantidade);
            sistema.mostrarEstoque();
        }

        System.out.println("Chamando o Menu de Pagamento...");
        MenuDePagamento.main(null);

        scanner.close();
    }
}
