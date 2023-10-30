package instrutores;

import java.util.ArrayList;
import java.util.List;

class Instrutor {
    private int id;
    private String nome;
    private String especialidade;

    public Instrutor(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}

public class GerenciamentoDeInstrutores {
    private List<Instrutor> instrutores;

    public GerenciamentoDeInstrutores() {
        instrutores = new ArrayList<>();
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);
    }

    public Instrutor buscarInstrutor(int id) {
        for (Instrutor instrutor : instrutores) {
            if (instrutor.getId() == id) {
                return instrutor;
            }
        }
        return null; // Instrutor não encontrado
    }

    public void listarInstrutores() {
        System.out.println("Lista de Instrutores:");
        for (Instrutor instrutor : instrutores) {
            System.out.println("ID: " + instrutor.getId());
            System.out.println("Nome: " + instrutor.getNome());
            System.out.println("Especialidade: " + instrutor.getEspecialidade());
            System.out.println();
        }
    }

    public void removerInstrutor(int id) {
        Instrutor instrutor = buscarInstrutor(id);
        if (instrutor != null) {
            instrutores.remove(instrutor);
        } else {
            System.out.println("Instrutor não encontrado.");
        }
    }
}
