package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class AddingAirlinesController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField airlineNameField;

    @FXML
    private Button confirmAirlineButton;

    @FXML
    private TextField contactsField;

    @FXML
    private TextField descriptionField;

    @FXML
    private TextField officeAddressField;

    @FXML
    void initialize()
    {
        confirmAirlineButton.setOnAction(actionEvent ->
        {
            try
            {
                addAirline();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void addAirline() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        dbHandler.addingAirline(airlineNameField.getText(), descriptionField.getText(), contactsField.getText(), officeAddressField.getText());

        confirmAirlineButton.getScene().getWindow().hide();
    }
}