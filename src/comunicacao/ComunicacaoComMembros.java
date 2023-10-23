package comunicacao;

public class ComunicacaoComMembros {
    interface MetodoComunicacao {
        void enviarNotificacao(String mensagem);
    }

    static class ComunicacaoEmail implements MetodoComunicacao {
        private String enderecoEmail;

        public ComunicacaoEmail(String enderecoEmail) {
            this.enderecoEmail = enderecoEmail;
        }

        @Override
        public void enviarNotificacao(String mensagem) {
            System.out.println("Enviando e-mail para " + enderecoEmail + ":");
            System.out.println(mensagem);
        }
    }

    static class ComunicacaoSMS implements MetodoComunicacao {
        private String numeroTelefone;

        public ComunicacaoSMS(String numeroTelefone) {
            this.numeroTelefone = numeroTelefone;
        }

        @Override
        public void enviarNotificacao(String mensagem) {
            System.out.println("Enviando SMS para " + numeroTelefone + ":");
            System.out.println(mensagem);
        }
    }

    static class ComunicacaoMembros {
        private MetodoComunicacao metodoComunicacao;

        public void setMetodoComunicacao(MetodoComunicacao metodoComunicacao) {
            this.metodoComunicacao = metodoComunicacao;
        }

        public void enviarNotificacaoParaMembro(String mensagem) {
            if (metodoComunicacao != null) {
                metodoComunicacao.enviarNotificacao(mensagem);
            } else {
                System.out.println("Método de comunicação não configurado.");
            }
        }
    }

    public static void main(String[] args) {
        ComunicacaoMembros comunicacaoMembros = new ComunicacaoMembros();

        MetodoComunicacao comunicacaoPorEmail = new ComunicacaoEmail("exemplo@email.com");
        comunicacaoMembros.setMetodoComunicacao(comunicacaoPorEmail);
        comunicacaoMembros.enviarNotificacaoParaMembro("Aula de Zumba amanhã às 10h. Não se atrase!");

        MetodoComunicacao comunicacaoPorSMS = new ComunicacaoSMS("123456789");
        comunicacaoMembros.setMetodoComunicacao(comunicacaoPorSMS);
        comunicacaoMembros.enviarNotificacaoParaMembro("Seu pagamento está em atraso. Por favor, regularize.");

        comunicacaoMembros.enviarNotificacaoParaMembro("Teste de notificação sem método de comunicação configurado.");
    }
}
