package cadastro;

import java.util.HashMap;
import java.util.Map;

public class CadastroDeMembros {
    private Map<Integer, Membro> membros;

    public CadastroDeMembros() {
        this.membros = new HashMap<>();
    }

    public void cadastrarMembro(int id, String nome, PlanoPagamento plano) {
        Membro membro = new Membro(id, nome, plano);
        membros.put(id, membro);
        System.out.println("Membro cadastrado com sucesso: " + membro);
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
            System.out.println("ID: " + membro.getId());
            System.out.println("Nome: " + membro.getNome());
            System.out.println("Plano de Pagamento: " + membro.getPlano());
        } else {
            System.out.println("Membro não encontrado.");
        }
    }
}

class Membro {
    private int id;
    private String nome;
    private PlanoPagamento plano;

    public Membro(int id, String nome, PlanoPagamento plano) {
        this.id = id;
        this.nome = nome;
        this.plano = plano;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public PlanoPagamento getPlano() {
        return plano;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Plano de Pagamento: " + plano;
    }
}

enum PlanoPagamento {
    MENSAL, TRIMESTRAL, SEMESTRAL, ANUAL
}

