package pagamento;

import java.util.Scanner;

public class MenuDePagamento {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de pagamento");
        System.out.println("1. Dinheiro");
        System.out.println("2. Cartão de Crédito");
        System.out.println("3. Cartão de Débito");
        System.out.println("4. PIX");
        System.out.println("Escolha uma dessas opções:");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu pagar com Dinheiro.");
                processarPagamentoDinheiro();
                break;
            case 2:
                System.out.println("Você escolheu pagar com Cartão de Crédito");
                processarPagamentoCartaoCredito();
                break;
            case 3:
                System.out.println("Você escolheu pagar com Cartão de Débito");
                processarPagamentoCartaoDebito();
                break;
            case 4:
                System.out.println("Você escolheu pagar com PIX");
                processarPagamentoPix();
                break;
            default:
                System.out.println("Opção inválida.");

        }
        scanner.close();
    }

    public static void processarPagamentoDinheiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();
        System.out.println("Digite o valor em dinheiro:");
        double valor = scanner.nextDouble();

        if (valor>= valorCompra) {
            double troco = valor- valorCompra;
            System.out.println("Pagamento em dinheiro de R$" + valor + " processado com sucesso.");
            System.out.println("Troco: R$" + troco);
        } else {
            System.out.println("Valor insuficiente. O pagamento não pode ser processado.");
        }

        scanner.close();
    }
    public static void processarPagamentoCartaoCredito() {
        System.out.println("Digite o número do cartão de crédito:");
        Scanner scanner = new Scanner(System.in);
        String numeroCartao = scanner.next();
        System.out.println("Digite a data de validade (MM/AA):");
        String dataValidade = scanner.next();
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        boolean cartaoValido = true;

        if (cartaoValido) {
            System.out.println("Pagamento com Cartão de Crédito no valor de R$" + valorCompra + " foi processado com sucesso.");
        } else {
            System.out.println("Cartão de crédito inválido. O pagamento não pode ser processado.");
        }

        scanner.close();
    }
    public static void processarPagamentoCartaoDebito() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do cartão de débito:");
        String numeroCartao = scanner.next();
        System.out.println("Digite o código de segurança:");
        int codigoSeguranca = scanner.nextInt();
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        boolean cartaoValido = true;

        if (cartaoValido) {
            System.out.println("Pagamento com Cartão de Débito no valor de R$" + valorCompra + " foi processado com sucesso.");
        } else {
            System.out.println("Cartão de débito inválido. O pagamento não pode ser processado.");
        }

        scanner.close();
    }
    public static void processarPagamentoPix () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a chave PIX (CPF, e-mail, telefone, etc.): ");
        String chavePIX = scanner.next();
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        System.out.println("Pagamento com PIX de R$" + valorCompra + " para a chave " + chavePIX + " processado com sucesso.");

        scanner.close();
    }
}
