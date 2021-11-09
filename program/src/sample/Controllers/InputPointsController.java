package sample.Controllers;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class InputPointsController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonWindow4;

    @FXML
    private Button ButtonWindow11;

    @FXML
    private Button ButtonWindow111;

    @FXML
    void initialize() {
        ButtonWindow4.setOnAction(event ->
        {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("/sample/View/ResultW5.fxml"));
                stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

    }
}
