package cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class CadastroDeMembros {

    public static class Membro {
        private String nome;
        private String tipoMembro;

        public Membro(String nome, String tipoMembro) {
            this.nome = nome;
            this.tipoMembro = tipoMembro;
        }

        public String getNome() {
            return nome;
        }

        public String getTipoMembro() {
            return tipoMembro;
        }
    }

    public static class CadastroMembros {
        private List<Membro> listaMembros;

        public CadastroMembros() {
            this.listaMembros = new ArrayList<>();
        }

        public void adicionarMembro(Membro membro) {
            listaMembros.add(membro);
        }

        public void mostrarMembros() {
            for (Membro membro : listaMembros) {
                System.out.println("Nome: " + membro.getNome() + ", Tipo de Membro: " + membro.getTipoMembro());
            }
        }
    }

    private Map<Integer, Membro> membros;

    public CadastroDeMembros() {
        this.membros = new HashMap<>();
    }

    public void cadastrarMembro(int id, String nome, PlanoPagamento plano) {
        Membro membro = new Membro(nome, plano.toString());
        membros.put(id, membro);
        System.out.println("Membro cadastrado com sucesso: " + membro.getNome() + " com o plano de pagamento " + membro.getTipoMembro());
    }

    public Membro encontrarMembro(int id) {
        return membros.get(id);
    }

    public boolean membroExiste(int id) {
        return membros.containsKey(id);
    }

    public void mostrarDetalhesMembro(int id) {
        if (membroExiste(id)) {
            Membro membro = encontrarMembro(id);
            System.out.println("Detalhes do membro:");
            System.out.println("ID: " + id);
            System.out.println("Nome: " + membro.getNome());
            System.out.println("Plano de Pagamento: " + membro.getTipoMembro());
        } else {
            System.out.println("Membro não encontrado.");
        }
    }

    public static void main(String[] args) {
        CadastroMembros cadastroDeMembros = new CadastroMembros();

        Membro membro1 = new Membro("Ludmilla", "Premium");
        Membro membro2 = new Membro("Caio", "Regular");
        Membro membro3 = new Membro("Clara", "Premium");

        cadastroDeMembros.adicionarMembro(membro1);
        cadastroDeMembros.adicionarMembro(membro2);
        cadastroDeMembros.adicionarMembro(membro3);

        cadastroDeMembros.mostrarMembros();

        CadastroDeMembros cadastro = new CadastroDeMembros();

        cadastro.cadastrarMembro(1, "Ludmilla", PlanoPagamento.ANUAL);
        cadastro.cadastrarMembro(2, "Caio", PlanoPagamento.MENSAL);
        cadastro.cadastrarMembro(3, "Clara", PlanoPagamento.SEMESTRAL);

        cadastro.mostrarDetalhesMembro(1);
        cadastro.mostrarDetalhesMembro(2);
        cadastro.mostrarDetalhesMembro(3);
    }

    public enum PlanoPagamento {
        MENSAL, TRIMESTRAL, SEMESTRAL, ANUAL
    }
}

