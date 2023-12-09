package interfaces;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ListaAlunos extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lista de Alunos");

        TableView table = new TableView();

        TableColumn nomeCol = new TableColumn("Nome");
        TableColumn idadeCol = new TableColumn("Idade");

        table.getColumns().addAll(nomeCol, idadeCol);

        StackPane root = new StackPane();
        root.getChildren().add(table);
        primaryStage.setScene(new Scene(root, 300, 250));

        primaryStage.show();
    }
}


