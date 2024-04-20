package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DeletingFlightsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeleteFlightButton;

    @FXML
    private TextField idFlightField;

    @FXML
    void initialize()
    {
        confirmDeleteFlightButton.setOnAction(actionEvent ->
        {
            try
            {
                deleteFlight();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void deleteFlight() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String deleteFlight = dbHandler.deleteFlight(idFlightField.getText());

        dbHandler.deleteFlight(deleteFlight);

        confirmDeleteFlightButton.getScene().getWindow().hide();
    }
}