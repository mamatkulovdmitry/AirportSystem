package koltsovo.koltsovointernationalairport;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView KoltsovoLogo;

    @FXML
    private Label authorizationLabel;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    void initialize()
    {
        loginButton.setOnAction(actionEvent ->
        {

            String usernameText = usernameField.getText().trim();
            String passwordText = passwordField.getText().trim();

            if (!usernameText.equals("") && !passwordText.equals(""))
            {
                try
                {
                    loginUser(usernameText, passwordText);
                } catch (SQLException e)
                {
                    throw new RuntimeException(e);
                }
            }
            else
            {
                System.out.println("Username and password are empty!");
            }
        });
    }

    private void loginUser(String usernameText, String passwordText) throws SQLException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setUsername(usernameText);
        user.setPassword(passwordText);
        ResultSet result = dbHandler.getUser(user);

        int counter = 0;

        while (result.next())
        {
            counter++;
        }

        if (counter >= 1)
        {
            //System.out.println("Login successfully!");

            loginButton.getScene().getWindow().hide();

            Stage generalWindow = new Stage();

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("GeneralWindow.fxml"));
            Scene scene;
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            generalWindow.setTitle("Koltsovo International Airport");
            generalWindow.setScene(scene);
            generalWindow.setResizable(false);

            generalWindow.show();
        }
        else
        {
            System.out.println("Check the correctness of the entered data!");
        }
    }
}