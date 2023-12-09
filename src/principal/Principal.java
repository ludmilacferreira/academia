package principal;

import controler.Controler;
import view.MenuPrincipal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controler controler = new Controler();
        String resposta;
        int op;
        do {
            MenuPrincipal.mostrarMenuPrincipal();
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    controler.mostrarControleDeAcesso();
                    break;
                case 2:
                    controler.mostrarReservaAgendamentoOnline();
                    break;
                case 3:
                    controler.mostrarGerenciamentoDeTreinos();
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
                    controler.mostrarCompraDeProdutosComPagamento();
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
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Deseja continuar? (Sim/Não):");
            if (scanner.hasNext()) {
                resposta = scanner.next();
                if (resposta.equalsIgnoreCase("Não")) {
                    break;
                }
            } else {
                break;
            }
        } while (true);
    }
}
