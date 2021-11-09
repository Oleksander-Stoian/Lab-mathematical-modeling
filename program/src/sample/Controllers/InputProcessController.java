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


public class InputProcessController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonWindow1Next;


    @FXML
    void initialize() {
        ButtonWindow1Next.setOnAction(event ->
        {
            /*ButtonWindow1Next.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/InputLimitsW2.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();*/
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/sample/View/InputLimitsW2.fxml"));
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
