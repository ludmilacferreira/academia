package cadastro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public enum PlanoPagamento {
        MENSAL, TRIMESTRAL, SEMESTRAL, ANUAL
    }
}
