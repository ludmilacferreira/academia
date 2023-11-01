package cadastro;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeFuncionarios {
    private List<Funcionario> listaFuncionarios;

    public CadastroDeFuncionarios() {
        this.listaFuncionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public void mostrarFuncionarios() {
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo());
        }
    }

    public void realizarCadastroDeFuncionarios() {
    }

    public class Funcionario {
        private String nome;
        private String cargo;

        public Funcionario(String nome, String cargo) {
            this.nome = nome;
            this.cargo = cargo;
        }

        public String getNome() {
            return nome;
        }

        public String getCargo() {
            return cargo;
        }
    }
}

class CadastroFuncionarios {
    public static void main(String[] args) {
        CadastroDeFuncionarios cadastro = new CadastroDeFuncionarios();

        CadastroDeFuncionarios.Funcionario funcionario1 = cadastro.new Funcionario("João", "Faxineiro");
        CadastroDeFuncionarios.Funcionario funcionario2 = cadastro.new Funcionario("Larissa", "Recepcionista");
        CadastroDeFuncionarios.Funcionario funcionario3 = cadastro.new Funcionario("Pedro", "Instrutor");

        cadastro.adicionarFuncionario(funcionario1);
        cadastro.adicionarFuncionario(funcionario2);
        cadastro.adicionarFuncionario(funcionario3);

        cadastro.mostrarFuncionarios();
    }
}
