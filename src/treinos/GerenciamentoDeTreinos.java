package treinos;

public class GerenciamentoDeAulas {

    public void agendarAula(String instrutor, String horario) {
        System.out.println("Aula agendada para o instrutor " + instrutor + " no horário " + horario);
    }

    public void cancelarAula(String instrutor, String horario) {
        System.out.println("Aula cancelada para o instrutor " + instrutor + " no horário " + horario);
    }
}
