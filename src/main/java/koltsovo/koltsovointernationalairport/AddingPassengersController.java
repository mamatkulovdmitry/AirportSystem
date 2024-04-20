package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.ChoiceBox;
        import javafx.scene.control.TextField;

public class AddingPassengersController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField addressPassengersField;

    @FXML
    private Button confirmPassengerButton;

    @FXML
    private ChoiceBox<String> discountPassengersField;

    @FXML
    private TextField namePassengersField;

    @FXML
    private TextField passportPassengersField;

    @FXML
    private TextField patronymicPassengersField;

    @FXML
    private TextField phonePassengersField;

    @FXML
    private TextField surnamePassengersField;

    @FXML
    void initialize()
    {
        DatabaseHandler dbHandler = new DatabaseHandler();
        ObservableList<String> discountPassengersList = dbHandler.getDataDiscountPassengers();
        discountPassengersField.setItems(discountPassengersList);

        confirmPassengerButton.setOnAction(actionEvent ->
        {
            try
            {
                addPassenger();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void addPassenger() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        dbHandler.addingPassenger(surnamePassengersField.getText(), namePassengersField.getText(),
                patronymicPassengersField.getText(), phonePassengersField.getText(), addressPassengersField.getText(),
                passportPassengersField.getText(), discountPassengersField.getValue());

        confirmPassengerButton.getScene().getWindow().hide();
    }
}