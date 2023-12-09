package treinos;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeTreinos {
    private String nome;
    private List<Exercicio> exercicios;

    public GerenciamentoDeTreinos(String nome) {
        this.nome = nome;
        exercicios = new ArrayList<>();
    }

    public void adicionarExercicio(Exercicio exercicio) {
        exercicios.add(exercicio);
    }

    public void listarGerenciamentoDeTreinos() {
        System.out.println("Ficha de Treino: " + nome);
        for (Exercicio exercicio : exercicios) {
            System.out.println("Exercício: " + exercicio.getNome());
            System.out.println("Grupo Muscular: " + exercicio.getGrupoMuscular());
            System.out.println("Séries: " + exercicio.getSeries());
            System.out.println("Repetições: " + exercicio.getRepeticoes());
            System.out.println("Descanso (segundos): " + exercicio.getDescanso());
            System.out.println();
        }
    }

    public static class Exercicio {
        private String nome;
        private String grupoMuscular;
        private int series;
        private int repeticoes;
        private int descanso; // em segundos

        public Exercicio(String nome, String grupoMuscular, int series, int repeticoes, int descanso) {
            this.nome = nome;
            this.grupoMuscular = grupoMuscular;
            this.series = series;
            this.repeticoes = repeticoes;
            this.descanso = descanso;
        }

        public String getNome() {
            return nome;
        }

        public String getGrupoMuscular() {
            return grupoMuscular;
        }

        public int getSeries() {
            return series;
        }

        public int getRepeticoes() {
            return repeticoes;
        }

        public int getDescanso() {
            return descanso;
        }
    }
}
