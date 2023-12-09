package pagamentos;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<ControleDePagamentos> controleDePagamentos;

    public Academia() {
        this.controleDePagamentos = new ArrayList<>();
    }

    public void adicionarControleDePagamento(ControleDePagamentos controleDePagamentos) {
        controleDePagamentos.add(controleDePagamentos);
    }

    public void emitirFatura() {
        for (ControleDePagamentos controleDePagamento : controleDePagamentos) {
            if (!controleDePagamento.estaPago()) {
                System.out.println("Fatura para " + controleDePagamento.getNome() + " no valor de " + controleDePagamento.getValor() + " foi emitida.");
            }
        }
    }

    public void emitirRecibo(ControleDePagamentos controleDePagamento) {
        if (controleDePagamento.estaPago()) {
            System.out.println("Recibo para " + controleDePagamento.getNome() + " no valor de " + controleDePagamento.getValor() + " foi emitido.");
        }
    }

    public void acompanharPagamentosAtrasados() {
        for (ControleDePagamentos controleDePagamento : controleDePagamentos) {
            if (!controleDePagamento.estaPago()) {
                System.out.println("Pagamento em atraso para " + controleDePagamento.getNome() + " no valor de " + controleDePagamento.getValor());
            }
        }
    }
}
