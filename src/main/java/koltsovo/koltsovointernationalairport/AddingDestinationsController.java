package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class AddingDestinationsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDestinationsButton;

    @FXML
    private TextField destinationAddressField;

    @FXML
    private TextField destinationCoordinatesField;

    @FXML
    private TextField destinationDescriptionField;

    @FXML
    private TextField destinationNameField;

    @FXML
    void initialize()
    {
        confirmDestinationsButton.setOnAction(actionEvent ->
        {
            try
            {
                addDestination();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void addDestination() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        dbHandler.addingDestination(destinationNameField.getText(), destinationAddressField.getText(), destinationCoordinatesField.getText(), destinationDescriptionField.getText());

        confirmDestinationsButton.getScene().getWindow().hide();
    }
}