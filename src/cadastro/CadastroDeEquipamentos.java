package cadastro;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeEquipamentos {

    public static class Equipamento {
        private String nome;
        private String tipo;

        public Equipamento(String nome, String tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }

        public String getNome() {
            return nome;
        }

        public String getTipo() {
            return tipo;
        }
    }

    public static class CadastroEquipamentos {
        private List<Equipamento> listaEquipamentos;

        public CadastroEquipamentos() {
            this.listaEquipamentos = new ArrayList<>();
        }

        public void adicionarEquipamento(Equipamento equipamento) {
            listaEquipamentos.add(equipamento);
        }

        public void mostrarEquipamentos() {
            for (Equipamento equipamento : listaEquipamentos) {
                System.out.println("Nome: " + equipamento.getNome() + ", Tipo: " + equipamento.getTipo());
            }
        }
    }
}
