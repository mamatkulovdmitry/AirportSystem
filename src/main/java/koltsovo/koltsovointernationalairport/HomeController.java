package koltsovo.koltsovointernationalairport;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.net.URL;
        import java.sql.SQLException;
        import java.util.Arrays;
        import java.util.ResourceBundle;
        import java.util.stream.Collectors;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Scene;
        import javafx.scene.chart.PieChart;
        import javafx.scene.control.Button;
        import javafx.scene.control.TableColumn;
        import javafx.scene.control.TableView;
        import javafx.scene.control.cell.PropertyValueFactory;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.BorderPane;
        import javafx.stage.FileChooser;
        import javafx.stage.Stage;

public class HomeController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addAircraftsButton;

    @FXML
    private ImageView addAirlinesButton;

    @FXML
    private ImageView addBoardingPassesButton;

    @FXML
    private ImageView addDestinationsButton;

    @FXML
    private ImageView addDiscountsButton;

    @FXML
    private ImageView addEmployeesButton;

    @FXML
    private ImageView addFlightsButton;

    @FXML
    private ImageView addPassengersButton;

    @FXML
    private ImageView addPositionsButton;

    @FXML
    private TableColumn<?, ?> addressEmployeesColumn;

    @FXML
    private TableColumn<?, ?> addressPassengersColumn;

    @FXML
    private TableColumn<?, ?> aircraftColumn;

    @FXML
    private TableColumn<?, ?> aircraftListOfFlightsColumn;

    @FXML
    private Button aircraftsButton;

    @FXML
    private BorderPane aircraftsPane;

    @FXML
    private TableView<Aircraft> aircraftsTable;

    @FXML
    private TableColumn<?, ?> airlineColumn;

    @FXML
    private TableColumn<?, ?> airlineContactsColumn;

    @FXML
    private TableColumn<?, ?> airlineDescriptionColumn;

    @FXML
    private TableColumn<?, ?> airlineListOfFlightsColumn;

    @FXML
    private TableColumn<?, ?> airlineNameColumn;

    @FXML
    private Button airlinesButton;

    @FXML
    private BorderPane airlinesPane;

    @FXML
    private TableView<Airline> airlinesTable;

    @FXML
    private Button boardingPassesButton;

    @FXML
    private BorderPane boardingPassesPane;

    @FXML
    private TableView<BoardingPass> boardingPassesTable;

    @FXML
    private ImageView closeAircraftsButton;

    @FXML
    private ImageView closeAirlinesButton;

    @FXML
    private ImageView closeDestinationsButton;

    @FXML
    private ImageView closeDiscountsButton;

    @FXML
    private ImageView closeEmployeesButton;

    @FXML
    private ImageView closeFlightsButton;

    @FXML
    private ImageView closePassengersButton;

    @FXML
    private ImageView closePositionsButton;

    @FXML
    private Button dashboardButton;

    @FXML
    private BorderPane dashboardPane;

    @FXML
    private ImageView deleteAircraftsButton;

    @FXML
    private ImageView deleteAirlinesButton;

    @FXML
    private ImageView deleteBoardingPassesButton;

    @FXML
    private ImageView deleteDestinationsButton;

    @FXML
    private ImageView deleteDiscountsButton;

    @FXML
    private ImageView deleteEmployeesButton;

    @FXML
    private ImageView deleteFlightsButton;

    @FXML
    private ImageView deletePassengersButton;

    @FXML
    private ImageView deletePositionsButton;

    @FXML
    private TableColumn<?, ?> departureDateBoardingPassesColumn;

    @FXML
    private TableColumn<?, ?> destinationAddressColumn;

    @FXML
    private TableColumn<?, ?> destinationColumn;

    @FXML
    private TableColumn<?, ?> destinationCoordinatesColumn;

    @FXML
    private TableColumn<?, ?> destinationDescriptionColumn;

    @FXML
    private TableColumn<?, ?> destinationListOfFlightsColumn;

    @FXML
    private TableColumn<?, ?> destinationNameColumn;

    @FXML
    private Button destinationsButton;

    @FXML
    private BorderPane destinationsPane;

    @FXML
    private TableView<Destination> destinationsTable;

    @FXML
    private TableColumn<?, ?> discountNameColumn;

    @FXML
    private TableColumn<?, ?> discountPassengersColumn;

    @FXML
    private TableColumn<?, ?> discountPercentageColumn;

    @FXML
    private Button discountsButton;

    @FXML
    private BorderPane discountsPane;

    @FXML
    private TableView<Discount> discountsTable;

    @FXML
    private Button employeesButton;

    @FXML
    private BorderPane employeesPane;

    @FXML
    private TableView<Employee> employeesTable;

    @FXML
    private TableColumn<?, ?> endDateColumn;

    @FXML
    private TableColumn<?, ?> endDateListOfFlightsColumn;

    @FXML
    private TableColumn<?, ?> entryDateColumn;

    @FXML
    private TableColumn<?, ?> flightNumberBoardingPassesColumn;

    @FXML
    private TableColumn<?, ?> flightNumberColumn;

    @FXML
    private TableColumn<?, ?> flightNumberListOfFlightsColumn;

    @FXML
    private Button flightsButton;

    @FXML
    private BorderPane flightsPane;

    @FXML
    private TableView<Flight> flightsTable;

    @FXML
    private TableColumn<?, ?> idAircraftColumn;

    @FXML
    private TableColumn<?, ?> idAirlineColumn;

    @FXML
    private TableColumn<?, ?> idBoardingPassesColumn;

    @FXML
    private TableColumn<?, ?> idDestinationColumn;

    @FXML
    private TableColumn<?, ?> idDiscountColumn;

    @FXML
    private TableColumn<?, ?> idEmployeesColumn;

    @FXML
    private TableColumn<?, ?> idFlightsColumn;

    @FXML
    private TableColumn<?, ?> idListOfFlightsColumn;

    @FXML
    private TableColumn<?, ?> idPassengersColumn;

    @FXML
    private TableColumn<?, ?> idPositionColumn;

    @FXML
    private Button listOfFlightsButton;

    @FXML
    private BorderPane listOfFlightsPane;

    @FXML
    private TableView<Flight> listOfFlightsTable;

    @FXML
    private ImageView logoKoltsovo;

    @FXML
    private TableColumn<?, ?> modelColumn;

    @FXML
    private TableColumn<?, ?> nameEmployeesColumn;

    @FXML
    private TableColumn<?, ?> namePassengersColumn;

    @FXML
    private TableColumn<?, ?> officeAddressColumn;

    @FXML
    private TableColumn<?, ?> passengerBoardingPassesColumn;

    @FXML
    private Button passengersButton;

    @FXML
    private BorderPane passengersPane;

    @FXML
    private TableView<Passenger> passengersTable;

    @FXML
    private TableColumn<?, ?> passportPassengersColumn;

    @FXML
    private TableColumn<?, ?> patronymicEmployeesColumn;

    @FXML
    private TableColumn<?, ?> patronymicPassengersColumn;

    @FXML
    private TableColumn<?, ?> permissionSellTicketsColumn;

    @FXML
    private TableColumn<?, ?> phoneEmployeesColumn;

    @FXML
    private TableColumn<?, ?> phonePassengersColumn;

    @FXML
    private TableColumn<?, ?> positionDescriptionColumn;

    @FXML
    private TableColumn<?, ?> positionEmployeesColumn;

    @FXML
    private TableColumn<?, ?> positionNameColumn;

    @FXML
    private Button positionsButton;

    @FXML
    private BorderPane positionsPane;

    @FXML
    private TableView<Position> positionsTable;

    @FXML
    private Button referencesButton;

    @FXML
    private BorderPane referencesPane;

    @FXML
    private ImageView refreshAircraftsButton;

    @FXML
    private ImageView refreshAirlinesButton;

    @FXML
    private ImageView refreshBoardingPassesButton;

    @FXML
    private ImageView refreshDestinationsButton;

    @FXML
    private ImageView refreshDiscountsButton;

    @FXML
    private ImageView refreshEmployeesButton;

    @FXML
    private ImageView refreshFlightsButton;

    @FXML
    private ImageView refreshPassengersButton;

    @FXML
    private ImageView refreshPositionsButton;

    @FXML
    private ImageView reportBoardingPassesButton;

    @FXML
    private TableColumn<?, ?> sizeAircraftColumn;

    @FXML
    private TableColumn<?, ?> startDateColumn;

    @FXML
    private TableColumn<?, ?> startDateListOfFlightsColumn;

    @FXML
    private Button statisticsButton;

    @FXML
    private PieChart statisticsChart;

    @FXML
    private BorderPane statisticsPane;

    @FXML
    private TableColumn<?, ?> surnameEmployeesColumn;

    @FXML
    private TableColumn<?, ?> surnamePassengersColumn;

    @FXML
    private TableColumn<?, ?> tailNumberColumn;

    @FXML
    private TableColumn<?, ?> ticketNumberBoardingPassesColumn;

    @FXML
    private TableColumn<?, ?> ticketPriceColumn;

    @FXML
    private TableColumn<?, ?> ticketPriceListOfFlightsColumn;

    @FXML
    void initialize()
    {
        dashboardPane.setVisible(true);
        boardingPassesPane.setVisible(false);
        referencesPane.setVisible(false);
        flightsPane.setVisible(false);
        aircraftsPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        airlinesPane.setVisible(false);

        dashboardButton.setOnAction(actionEvent ->
        {
            try
            {
                generalWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        boardingPassesButton.setOnAction(actionEvent ->
        {
            try
            {
                boardingPasses();
                refreshBoardingPassesTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        referencesButton.setOnAction(actionEvent ->
        {
            try
            {
                referencesWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        flightsButton.setOnAction(actionEvent ->
        {
            try
            {
                flightsWindow();
                refreshFlightsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        closeFlightsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                closeFlightsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        aircraftsButton.setOnAction(actionEvent ->
        {
            try
            {
                aircraftsWindow();
                refreshAircraftsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        closeAircraftsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                closeAircraftsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        addAircraftsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openAddAircraftsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deleteAircraftsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openDeletingAircraftsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        refreshAircraftsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshAircraftsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        airlinesButton.setOnAction(actionEvent ->
        {
            try
            {
                airlinesWindow();
                refreshAirlinesTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        closeAirlinesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                closeAirlinesWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        addAirlinesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openAddAirlinesWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        refreshAirlinesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshAirlinesTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deleteAirlinesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshAirlinesTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deleteAirlinesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openDeletingAirlinesWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        destinationsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                destinationsWindow();
                refreshDestinationsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        closeDestinationsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                closeDestinationsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        addDestinationsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openAddDestinationsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        refreshDestinationsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshDestinationsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deleteDestinationsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openDeletingDestinationsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        positionsButton.setOnAction(actionEvent ->
        {
            try
            {
                positionsWindow();
                refreshPositionsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        closePositionsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                closePositionsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        addPositionsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openAddPositionsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        refreshPositionsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshPositionsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deletePositionsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openDeletingPositionsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        discountsButton.setOnAction(actionEvent ->
        {
            try
            {
                discountsWindow();
                refreshDiscountsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        closeDiscountsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                closeDiscountsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        addDiscountsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openAddDiscountsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        refreshDiscountsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshDiscountsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deleteDiscountsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openDeletingDiscountsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        addFlightsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openAddFlightsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        refreshFlightsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshFlightsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deleteFlightsButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openDeletingFlightsWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        employeesButton.setOnAction(actionEvent ->
        {
            try
            {
                employeesWindow();
                refreshEmployeesTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        closeEmployeesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                closeEmployeesWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        addEmployeesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openAddEmployeesWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        refreshEmployeesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshEmployeesTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deleteEmployeesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openDeletingEmployeesWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        passengersButton.setOnAction(actionEvent ->
        {
            try
            {
                passengersWindow();
                refreshPassengersTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        closePassengersButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                closePassengersWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        addPassengersButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openAddPassengersWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        refreshPassengersButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshPassengersTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deletePassengersButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openDeletingPassengersWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        listOfFlightsButton.setOnAction(actionEvent ->
        {
            try
            {
                listOfFlights();
                refreshListOfFlightsTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        addBoardingPassesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openAddBoardingPassesWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        refreshBoardingPassesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                refreshBoardingPassesTable();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        deleteBoardingPassesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                openDeletingBoardingPassesWindow();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        statisticsButton.setOnAction(actionEvent ->
        {
            try
            {
                statistics();
                refreshFlightsData();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });

        reportBoardingPassesButton.setOnMouseClicked(mouseEvent ->
        {
            try
            {
                saveReportDatabase();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        });
    }

    public void referencesWindow() throws IOException
    {
        dashboardPane.setVisible(false);
        boardingPassesPane.setVisible(false);
        flightsPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        referencesPane.setVisible(true);
    }

    public void generalWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        airlinesPane.setVisible(false);
        flightsPane.setVisible(false);
        referencesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        aircraftsPane.setVisible(false);
        statisticsPane.setVisible(false);
        dashboardPane.setVisible(true);
    }

    public void boardingPasses() throws IOException
    {
        dashboardPane.setVisible(false);
        flightsPane.setVisible(false);
        referencesPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        boardingPassesPane.setVisible(true);
    }

    public void listOfFlights() throws IOException
    {
        dashboardPane.setVisible(false);
        flightsPane.setVisible(false);
        referencesPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        statisticsPane.setVisible(false);
        boardingPassesPane.setVisible(false);
        listOfFlightsPane.setVisible(true);
    }

    public void statistics() throws IOException
    {
        dashboardPane.setVisible(false);
        flightsPane.setVisible(false);
        referencesPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        boardingPassesPane.setVisible(false);
        statisticsPane.setVisible(true);
    }

    public void flightsWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        referencesPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        flightsPane.setVisible(true);
    }

    public void employeesWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        referencesPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        flightsPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        employeesPane.setVisible(true);
    }

    public void passengersWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        referencesPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        flightsPane.setVisible(false);
        employeesPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        passengersPane.setVisible(true);
    }

    public void closeFlightsWindow() throws IOException
    {
        dashboardPane.setVisible(false);
        boardingPassesPane.setVisible(false);
        flightsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        referencesPane.setVisible(true);
    }

    public void closePassengersWindow() throws IOException
    {
        dashboardPane.setVisible(false);
        boardingPassesPane.setVisible(false);
        flightsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        referencesPane.setVisible(true);
    }

    public void aircraftsWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        referencesPane.setVisible(false);
        flightsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        aircraftsPane.setVisible(true);
    }

    public void closeAircraftsWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        flightsPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        referencesPane.setVisible(true);
    }

    public void airlinesWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        referencesPane.setVisible(false);
        flightsPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        airlinesPane.setVisible(true);
    }

    public void destinationsWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        referencesPane.setVisible(false);
        flightsPane.setVisible(false);
        airlinesPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        destinationsPane.setVisible(true);
    }

    public void positionsWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        referencesPane.setVisible(false);
        flightsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        positionsPane.setVisible(true);
    }

    public void closeAirlinesWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        flightsPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        referencesPane.setVisible(true);
    }

    public void closeEmployeesWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        flightsPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        referencesPane.setVisible(true);
    }

    public void closeDestinationsWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        flightsPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        referencesPane.setVisible(true);
    }

    public void closePositionsWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        flightsPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        referencesPane.setVisible(true);
    }

    public void discountsWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        referencesPane.setVisible(false);
        flightsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        discountsPane.setVisible(true);
    }

    public void closeDiscountsWindow() throws IOException
    {
        boardingPassesPane.setVisible(false);
        dashboardPane.setVisible(false);
        flightsPane.setVisible(false);
        aircraftsPane.setVisible(false);
        airlinesPane.setVisible(false);
        destinationsPane.setVisible(false);
        positionsPane.setVisible(false);
        discountsPane.setVisible(false);
        employeesPane.setVisible(false);
        passengersPane.setVisible(false);
        listOfFlightsPane.setVisible(false);
        statisticsPane.setVisible(false);
        referencesPane.setVisible(true);
    }

    public void openAddAircraftsWindow() throws IOException
    {
        Stage addingAircraftsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddAircraftsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        addingAircraftsWindow.setTitle("Koltsovo International Airport");
        addingAircraftsWindow.setScene(scene);
        addingAircraftsWindow.setResizable(false);

        addingAircraftsWindow.show();
    }

    public void openAddBoardingPassesWindow() throws IOException
    {
        Stage addingBoardingPassesWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddBoardingPassesWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        addingBoardingPassesWindow.setTitle("Koltsovo International Airport");
        addingBoardingPassesWindow.setScene(scene);
        addingBoardingPassesWindow.setResizable(false);

        addingBoardingPassesWindow.show();
    }

    public void openAddPassengersWindow() throws IOException
    {
        Stage addingPassengersWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddPassengersWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        addingPassengersWindow.setTitle("Koltsovo International Airport");
        addingPassengersWindow.setScene(scene);
        addingPassengersWindow.setResizable(false);

        addingPassengersWindow.show();
    }

    public void openAddEmployeesWindow() throws IOException
    {
        Stage addingEmployeesWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddEmployeesWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        addingEmployeesWindow.setTitle("Koltsovo International Airport");
        addingEmployeesWindow.setScene(scene);
        addingEmployeesWindow.setResizable(false);

        addingEmployeesWindow.show();
    }

    public void openAddFlightsWindow() throws IOException
    {
        Stage addingFlightsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddFlightsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        addingFlightsWindow.setTitle("Koltsovo International Airport");
        addingFlightsWindow.setScene(scene);
        addingFlightsWindow.setResizable(false);

        addingFlightsWindow.show();
    }

    public void openAddPositionsWindow() throws IOException
    {
        Stage addingPositionsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddPositionsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        addingPositionsWindow.setTitle("Koltsovo International Airport");
        addingPositionsWindow.setScene(scene);
        addingPositionsWindow.setResizable(false);

        addingPositionsWindow.show();
    }

    public void openAddDestinationsWindow() throws IOException
    {
        Stage addingDestinationsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddDestinationsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        addingDestinationsWindow.setTitle("Koltsovo International Airport");
        addingDestinationsWindow.setScene(scene);
        addingDestinationsWindow.setResizable(false);

        addingDestinationsWindow.show();
    }

    public void openDeletingAirlinesWindow() throws IOException
    {
        Stage deletingAircraftsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeleteAirlinesWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        deletingAircraftsWindow.setTitle("Koltsovo International Airport");
        deletingAircraftsWindow.setScene(scene);
        deletingAircraftsWindow.setResizable(false);

        deletingAircraftsWindow.show();
    }

    public void openDeletingBoardingPassesWindow() throws IOException
    {
        Stage deletingBoardingPassesWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeleteBoardingPassesWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        deletingBoardingPassesWindow.setTitle("Koltsovo International Airport");
        deletingBoardingPassesWindow.setScene(scene);
        deletingBoardingPassesWindow.setResizable(false);

        deletingBoardingPassesWindow.show();
    }

    public void openDeletingPassengersWindow() throws IOException
    {
        Stage deletingPassengersWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeletePassengersWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        deletingPassengersWindow.setTitle("Koltsovo International Airport");
        deletingPassengersWindow.setScene(scene);
        deletingPassengersWindow.setResizable(false);

        deletingPassengersWindow.show();
    }

    public void openDeletingEmployeesWindow() throws IOException
    {
        Stage deletingEmployeesWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeleteEmployeesWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        deletingEmployeesWindow.setTitle("Koltsovo International Airport");
        deletingEmployeesWindow.setScene(scene);
        deletingEmployeesWindow.setResizable(false);

        deletingEmployeesWindow.show();
    }

    public void openDeletingDiscountsWindow() throws IOException
    {
        Stage deletingDiscountsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeleteDiscountsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        deletingDiscountsWindow.setTitle("Koltsovo International Airport");
        deletingDiscountsWindow.setScene(scene);
        deletingDiscountsWindow.setResizable(false);

        deletingDiscountsWindow.show();
    }

    public void openDeletingDestinationsWindow() throws IOException
    {
        Stage deletingDestinationsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeleteDestinationsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        deletingDestinationsWindow.setTitle("Koltsovo International Airport");
        deletingDestinationsWindow.setScene(scene);
        deletingDestinationsWindow.setResizable(false);

        deletingDestinationsWindow.show();
    }

    public void openAddAirlinesWindow() throws IOException
    {
        Stage addingAirlinesWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddAirlinesWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        addingAirlinesWindow.setTitle("Koltsovo International Airport");
        addingAirlinesWindow.setScene(scene);
        addingAirlinesWindow.setResizable(false);

        addingAirlinesWindow.show();
    }

    public void openAddDiscountsWindow() throws IOException
    {
        Stage addingDiscountsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddDiscountsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        addingDiscountsWindow.setTitle("Koltsovo International Airport");
        addingDiscountsWindow.setScene(scene);
        addingDiscountsWindow.setResizable(false);

        addingDiscountsWindow.show();
    }

    public void openDeletingAircraftsWindow () throws IOException
    {
        Stage deletingAircraftsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeleteAircraftsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        deletingAircraftsWindow.setTitle("Koltsovo International Airport");
        deletingAircraftsWindow.setScene(scene);
        deletingAircraftsWindow.setResizable(false);

        deletingAircraftsWindow.show();
    }

    public void openDeletingPositionsWindow () throws IOException
    {
        Stage deletingPositionsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeletePositionsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        deletingPositionsWindow.setTitle("Koltsovo International Airport");
        deletingPositionsWindow.setScene(scene);
        deletingPositionsWindow.setResizable(false);

        deletingPositionsWindow.show();
    }

    public void openDeletingFlightsWindow () throws IOException
    {
        Stage deletingFlightsWindow = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DeleteFlightsWindow.fxml"));
        Scene scene;
        try
        {
            scene = new Scene(fxmlLoader.load());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        deletingFlightsWindow.setTitle("Koltsovo International Airport");
        deletingFlightsWindow.setScene(scene);
        deletingFlightsWindow.setResizable(false);

        deletingFlightsWindow.show();
    }

    public void refreshAircraftsTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idAircraftColumn.setCellValueFactory(new PropertyValueFactory("idAircraft"));
        tailNumberColumn.setCellValueFactory(new PropertyValueFactory("tailNumber"));
        modelColumn.setCellValueFactory(new PropertyValueFactory("model"));
        sizeAircraftColumn.setCellValueFactory(new PropertyValueFactory("sizeAircraft"));
        entryDateColumn.setCellValueFactory(new PropertyValueFactory("entryDate"));

        ObservableList<Aircraft> listAircrafts = dbHandler.getDataAircrafts();
        aircraftsTable.setItems(listAircrafts);
    }

    public void refreshAirlinesTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idAirlineColumn.setCellValueFactory(new PropertyValueFactory("idAirline"));
        airlineNameColumn.setCellValueFactory(new PropertyValueFactory("airlineName"));
        airlineDescriptionColumn.setCellValueFactory(new PropertyValueFactory("description"));
        airlineContactsColumn.setCellValueFactory(new PropertyValueFactory("contacts"));
        officeAddressColumn.setCellValueFactory(new PropertyValueFactory("officeAddress"));

        ObservableList<Airline> listAirlines = dbHandler.getDataAirlines();
        airlinesTable.setItems(listAirlines);
    }

    public void refreshFlightsTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idFlightsColumn.setCellValueFactory(new PropertyValueFactory("idFlight"));
        destinationColumn.setCellValueFactory(new PropertyValueFactory("destinationFlight"));
        flightNumberColumn.setCellValueFactory(new PropertyValueFactory("flightNumber"));
        startDateColumn.setCellValueFactory(new PropertyValueFactory("startDate"));
        endDateColumn.setCellValueFactory(new PropertyValueFactory("endDate"));
        airlineColumn.setCellValueFactory(new PropertyValueFactory("airlineName"));
        aircraftColumn.setCellValueFactory(new PropertyValueFactory("aircraftModel"));
        ticketPriceColumn.setCellValueFactory(new PropertyValueFactory("ticketPrice"));

        ObservableList<Flight> listFlights = dbHandler.getDataFlights();
        flightsTable.setItems(listFlights);
    }

    public void refreshDestinationsTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idDestinationColumn.setCellValueFactory(new PropertyValueFactory("idDestination"));
        destinationNameColumn.setCellValueFactory(new PropertyValueFactory("destinationName"));
        destinationAddressColumn.setCellValueFactory(new PropertyValueFactory("destinationAddress"));
        destinationCoordinatesColumn.setCellValueFactory(new PropertyValueFactory("destinationCoordinates"));
        destinationDescriptionColumn.setCellValueFactory(new PropertyValueFactory("destinationDescription"));

        ObservableList<Destination> listDestinations = dbHandler.getDataDestinations();
        destinationsTable.setItems(listDestinations);
    }

    public void refreshPositionsTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idPositionColumn.setCellValueFactory(new PropertyValueFactory("idPositions"));
        positionNameColumn.setCellValueFactory(new PropertyValueFactory("positionName"));
        positionDescriptionColumn.setCellValueFactory(new PropertyValueFactory("positionDescription"));
        permissionSellTicketsColumn.setCellValueFactory(new PropertyValueFactory("permissionSellTickets"));

        ObservableList<Position> listPositions = dbHandler.getDataPositions();
        positionsTable.setItems(listPositions);
    }

    public void refreshDiscountsTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idDiscountColumn.setCellValueFactory(new PropertyValueFactory("idDiscount"));
        discountNameColumn.setCellValueFactory(new PropertyValueFactory("discountName"));
        discountPercentageColumn.setCellValueFactory(new PropertyValueFactory("percentage"));

        ObservableList<Discount> listDiscounts = dbHandler.getDataDiscounts();
        discountsTable.setItems(listDiscounts);
    }

    public void refreshEmployeesTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idEmployeesColumn.setCellValueFactory(new PropertyValueFactory("idEmployee"));
        surnameEmployeesColumn.setCellValueFactory(new PropertyValueFactory("surnameEmployee"));
        nameEmployeesColumn.setCellValueFactory(new PropertyValueFactory("nameEmployee"));
        patronymicEmployeesColumn.setCellValueFactory(new PropertyValueFactory("patronymicEmployee"));
        phoneEmployeesColumn.setCellValueFactory(new PropertyValueFactory("phoneEmployee"));
        addressEmployeesColumn.setCellValueFactory(new PropertyValueFactory("addressEmployee"));
        positionEmployeesColumn.setCellValueFactory(new PropertyValueFactory("positionEmployee"));

        ObservableList<Employee> listEmployees = dbHandler.getDataEmployees();
        employeesTable.setItems(listEmployees);
    }

    public void refreshPassengersTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idPassengersColumn.setCellValueFactory(new PropertyValueFactory("idPassenger"));
        surnamePassengersColumn.setCellValueFactory(new PropertyValueFactory("surnamePassenger"));
        namePassengersColumn.setCellValueFactory(new PropertyValueFactory("namePassenger"));
        patronymicPassengersColumn.setCellValueFactory(new PropertyValueFactory("patronymicPassenger"));
        phonePassengersColumn.setCellValueFactory(new PropertyValueFactory("phonePassenger"));
        addressPassengersColumn.setCellValueFactory(new PropertyValueFactory("addressPassenger"));
        passportPassengersColumn.setCellValueFactory(new PropertyValueFactory("passportPassenger"));
        discountPassengersColumn.setCellValueFactory(new PropertyValueFactory("discountPassenger"));

        ObservableList<Passenger> listPassengers = dbHandler.getDataPassengers();
        passengersTable.setItems(listPassengers);
    }

    public void refreshBoardingPassesTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idBoardingPassesColumn.setCellValueFactory(new PropertyValueFactory("idBoardingPass"));
        flightNumberBoardingPassesColumn.setCellValueFactory(new PropertyValueFactory("flightNumberBoardingPass"));
        passengerBoardingPassesColumn.setCellValueFactory(new PropertyValueFactory("passengerBoardingPass"));
        ticketNumberBoardingPassesColumn.setCellValueFactory(new PropertyValueFactory("ticketNumberBoardingPass"));
        departureDateBoardingPassesColumn.setCellValueFactory(new PropertyValueFactory("departureDateBoardingPass"));

        ObservableList<BoardingPass> listBoardingPasses = dbHandler.getDataBoardingPasses();
        boardingPassesTable.setItems(listBoardingPasses);
    }

    public void refreshListOfFlightsTable() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        idListOfFlightsColumn.setCellValueFactory(new PropertyValueFactory("idFlight"));
        destinationListOfFlightsColumn.setCellValueFactory(new PropertyValueFactory("destinationFlight"));
        flightNumberListOfFlightsColumn.setCellValueFactory(new PropertyValueFactory("flightNumber"));
        startDateListOfFlightsColumn.setCellValueFactory(new PropertyValueFactory("startDate"));
        endDateListOfFlightsColumn.setCellValueFactory(new PropertyValueFactory("endDate"));
        airlineListOfFlightsColumn.setCellValueFactory(new PropertyValueFactory("airlineName"));
        aircraftListOfFlightsColumn.setCellValueFactory(new PropertyValueFactory("aircraftModel"));
        ticketPriceListOfFlightsColumn.setCellValueFactory(new PropertyValueFactory("ticketPrice"));

        ObservableList<Flight> listFlights = dbHandler.getDataFlights();
        listOfFlightsTable.setItems(listFlights);
    }

    public void refreshFlightsData() throws IOException
    {
        ObservableList<PieChart.Data> statisticsData = FXCollections.observableArrayList(
                new PieChart.Data("Moscow", 13),
                new PieChart.Data("Los Angeles", 25),
                new PieChart.Data("New York", 10),
                new PieChart.Data("Frankfurt", 22),
                new PieChart.Data("Antalya", 30));

        statisticsChart.setData(statisticsData);
        statisticsChart.setTitle("Popular Destinations");
    }

    public void saveReportDatabase() throws IOException
    {
        DatabaseHandler dbHandler = new DatabaseHandler();

        FileChooser fileChooser = new FileChooser();

        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV UTF-8", ".csv"),
                new FileChooser.ExtensionFilter("Excel Workbook", ".xlsx"));

        ObservableList<String> destinationFlightsList = dbHandler.getDataDestinationFlights();

        String destinationList = destinationFlightsList.toString();
        destinationList = destinationList.replace("[", "").replace("]", "");
        //System.out.println(destinationList);

        File file = fileChooser.showSaveDialog(new Stage());

        if (file != null)
        {
            saveReportSystem(file, destinationList);
            //saveReportSystem(file, destinationFlightsList.toString());
        }
    }

    public void saveReportSystem(File file, String content)
    {
        try
        {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(content);
            printWriter.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}