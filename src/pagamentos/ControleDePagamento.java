package pagamentos;

public class ControleDePagamentos {
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
