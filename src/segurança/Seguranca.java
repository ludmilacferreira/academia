package seguranca;

import java.util.HashMap;
import java.util.Map;

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
}
