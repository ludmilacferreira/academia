package controler;

import acesso.ControleDeAcesso;
import comunicacao.ComunicacaoComMembros;

public class Controler {

    private ControleDeAcesso controleDeAcesso;
    private ComunicacaoComMembros comunicacaoComMembros;

    public Controler() {
        this.controleDeAcesso = new ControleDeAcesso();
        this.comunicacaoComMembros = new ComunicacaoComMembros();
    }

    public void mostrarControleDeAcesso() {
        controleDeAcesso.registrarCartao("123456");
        controleDeAcesso.registrarCartao("987654");

        controleDeAcesso.liberarAcesso("123456");
        controleDeAcesso.liberarAcesso("987654");
        controleDeAcesso.liberarAcesso("999999");

        controleDeAcesso.bloquearAcesso("123456");
        controleDeAcesso.liberarAcesso("123456");
    }

    public void mostrarReservaAgendamentoOnline() {
        System.out.println("Implemente a funcionalidade de Reserva e Agendamento Online aqui.");
    }

    public void mostrarGerenciamentoDeAulas() {
        System.out.println("Implemente a funcionalidade de Gerenciamento de Aulas aqui.");
    }

    public void mostrarTelaDeCadastro() {
        System.out.println("Implemente a funcionalidade de Tela de Cadastro aqui.");
    }

    public void mostrarComunicacaoComMembros() {
        ComunicacaoComMembros.ComunicacaoMembros comunicacaoMembros = new ComunicacaoComMembros.ComunicacaoMembros();
        ComunicacaoComMembros.ComunicacaoEmail comunicacaoPorEmail = new ComunicacaoComMembros.ComunicacaoEmail("exemplo@email.com");
        comunicacaoMembros.setMetodoComunicacao(comunicacaoPorEmail);
        comunicacaoMembros.enviarNotificacaoParaMembro("Aula de Zumba amanhã às 10h. Não se atrase!");

        ComunicacaoComMembros.ComunicacaoSMS comunicacaoPorSMS = new ComunicacaoComMembros.ComunicacaoSMS("123456789");
        comunicacaoMembros.setMetodoComunicacao(comunicacaoPorSMS);
        comunicacaoMembros.enviarNotificacaoParaMembro("Seu pagamento está em atraso. Por favor, regularize.");

        comunicacaoMembros.enviarNotificacaoParaMembro("Teste de notificação sem método de comunicação configurado.");
    }

    public void mostrarControleDeEstoque() {
        System.out.println("Implemente a funcionalidade de Controle de Estoque aqui.");
    }

    public void mostrarGerenciamentoDeInstrutores() {
        System.out.println("Implemente a funcionalidade de Gerenciamento de Instrutores aqui.");
    }

    public void mostrarIntegracoesSistemaDePagamento() {
        System.out.println("Implemente a funcionalidade de Integrações com Sistema de Pagamento aqui.");
    }

    public void mostrarControleDePagamento() {
        System.out.println("Implemente a funcionalidade de Controle de Pagamento aqui.");
    }

    public void mostrarRelatoriosEstatisticas() {
        System.out.println("Implemente a funcionalidade de Relatórios e Estatísticas aqui.");
    }

    public void mostrarSeguranca() {
        System.out.println("Implemente a funcionalidade de Segurança aqui.");
    }

    public void mostrarUI() {
        System.out.println("Implemente a funcionalidade de UI aqui.");
    }

    public void mostrarUX() {
        System.out.println("Implemente a funcionalidade de UX aqui.");
    }
}
