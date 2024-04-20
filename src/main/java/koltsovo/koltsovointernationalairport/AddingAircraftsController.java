package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class AddingAircraftsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmAircraftButton;

    @FXML
    private TextField entryDateField;

    @FXML
    private TextField modelField;

    @FXML
    private TextField sizeAircraftField;

    @FXML
    private TextField tailNumberField;

    @FXML
    void initialize()
    {
        confirmAircraftButton.setOnAction(actionEvent ->
        {
            try
            {
                addAircraft();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void addAircraft() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        dbHandler.addingAircraft(tailNumberField.getText(), modelField.getText(), sizeAircraftField.getText(), entryDateField.getText());

        confirmAircraftButton.getScene().getWindow().hide();
    }
}