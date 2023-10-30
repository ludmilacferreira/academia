package principal;

import controler.Controler;
import view.Menu;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controler controler = new Controler();
        String resposta;
        int op;
        do {
            Menu.mostrarMenu();
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    controler.mostrarControleDeAcesso();
                    break;
                case 2:
                    controler.mostrarReservaAgendamentoOnline();
                    break;
                case 3:
                    controler.mostrarGerenciamentoDeAulas();
                    break;
                case 4:
                    controler.mostrarTelaDeCadastro();
                    break;
                case 5:
                    controler.mostrarComunicacaoComMembros();
                    break;
                case 6:
                    controler.mostrarControleDeEstoque();
                    break;
                case 7:
                    controler.mostrarGerenciamentoDeInstrutores();
                    break;
                case 8:
                    controler.mostrarIntegracoesSistemaDePagamento();
                    break;
                case 9:
                    controler.mostrarControleDePagamento();
                    break;
                case 10:
                    controler.mostrarRelatoriosEstatisticas();
                    break;
                case 11:
                    controler.mostrarSeguranca();
                    break;
                case 12:
                    controler.mostrarUI();
                    break;
                case 13:
                    controler.mostrarUX();
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
}
