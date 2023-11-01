package controler;

import acesso.ControleDeAcesso;
import cadastro.*;
import comunicacao.ComunicacaoComMembros;


import java.util.Scanner;

public class Controler {

    private ControleDeAcesso controleDeAcesso;
    private ComunicacaoComMembros comunicacaoComMembros;
    private CadastroDeFuncionarios cadastroDeFuncionarios;

    public Controler() {
        this.controleDeAcesso = new ControleDeAcesso();
        this.comunicacaoComMembros = new ComunicacaoComMembros();
        this.cadastroDeFuncionarios = new CadastroDeFuncionarios();
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo à tela de cadastro. Escolha uma opção:");
        System.out.println("1. Cadastro de Equipamentos");
        System.out.println("2. Cadastro de Funcionários");
        System.out.println("3. Cadastro de Membros");
        System.out.println("4. Cadastro de Produtos");
        System.out.print("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                realizarCadastroDeEquipamentos();
                break;
            case 2:
                realizarCadastroDeFuncionarios();
                break;
            case 3:
               realizarCadastroDeMembros();
                break;
            case 4:
                realizarCadastroDeProdutos();
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }
    }
    private void realizarCadastroDeEquipamentos() {
        CadastroDeEquipamentos.Equipamento equipamento1 = new CadastroDeEquipamentos.Equipamento("Esteira", "Cardio");
        CadastroDeEquipamentos.Equipamento equipamento2 = new CadastroDeEquipamentos.Equipamento("Bicicleta Ergométrica", "Cardio");
        CadastroDeEquipamentos.Equipamento equipamento3 = new CadastroDeEquipamentos.Equipamento("Haltere", "Musculação");

        CadastroDeEquipamentos.CadastroEquipamentos cadastroDeEquipamentos = new CadastroDeEquipamentos.CadastroEquipamentos();
        cadastroDeEquipamentos.adicionarEquipamento(equipamento1);
        cadastroDeEquipamentos.adicionarEquipamento(equipamento2);
        cadastroDeEquipamentos.adicionarEquipamento(equipamento3);

        cadastroDeEquipamentos.mostrarEquipamentos();
    }

    private void realizarCadastroDeFuncionarios() {
        CadastroDeFuncionarios.Funcionario funcionario1 = cadastroDeFuncionarios.new Funcionario("João", "Faxineiro");
        CadastroDeFuncionarios.Funcionario funcionario2 = cadastroDeFuncionarios.new Funcionario("Larissa", "Recepcionista");
        CadastroDeFuncionarios.Funcionario funcionario3 = cadastroDeFuncionarios.new Funcionario("Pedro", "Instrutor");

        cadastroDeFuncionarios.adicionarFuncionario(funcionario1);
        cadastroDeFuncionarios.adicionarFuncionario(funcionario2);
        cadastroDeFuncionarios.adicionarFuncionario(funcionario3);

        cadastroDeFuncionarios.mostrarFuncionarios();
    }

    private void realizarCadastroDeMembros() {
       CadastroDeMembros.Membro membro1 = new CadastroDeMembros.Membro("Ludmilla", "Premium");
        CadastroDeMembros.Membro membro2 = new CadastroDeMembros.Membro("Caio", "Regular");
        CadastroDeMembros.Membro membro3 = new CadastroDeMembros.Membro("Clara", "Premium");

        CadastroDeMembros.CadastroMembros cadastroDeMembros = new CadastroDeMembros.CadastroMembros();
        cadastroDeMembros.adicionarMembro(membro1);
        cadastroDeMembros.adicionarMembro(membro2);
        cadastroDeMembros.adicionarMembro(membro3);

        cadastroDeMembros.mostrarMembros();

        CadastroDeMembros cadastro = new CadastroDeMembros();

        cadastro.cadastrarMembro(1, "Ludmilla", CadastroDeMembros.PlanoPagamento.ANUAL);
        cadastro.cadastrarMembro(2, "Caio", CadastroDeMembros.PlanoPagamento.MENSAL);
        cadastro.cadastrarMembro(3, "Clara", CadastroDeMembros.PlanoPagamento.SEMESTRAL);

        cadastro.mostrarDetalhesMembro(1);
        cadastro.mostrarDetalhesMembro(2);
        cadastro.mostrarDetalhesMembro(3);
    }

    private void realizarCadastroDeProdutos() {
   
    CadastroDeProdutos cadastroDeProdutos = new CadastroDeProdutos();
    
    Produto produto1 = new Produto("Whey Protein", 49.99);
    Produto produto2 = new Produto("Barra de Proteína", 2.99);
    Produto produto3 = new Produto("Shaker", 9.99);

    cadastroDeProdutos.adicionarProduto(produto1);
    cadastroDeProdutos.adicionarProduto(produto2);
    cadastroDeProdutos.adicionarProduto(produto3);

    cadastroDeProdutos.mostrarProdutos();
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

    public void mostrarControleDePagamento() {
        System.out.println("Implemente a funcionalidade de Controle de Pagamento aqui.");
    }

    public void mostrarRelatoriosEstatisticas() {
        System.out.println("Implemente a funcionalidade de Relatórios e Estatísticas aqui.");
    }

    public void mostrarSeguranca() {
        System.out.println("Implemente a funcionalidade de Segurança aqui.");
    }

}
