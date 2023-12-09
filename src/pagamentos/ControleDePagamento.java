package pagamentos;

public class ControleDePagamentos {
    private String nome;
    private double valor;
    private boolean pago;

    public ControleDePagamentos(String nome, double valor) {
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
