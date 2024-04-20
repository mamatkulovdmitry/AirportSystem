package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DeletingAircraftsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeleteAircraftButton;

    @FXML
    private TextField idAircraftField;

    @FXML
    void initialize()
    {
        confirmDeleteAircraftButton.setOnAction(actionEvent ->
        {
            try
            {
                deleteAircraft();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void deleteAircraft() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String deleteAircraft = dbHandler.deleteAircraft(idAircraftField.getText());

        dbHandler.deleteAircraft(deleteAircraft);

        confirmDeleteAircraftButton.getScene().getWindow().hide();
    }
}