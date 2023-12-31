package agendamentos;

import java.util.ArrayList;
import java.util.List;

public class ReservasAgendamentosOnline {
    private List<String> reservas;

    public ReservasAgendamentosOnline() {
        this.reservas = new ArrayList<>();
    }

    public void fazerReserva(String horario) {
        reservas.add(horario);
        System.out.println("Reserva feita para o horário: " + horario);
    }

    public void cancelarReserva(String horario) {
        if (reservas.contains(horario)) {
            reservas.remove(horario);
            System.out.println("Reserva cancelada para o horário: " + horario);
        } else {
            System.out.println("Nenhuma reserva encontrada para o horário especificado.");
        }
    }
}
