package pagamentos;

import java.util.ArrayList;
import java.util.List;

public class ControleDePagamento {
    private String nome;
    private double valor;
    private boolean pago;

    public ControleDePagamentos (String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.pago = false;
    }

    public ControleDePagamentos() {

    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean estaPago() {
        return pago;
    }

    public void pagar() {
        this.pago = true;
    }

    public void add(ControleDePagamentos controleDePagamento) {
    }
}

class Academia {
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

class ControlePagamentosAcademia {
    public static void main(String[] args) {
        Academia academia = new Academia();

        ControleDePagamentos c1 = new ControleDePagamentos("João", 100.0);
        ControleDePagamentos c2 = new ControleDePagamentos("Maria", 120.0);
        ControleDePagamentos c3 = new ControleDePagamentos("Rafaela", 150.0);

        academia.adicionarControleDePagamento(c1);
        academia.adicionarControleDePagamento(c2);
        academia.adicionarControleDePagamento(c3);

        c1.pagar();
        c2.pagar();
        c3.pagar();

        academia.emitirFatura();
        academia.emitirRecibo(c1);
        academia.emitirRecibo(c2);
        academia.emitirRecibo(c3);
        academia.acompanharPagamentosAtrasados();
    }
}
