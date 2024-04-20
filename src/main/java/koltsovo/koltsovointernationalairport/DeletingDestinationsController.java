package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DeletingDestinationsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeleteDestinationButton;

    @FXML
    private TextField idDestinationField;

    @FXML
    void initialize()
    {
        confirmDeleteDestinationButton.setOnAction(actionEvent ->
        {
            try
            {
                deleteDestination();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void deleteDestination() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String deleteDestination = dbHandler.deleteDestination(idDestinationField.getText());

        dbHandler.deleteDestination(deleteDestination);

        confirmDeleteDestinationButton.getScene().getWindow().hide();
    }
}