package seguranca;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Seguranca {
    private Map<String, String> users = new HashMap<>();

    public Seguranca() {
        users.put("usuario1", "senha123");
        users.put("usuario2", "senha456");
    }

    public boolean authenticateUser(String username, String password) {
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    public static void main(String[] args) {
        Seguranca securitySystem = new Seguranca();
        Scanner scanner = new Scanner(System.in);

        Calendar calendar = Calendar.getInstance();
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        String saudacao = "";

        if (hora >= 0 && hora < 12) {
            saudacao = "Bom dia! ";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde! ";
        } else {
            saudacao = "Boa noite! ";
        }

        System.out.println(saudacao + "Vamos treinar?");

        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Digite seu nome de usuário: ");
            String username = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String password = scanner.nextLine();

            if (securitySystem.authenticateUser(username, password)) {
                System.out.println("Autenticação bem-sucedida. Acesso concedido!");
                break;
            } else {
                System.out.println("Autenticação falhou. Tente novamente.");
                attempts--;
                System.out.println("Tentativas restantes: " + attempts);
            }
        }
        if (attempts == 0) {
            System.out.println("Número máximo de tentativas excedido. Conta bloqueada.");
        }

        scanner.close();
    }
}
