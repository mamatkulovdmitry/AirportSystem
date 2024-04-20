package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DeletingAirlinesController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeleteAirlineButton;

    @FXML
    private TextField idAirlineField;

    @FXML
    void initialize()
    {
        confirmDeleteAirlineButton.setOnAction(actionEvent ->
        {
            try
            {
                deleteAirline();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void deleteAirline() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String deleteAirline = dbHandler.deleteAirline(idAirlineField.getText());

        dbHandler.deleteAirline(deleteAirline);

        confirmDeleteAirlineButton.getScene().getWindow().hide();
    }
}