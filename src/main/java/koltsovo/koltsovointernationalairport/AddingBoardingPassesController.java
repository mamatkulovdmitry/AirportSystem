package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;

        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.ChoiceBox;
        import javafx.scene.control.TextField;

public class AddingBoardingPassesController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmBoardingPassesButton;

    @FXML
    private TextField departureDateBoardingPassesField;

    @FXML
    private ChoiceBox<String> flightNumberBoardingPassesField;

    @FXML
    private ChoiceBox<String> passengerBoardingPassesField;

    @FXML
    private TextField ticketNumberBoardingPassesField;

    @FXML
    void initialize()
    {
        DatabaseHandler dbHandler = new DatabaseHandler();
        ObservableList<String> flightNumberFlightsList = dbHandler.getDataFlightNumberFlights();
        flightNumberBoardingPassesField.setItems(flightNumberFlightsList);

        ObservableList<String> passengerSurnamePassengersList = dbHandler.getDataPassengerSurnamePassengers();
        passengerBoardingPassesField.setItems(passengerSurnamePassengersList);

        confirmBoardingPassesButton.setOnAction(actionEvent ->
        {
            try
            {
                addBoardingPass();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void addBoardingPass() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        dbHandler.addingBoardingPass(flightNumberBoardingPassesField.getValue(), passengerBoardingPassesField.getValue(),
                ticketNumberBoardingPassesField.getText(), departureDateBoardingPassesField.getText());

        confirmBoardingPassesButton.getScene().getWindow().hide();
    }
}