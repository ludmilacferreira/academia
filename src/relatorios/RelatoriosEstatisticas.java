package relatorios;

import java.util.ArrayList;
import java.util.List;
public class RelatoriosEstatisticas {
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
    public class Academia {
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
    public static void main(String[] args) {
        Academia academia = new Academia();

        Membro membro1 = new Membro("Rafaela", 26, 80.0);
        Membro membro2 = new Membro("Larissa", 20, 80.0);
        Membro membro3 = new Membro("Pedro", 22, 80.0);
        Membro membro4 = new Membro("Clara", 20, 80.0);
        Membro membro5 = new Membro ("Ludmila", 20, 80.0);

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
}

