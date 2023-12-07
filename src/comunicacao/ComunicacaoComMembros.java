package comunicacao;

public class ComunicacaoComMembros {
    interface MetodoComunicacao {
        void enviarNotificacao(String mensagem);
    }

    public static class ComunicacaoEmail implements MetodoComunicacao {
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

    public static class ComunicacaoSMS implements MetodoComunicacao {
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

    public static class ComunicacaoMembros {
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
}
