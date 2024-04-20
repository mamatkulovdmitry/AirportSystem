package koltsovo.koltsovointernationalairport;

        import java.io.IOException;
        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.ChoiceBox;
        import javafx.scene.control.TextField;

public class AddingFlightsController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> aircraftFlightsField;

    @FXML
    private ChoiceBox<String> airlineFlightsField;

    @FXML
    private Button confirmFlightButton;

    @FXML
    private ChoiceBox<String> destinationFlightsField;

    @FXML
    private TextField endDateFlightsField;

    @FXML
    private TextField flightNumberFlightsField;

    @FXML
    private TextField startDateFlightsField;

    @FXML
    private TextField ticketPriceFlightsField;

    @FXML
    void initialize()
    {
        DatabaseHandler dbHandler = new DatabaseHandler();
        ObservableList<String> destinationFlightsList = dbHandler.getDataDestinationFlights();
        destinationFlightsField.setItems(destinationFlightsList);

        ObservableList<String> airlineFlightsList = dbHandler.getDataAirlineFlights();
        airlineFlightsField.setItems(airlineFlightsList);

        ObservableList<String> aircraftFlightsList = dbHandler.getDataAircraftFlights();
        aircraftFlightsField.setItems(aircraftFlightsList);

        confirmFlightButton.setOnAction(actionEvent ->
        {
            try
            {
                addFlight();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void addFlight() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        dbHandler.addingFlight(destinationFlightsField.getValue(), flightNumberFlightsField.getText(),
                startDateFlightsField.getText(), endDateFlightsField.getText(), airlineFlightsField.getValue(),
                aircraftFlightsField.getValue(), ticketPriceFlightsField.getText());

        confirmFlightButton.getScene().getWindow().hide();
    }
}