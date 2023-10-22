package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Principal menu = new Principal();
        String resposta;
        int op;
        do {
            mostrarMenu();
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    menu.mostrarControleDeAcesso();
                    break;
                case 2:
                    menu.mostrarReservaAgendamentoOnline();
                    break;
                case 3:
                    menu.mostrarGerenciamentoDeAulas();
                    break;
                case 4:
                    menu.mostrarTelaDeCadastro();
                    break;
                case 5:
                    menu.mostrarComunicacaoComMembros();
                    break;
                case 6:
                    menu.mostrarControleDeEstoque();
                    break;
                case 7:
                    menu.mostrarGerenciamentoDeInstrutores();
                    break;
                case 8:
                    menu.mostrarIntegracoesSistemaDePagamento();
                    break;
                case 9:
                    menu.mostrarControleDePagamento();
                    break;
                case 10:
                    menu.mostrarRelatoriosEstatisticas();
                    break;
                case 11:
                    menu.mostrarSeguranca();
                    break;
                case 12:
                    menu.mostrarUI();
                    break;
                case 13:
                    menu.mostrarUX();
                    break;
                case 14:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Deseja continuar? (Sim/Não):");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("Sim"));
    }

    private static void mostrarMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Mostrar Controle de Acesso");
        System.out.println("2. Mostrar Reserva e Agendamento Online");
        System.out.println("3. Mostrar Gerenciamento de Aulas");
        System.out.println("4. Mostrar Tela de Cadastro");
        System.out.println("5. Mostrar Comunicação com Membros");
        System.out.println("6. Mostrar Controle de Estoque");
        System.out.println("7. Mostrar Gerenciamento de Instrutores");
        System.out.println("8. Mostrar Integrações com Sistema de Pagamento");
        System.out.println("9. Mostrar Controle de Pagamento");
        System.out.println("10. Mostrar Relatórios e Estatísticas");
        System.out.println("11. Mostrar Segurança");
        System.out.println("12. Mostrar UI");
        System.out.println("13. Mostrar UX");
        System.out.println("14. Sair");
        System.out.println("Digite uma opção:");
    }

    private void mostrarControleDeAcesso() {
        System.out.println("Implemente a funcionalidade de Controle de Acesso aqui.");
    }

    private void mostrarReservaAgendamentoOnline() {
        System.out.println("Implemente a funcionalidade de Reserva e Agendamento Online aqui.");
    }

    private void mostrarGerenciamentoDeAulas() {
        System.out.println("Implemente a funcionalidade de Gerenciamento de Aulas aqui.");
    }

    private void mostrarTelaDeCadastro() {
        System.out.println("Implemente a funcionalidade de Tela de Cadastro aqui.");
    }

    private void mostrarComunicacaoComMembros() {
        System.out.println("Implemente a funcionalidade de Comunicação com Membros aqui.");
    }

    private void mostrarControleDeEstoque() {
        System.out.println("Implemente a funcionalidade de Controle de Estoque aqui.");
    }

    private void mostrarGerenciamentoDeInstrutores() {
        System.out.println("Implemente a funcionalidade de Gerenciamento de Instrutores aqui.");
    }

    private void mostrarIntegracoesSistemaDePagamento() {
        System.out.println("Implemente a funcionalidade de Integrações com Sistema de Pagamento aqui.");
    }

    private void mostrarControleDePagamento() {
        System.out.println("Implemente a funcionalidade de Controle de Pagamento aqui.");
    }

    private void mostrarRelatoriosEstatisticas() {
        System.out.println("Implemente a funcionalidade de Relatórios e Estatísticas aqui.");
    }

    private void mostrarSeguranca() {
        System.out.println("Implemente a funcionalidade de Segurança aqui.");
    }

    private void mostrarUI() {
        System.out.println("Implemente a funcionalidade de UI aqui.");
    }

    private void mostrarUX() {
        System.out.println("Implemente a funcionalidade de UX aqui.");
    }
}
