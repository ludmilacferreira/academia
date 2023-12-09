package relatorios;

import java.util.ArrayList;
import java.util.List;

public class RelatorioEstatisticas {
    public static class Membro {
        private String nome;
        private int frequencia;
        private double mensalidade;

        public Membro(String nome, int frequencia, double mensalidade) {
            this.nome = nome;
            this.frequencia = frequencia;
            this.mensalidade = mensalidade;
        }

        public String getNome() {
            return nome;
        }

        public int getFrequencia() {
            return frequencia;
        }

        public double getMensalidade() {
            return mensalidade;
        }
    }

    public static class Academia {
        private List<Membro> membros = new ArrayList<>();
        private List<Double> despesasMensais = new ArrayList<>();

        public void adicionarMembro(Membro membro) {
            membros.add(membro);
        }

        public void adicionarDespesasMensais(double despesas) {
            despesasMensais.add(despesas);
        }

        public double calcularReceitasMensais() {
            double receitas = 0.0;
            for (Membro membro : membros) {
                receitas += membro.getMensalidade();
            }
            return receitas;
        }

        public int calcularFrequenciaMensal() {
            int frequenciaTotal = 0;
            for (Membro membro : membros) {
                frequenciaTotal += membro.getFrequencia();
            }
            return frequenciaTotal;
        }

        public double calcularLucroMensal() {
            double receitas = calcularReceitasMensais();
            double despesas = despesasMensais.stream().mapToDouble(Double::doubleValue).sum();
            return receitas - despesas;
        }
    }
}

