package koltsovo.koltsovointernationalairport;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Optional;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AuthorizationWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Koltsovo International Airport");
        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();

        stage.setOnCloseRequest( event ->
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Title");
            ButtonType buttonTypeOne = new ButtonType("Yes");
            ButtonType buttonTypeCancel = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
            alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeCancel);
            Optional<ButtonType> result = alert.showAndWait();
            if(result.get() == buttonTypeCancel) event.consume();
        });
    }

    public static void main(String[] args) {
        launch();
    }
}