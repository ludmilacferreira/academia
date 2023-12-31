package controler;

import acesso.ControleDeAcesso;
import agendamentos.ReservasAgendamentosOnline;
import cadastro.CadastroDeEquipamentos;
import cadastro.CadastroDeFuncionarios;
import cadastro.CadastroDeMembros;
import cadastro.CadastroDeProdutos;
import comunicacao.ComunicacaoComMembros;
import estoque.ControleDeEstoque;
import estoque.ControleEstoque;
import estoque.SistemaAcademia;
import instrutores.GerenciamentoDeInstrutores;
import pagamentos.Academia;
import pagamentos.ControleDePagamentos;
import pagamentos.MenuDePagamento;
import relatorios.RelatorioEstatisticas;
import seguranca.Seguranca;
import treinos.GerenciamentoDeTreinos;

import java.util.Calendar;
import java.util.Scanner;

public class Controler {

    private ControleDeAcesso controleDeAcesso;
    private ComunicacaoComMembros comunicacaoComMembros;
    private CadastroDeFuncionarios cadastroDeFuncionarios;
    private CadastroDeProdutos CompraDeProdutosComPagamento;

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
        ReservasAgendamentosOnline agendamentos = new ReservasAgendamentosOnline();
        agendamentos.fazerReserva("14:00");
        agendamentos.fazerReserva("15:00");

        agendamentos.cancelarReserva("14:00");

        agendamentos.cancelarReserva("16:00");
    }

    public void mostrarGerenciamentoDeTreinos() {
        GerenciamentoDeTreinos ficha = new GerenciamentoDeTreinos("Treino de Peito e Tríceps");

        ficha.adicionarExercicio(new GerenciamentoDeTreinos.Exercicio("Supino", "Peito", 4, 10, 60));
        ficha.adicionarExercicio(new GerenciamentoDeTreinos.Exercicio("Crucifixo", "Peito", 3, 12, 45));

        ficha.listarGerenciamentoDeTreinos();

        GerenciamentoDeTreinos ficha2 = new GerenciamentoDeTreinos("Treino de Glúteo");

        ficha2.adicionarExercicio(new GerenciamentoDeTreinos.Exercicio("Elevação Pélvica", "Glúteo", 4, 10, 60));
        ficha2.adicionarExercicio(new GerenciamentoDeTreinos.Exercicio("Glúteo na polia", "Glúteo", 3, 12, 45));

        ficha2.listarGerenciamentoDeTreinos();
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
        CadastroDeProdutos.Academia academia = new CadastroDeProdutos.Academia();
        academia.adicionarProduto("Whey Protein", 49.99);
        academia.adicionarProduto("Barra de Proteína", 2.99);
        academia.adicionarProduto("Shaker", 9.99);

        academia.listarProdutos();
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
        ControleEstoque controleEstoque = new ControleEstoque();
        ControleDeEstoque produto1 = new ControleDeEstoque("Whey", 100);
        ControleDeEstoque produto2 = new ControleDeEstoque("Creatina", 10);
        ControleDeEstoque produto3 = new ControleDeEstoque("Luvas de treino", 50);
        ControleDeEstoque produto4 = new ControleDeEstoque("Suplemento polivitamínico", 50);

        controleEstoque.adicionarProduto(produto1);
        controleEstoque.adicionarProduto(produto2);
        controleEstoque.adicionarProduto(produto3);
        controleEstoque.adicionarProduto(produto4);

        controleEstoque.listarProdutosEmEstoque();
    }

    public void mostrarGerenciamentoDeInstrutores() {
        GerenciamentoDeInstrutores gerenciamento = new GerenciamentoDeInstrutores();
        GerenciamentoDeInstrutores.Instrutor instrutor1 = gerenciamento.new Instrutor("Carlos", "Musculação (estagiário)");
        GerenciamentoDeInstrutores.Instrutor instrutor2 = gerenciamento.new Instrutor("Pedro", "Musculação (professor)");
        GerenciamentoDeInstrutores.Instrutor instrutor3 = gerenciamento.new Instrutor("Mariana", "Pilates (professora)");

        gerenciamento.adicionarInstrutor(instrutor1);
        gerenciamento.adicionarInstrutor(instrutor2);
        gerenciamento.adicionarInstrutor(instrutor3);

        gerenciamento.listarInstrutores();
    }

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
            try {
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("pagar")) {
                    realizarPagamento = true;
                    break;
                }

                System.out.print("Digite a quantidade que deseja comprar: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                sistema.venderProduto(input, quantidade);
                sistema.mostrarEstoque();
                System.out.print("Digite o nome do produto que deseja comprar (ou 'pagar' para ir ao menu de pagamento): ");
            } catch (NumberFormatException e) {
                System.out.println("Erro: Quantidade inválida. Certifique-se de digitar um número inteiro.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Chamando o Menu de Pagamento...");
        MenuDePagamento menuDePagamento = new MenuDePagamento();
        menuDePagamento.realizarPagamento();

        scanner.close();
    }

    public void mostrarRelatoriosEstatisticas() {
        RelatorioEstatisticas.Membro membro1 = new RelatorioEstatisticas.Membro("Rafaela", 26, 80.0);
        RelatorioEstatisticas.Membro membro2 = new RelatorioEstatisticas.Membro("Larissa", 20, 80.0);
        RelatorioEstatisticas.Membro membro3 = new RelatorioEstatisticas.Membro("Pedro", 22, 80.0);
        RelatorioEstatisticas.Membro membro4 = new RelatorioEstatisticas.Membro("Clara", 20, 80.0);
        RelatorioEstatisticas.Membro membro5 = new RelatorioEstatisticas.Membro("Ludmila", 20, 80.0);

        RelatorioEstatisticas.Academia academia = new RelatorioEstatisticas.Academia();
        academia.adicionarMembro(membro1);
        academia.adicionarMembro(membro2);
        academia.adicionarMembro(membro3);
        academia.adicionarMembro(membro4);
        academia.adicionarMembro(membro5);

        academia.adicionarDespesasMensais(2000.0);

        double receitasMensais = academia.calcularReceitasMensais();
        int frequenciaMensal = academia.calcularFrequenciaMensal();
        double lucroMensal = academia.calcularLucroMensal();

        System.out.println("Relatório Mensal:");
        System.out.println("Receitas Mensais: R$" + receitasMensais);
        System.out.println("Frequência Mensal Total: " + frequenciaMensal + " horas");
        System.out.println("Lucro Mensal: R$" + lucroMensal);
    }

    public void mostrarSeguranca() {
        Seguranca securitySystem = new Seguranca();
        Scanner scanner = new Scanner(System.in);

        Calendar calendar = Calendar.getInstance();
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        String saudacao = "";

        if (hora >= 0 && hora < 12) {
            saudacao = "Bom dia! ";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde! ";
        } else {
            saudacao = "Boa noite! ";
        }

        System.out.println(saudacao + "Vamos treinar?");

        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Digite seu nome de usuário: ");
            String username = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String password = scanner.nextLine();

            if (securitySystem.authenticateUser(username, password)) {
                System.out.println("Autenticação bem-sucedida. Acesso concedido!");
                break;
            } else {
                System.out.println("Autenticação falhou. Tente novamente.");
                attempts--;
                System.out.println("Tentativas restantes: " + attempts);
            }
        }
        if (attempts == 0) {
            System.out.println("Número máximo de tentativas excedido. Conta bloqueada.");
        }

        scanner.close();
    }
}
