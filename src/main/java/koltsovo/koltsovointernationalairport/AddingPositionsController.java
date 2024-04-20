package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class AddingPositionsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmPositionButton;

    @FXML
    private TextField permissionSellTicketsField;

    @FXML
    private TextField positionDescriptionField;

    @FXML
    private TextField positionNameField;

    @FXML
    void initialize()
    {
        confirmPositionButton.setOnAction(actionEvent ->
        {
            try
            {
                addPosition();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void addPosition() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        dbHandler.addingPosition(positionNameField.getText(), positionDescriptionField.getText(), permissionSellTicketsField.getText());

        confirmPositionButton.getScene().getWindow().hide();
    }
}