package interfaces;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PaginaPrincipal extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistema de Academia");

        Button cadastroButton = new Button("Cadastro de Aluno");
        Button listaButton = new Button("Lista de Alunos");
        Button registroButton = new Button("Registro de Presença");

        cadastroButton.setOnAction(e -> abrirCadastroAluno());
        listaButton.setOnAction(e -> abrirListaAlunos());
        registroButton.setOnAction(e -> abrirRegistroPresenca());

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(cadastroButton, listaButton, registroButton);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void abrirCadastroAluno() {
        System.out.println("Abrindo Cadastro de Aluno");
    }

    private void abrirListaAlunos() {
        System.out.println("Abrindo Lista de Alunos");
    }

    private void abrirRegistroPresenca() {
        System.out.println("Abrindo Registro de Presença");
    }
}

