package instrutores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GerenciamentoDeInstrutores {

    private List<Instrutor> instrutores;
    private Random random;

    public GerenciamentoDeInstrutores() {
        this.instrutores = new ArrayList<>();
        this.random = new Random();
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
        return null;
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

    public class Instrutor {
        private int id;
        private String nome;
        private String especialidade;

        public Instrutor(String nome, String especialidade) {
            this.id = random.nextInt(1000);
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

    public static void main(String[] args) {
        GerenciamentoDeInstrutores gerenciamento = new GerenciamentoDeInstrutores();

        Instrutor instrutor1 = gerenciamento.new Instrutor("André", "Musculação (estagiário)");
        Instrutor instrutor2 = gerenciamento.new Instrutor("Carlos", "Musculação (professor)");
        Instrutor instrutor3 = gerenciamento.new Instrutor("Mariana", "Pilates (professora)");

        gerenciamento.adicionarInstrutor(instrutor1);
        gerenciamento.adicionarInstrutor(instrutor2);
        gerenciamento.adicionarInstrutor(instrutor3);

        gerenciamento.listarInstrutores();
    }
}
