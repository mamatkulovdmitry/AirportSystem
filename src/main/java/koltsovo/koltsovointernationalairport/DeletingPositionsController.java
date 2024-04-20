package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DeletingPositionsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmDeletePositionButton;

    @FXML
    private TextField idPositionField;

    @FXML
    void initialize()
    {
        confirmDeletePositionButton.setOnAction(actionEvent ->
        {
            try
            {
                deletePosition();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void deletePosition() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String deletePosition = dbHandler.deletePosition(idPositionField.getText());

        dbHandler.deletePosition(deletePosition);

        confirmDeletePositionButton.getScene().getWindow().hide();
    }
}