package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DeletingPassengersController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeletePassengerButton;

    @FXML
    private TextField idPassengerField;

    @FXML
    void initialize()
    {
        confirmDeletePassengerButton.setOnAction(actionEvent ->
        {
            try
            {
                deletePassenger();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void deletePassenger() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String deletePassenger = dbHandler.deletePassenger(idPassengerField.getText());

        dbHandler.deletePassenger(deletePassenger);

        confirmDeletePassengerButton.getScene().getWindow().hide();
    }
}