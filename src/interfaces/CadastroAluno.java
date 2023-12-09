package interfaces;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CadastroAluno extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cadastro de Aluno");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label nomeLabel = new Label("Nome:");
        TextField nomeTextField = new TextField();

        Label idadeLabel = new Label("Idade:");
        TextField idadeTextField = new TextField();

        Button cadastrarButton = new Button("Cadastrar");

        grid.add(nomeLabel, 0, 0);
        grid.add(nomeTextField, 1, 0);
        grid.add(idadeLabel, 0, 1);
        grid.add(idadeTextField, 1, 1);
        grid.add(cadastrarButton, 1, 2);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}

