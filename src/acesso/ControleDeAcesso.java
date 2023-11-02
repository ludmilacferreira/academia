package acesso;

import java.util.HashMap;
import java.util.Map;

public class ControleDeAcesso {
    private Map<String, Boolean> cartoesDeAcesso;

    public ControleDeAcesso() {
        this.cartoesDeAcesso = new HashMap<>();
    }

    public void registrarCartao(String cartao) {
        cartoesDeAcesso.put(cartao, false);
    }

    public void liberarAcesso(String cartao) {
        if (cartoesDeAcesso.containsKey(cartao)) {
            cartoesDeAcesso.put(cartao, true);
            System.out.println("Acesso liberado para o cartão: " + cartao);
        } else {
            System.out.println("Cartão desconhecido. Acesso negado.");
        }
    }

    public void bloquearAcesso(String cartao) {
        if (cartoesDeAcesso.containsKey(cartao)) {
            cartoesDeAcesso.put(cartao, false);
            System.out.println("Acesso bloqueado para o cartão: " + cartao);
        } else {
            System.out.println("Cartão desconhecido. Acesso não bloqueado.");
        }
    }
}

class ControleAcessoAcademia {
    public static void main(String[] args) {
        ControleDeAcesso controleDeAcesso = new ControleDeAcesso();

        controleDeAcesso.registrarCartao("123456");
        controleDeAcesso.registrarCartao("987654");

        controleDeAcesso.liberarAcesso("123456");
        controleDeAcesso.liberarAcesso("987654");
        controleDeAcesso.liberarAcesso("999999");

        controleDeAcesso.bloquearAcesso("123456");
        controleDeAcesso.liberarAcesso("123456");
    }
}
}
