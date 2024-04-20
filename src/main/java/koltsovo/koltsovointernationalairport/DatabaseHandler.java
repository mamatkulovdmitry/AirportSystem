package koltsovo.koltsovointernationalairport;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;

public class DatabaseHandler extends Configs
{
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException
    {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try
        {
            dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        }
        catch (SQLException exception)
        {
            System.out.println("Can't connect to database!");
            System.out.println("Error: " + exception);
        }
        return dbConnection;
    }

    public ResultSet getUser(User user)
    {
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " +
                Const.USERS_USERNAME + "=? AND " + Const.USERS_PASSWORD + "=?";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, user.getUsername());
            prSt.setString(2, user.getPassword());

            resSet = prSt.executeQuery();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public void addingAircraft (String tailNumber, String model, String sizeAircraft, String entryDate)
    {
        String addAircrafts = "INSERT INTO " + Const.AIRCRAFTS_TABLE + "(" + Const.AIRCRAFTS_TAILNUMBER + "," + Const.AIRCRAFTS_MODEL +
                "," + Const.AIRCRAFTS_SIZE + "," + Const.AIRCRAFTS_ENTRYDATE + ")" + "VALUES(?,?,?,?)";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(addAircrafts);
            prSt.setString(1, tailNumber);
            prSt.setString(2, model);
            prSt.setString(3, sizeAircraft);
            prSt.setString(4, entryDate);
            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void addingAirline (String airlineName, String description, String contacts, String officeAddress)
    {
        String addAirlines = "INSERT INTO " + Const.AIRLINES_TABLE + "(" + Const.AIRLINES_NAME + "," + Const.AIRLINES_DESCRIPTION +
                "," + Const.AIRLINES_CONTACTS + "," + Const.AIRLINES_OFFICEADDRESS + ")" + "VALUES(?,?,?,?)";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(addAirlines);
            prSt.setString(1, airlineName);
            prSt.setString(2, description);
            prSt.setString(3, contacts);
            prSt.setString(4, officeAddress);
            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void addingDestination (String destinationName, String destinationAddress, String destinationCoordinates, String destinationDescription)
    {
        String addDestinations = "INSERT INTO " + Const.DESTINATIONS_TABLE + "(" + Const.DESTINATIONS_NAME + "," + Const.DESTINATIONS_ADDRESS +
                "," + Const.DESTINATIONS_COORDINATES + "," + Const.DESTINATIONS_DESCRIPTION + ")" + "VALUES(?,?,?,?)";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(addDestinations);
            prSt.setString(1, destinationName);
            prSt.setString(2, destinationAddress);
            prSt.setString(3, destinationCoordinates);
            prSt.setString(4, destinationDescription);
            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void addingFlight (String destinationFlight, String flightNumber, String startDate, String endDate, String airlineName, String aircraftModel, String ticketPrice)
    {
        String addFlights = "INSERT INTO " + Const.FLIGHTS_TABLE + "(" + Const.FLIGHTS_DESTINATION + "," + Const.FLIGHTS_NUMBER +
                "," + Const.FLIGHTS_STARTDATE + "," + Const.FLIGHTS_ENDDATE + "," + Const.FLIGHTS_AIRLINE + "," +
                Const.FLIGHTS_AIRCRAFT + "," + Const.FLIGHTS_TICKETPRICE + ")" + "VALUES(?,?,?,?,?,?,?)";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(addFlights);
            prSt.setString(1, destinationFlight);
            prSt.setString(2, flightNumber);
            prSt.setString(3, startDate);
            prSt.setString(4, endDate);
            prSt.setString(5, airlineName);
            prSt.setString(6, aircraftModel);
            prSt.setString(7, ticketPrice);
            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void addingPosition (String positionName, String positionDescription, String permissionSellTickets)
    {
        String addPositions = "INSERT INTO " + Const.POSITIONS_TABLE + "(" + Const.POSITIONS_NAME + "," + Const.POSITIONS_DESCRIPTION +
                "," + Const.POSITIONS_PERMISSIONSELLTICKETS + ")" + "VALUES(?,?,?)";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(addPositions);
            prSt.setString(1, positionName);
            prSt.setString(2, positionDescription);
            prSt.setString(3, permissionSellTickets);
            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void addingEmployee (String surnameEmployee, String nameEmployee, String patronymicEmployee,
                                String phoneEmployee, String addressEmployee, String positionEmployee)
    {
        String addEmployees = "INSERT INTO " + Const.EMPLOYEES_TABLE + "(" + Const.EMPLOYEES_SURNAME + "," + Const.EMPLOYEES_NAME +
                "," + Const.EMPLOYEES_PATRONYMIC + "," + Const.EMPLOYEES_PHONENUMBER + "," + Const.EMPLOYEES_ADDRESS +
                "," + Const.EMPLOYEES_POSITION + ")" + "VALUES(?,?,?,?,?,?)";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(addEmployees);
            prSt.setString(1, surnameEmployee);
            prSt.setString(2, nameEmployee);
            prSt.setString(3, patronymicEmployee);
            prSt.setString(4, phoneEmployee);
            prSt.setString(5, addressEmployee);
            prSt.setString(6, positionEmployee);
            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void addingPassenger (String surnamePassenger, String namePassenger, String patronymicPassenger,
                                 String phonePassenger, String addressPassenger, String passportPassenger, String discountPassenger)
    {
        String addPassengers = "INSERT INTO " + Const.PASSENGERS_TABLE + "(" + Const.PASSENGERS_SURNAME + "," + Const.PASSENGERS_NAME +
                "," + Const.PASSENGERS_PATRONYMIC + "," + Const.PASSENGERS_PHONENUMBER + "," + Const.PASSENGERS_ADDRESS +
                "," + Const.PASSENGERS_PASSPORT + "," + Const.PASSENGERS_DISCOUNT + ")" + "VALUES(?,?,?,?,?,?,?)";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(addPassengers);
            prSt.setString(1, surnamePassenger);
            prSt.setString(2, namePassenger);
            prSt.setString(3, patronymicPassenger);
            prSt.setString(4, phonePassenger);
            prSt.setString(5, addressPassenger);
            prSt.setString(6, passportPassenger);
            prSt.setString(7, discountPassenger);
            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void addingBoardingPass (String flightNumberBoardingPass, String passengerBoardingPass,
                                    String ticketNumberBoardingPass, String departureDateBoardingPass)
    {
        String addBoardingPasses = "INSERT INTO " + Const.BOARDINGPASSES_TABLE + "(" + Const.BOARDINGPASSES_FLIGHTNUMBER +
                "," + Const.BOARDINGPASSES_PASSENGER + "," + Const.BOARDINGPASSES_TICKETNUMBER + "," +
                Const.BOARDINGPASSES_DEPARTUREDATE + ")" + "VALUES(?,?,?,?)";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(addBoardingPasses);
            prSt.setString(1, flightNumberBoardingPass);
            prSt.setString(2, passengerBoardingPass);
            prSt.setString(3, ticketNumberBoardingPass);
            prSt.setString(4, departureDateBoardingPass);
            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void addingDiscount (String discountName, String percentage)
    {
        String addDiscounts = "INSERT INTO " + Const.DISCOUNTS_TABLE + "(" + Const.DISCOUNTS_NAME + "," +
                Const.DISCOUNTS_PERCENTAGE + ")" + "VALUES(?,?)";

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(addDiscounts);
            prSt.setString(1, discountName);
            prSt.setString(2, percentage);
            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public String deleteAircraft (String deleteAircraft)
    {
        String resSet = null;

        String deleteAircrafts = "DELETE FROM " + Const.AIRCRAFTS_TABLE + " WHERE " + Const.AIRCRAFTS_ID + " = " + deleteAircraft;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteAircrafts);

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public String deleteAirline (String deleteAirline)
    {
        String resSet = null;

        String deleteAirlines = "DELETE FROM " + Const.AIRLINES_TABLE + " WHERE " + Const.AIRLINES_ID + " = " + deleteAirline;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteAirlines);

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public String deleteDestination (String deleteDestination)
    {
        String resSet = null;

        String deleteDestinations = "DELETE FROM " + Const.DESTINATIONS_TABLE + " WHERE " + Const.DESTINATIONS_ID + " = " + deleteDestination;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteDestinations);

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public String deletePosition (String deletePosition)
    {
        String resSet = null;

        String deletePositions = "DELETE FROM " + Const.POSITIONS_TABLE + " WHERE " + Const.POSITIONS_ID + " = " + deletePosition;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(deletePositions);

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public String deleteDiscount (String deleteDiscount)
    {
        String resSet = null;

        String deleteDiscounts = "DELETE FROM " + Const.DISCOUNTS_TABLE + " WHERE " + Const.DISCOUNTS_ID + " = " + deleteDiscount;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteDiscounts);

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public String deleteEmployee (String deleteEmployee)
    {
        String resSet = null;

        String deleteEmployees = "DELETE FROM " + Const.EMPLOYEES_TABLE + " WHERE " + Const.EMPLOYEES_ID + " = " + deleteEmployee;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteEmployees);

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public String deleteFlight (String deleteFlight)
    {
        String resSet = null;

        String deleteFlights = "DELETE FROM " + Const.FLIGHTS_TABLE + " WHERE " + Const.FLIGHTS_ID + " = " + deleteFlight;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteFlights);

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public String deletePassenger (String deletePassenger)
    {
        String resSet = null;

        String deletePassengers = "DELETE FROM " + Const.PASSENGERS_TABLE + " WHERE " + Const.PASSENGERS_ID + " = " + deletePassenger;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(deletePassengers);

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public String deleteBoardingPasses (String deleteBoardingPass)
    {
        String resSet = null;

        String deleteBoardingPasses = "DELETE FROM " + Const.BOARDINGPASSES_TABLE + " WHERE " + Const.BOARDINGPASSES_ID + " = " + deleteBoardingPass;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(deleteBoardingPasses);

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resSet;
    }

    public ObservableList<Aircraft> getDataAircrafts()
    {
        ResultSet resSet = null;

        ObservableList<Aircraft> aircraftsList = FXCollections.observableArrayList();

        String ListOfAircrafts = "SELECT * FROM " + Const.AIRCRAFTS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfAircrafts);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                aircraftsList.add(new Aircraft(resSet.getString("idaircrafts"), resSet.getString("tailnumber"),
                        resSet.getString("model"), resSet.getString("size"), resSet.getString("entrydate")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return aircraftsList;
    }

    public ObservableList<BoardingPass> getDataBoardingPasses()
    {
        ResultSet resSet = null;

        ObservableList<BoardingPass> boardingPassesList = FXCollections.observableArrayList();

        String ListOfBoardingPasses = "SELECT * FROM " + Const.BOARDINGPASSES_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfBoardingPasses);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                boardingPassesList.add(new BoardingPass(resSet.getString("idboardingpasses"),
                        resSet.getString("flightnumberboardingpasses"),
                        resSet.getString("passengerboardingpasses"),
                        resSet.getString("ticketnumberboardingpasses"),
                        resSet.getString("departuredateboardingpasses")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return boardingPassesList;
    }

    public ObservableList<Passenger> getDataPassengers()
    {
        ResultSet resSet = null;

        ObservableList<Passenger> passengersList = FXCollections.observableArrayList();

        String ListOfPassengers = "SELECT * FROM " + Const.PASSENGERS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfPassengers);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                passengersList.add(new Passenger(resSet.getString("idpassengers"), resSet.getString("surnamepassengers"),
                        resSet.getString("namepassengers"), resSet.getString("patronymicpassengers"),
                        resSet.getString("phonepassengers"), resSet.getString("addresspassengers"),
                        resSet.getString("passportpassengers"), resSet.getString("discountpassengers")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return passengersList;
    }

    public ObservableList<Employee> getDataEmployees()
    {
        ResultSet resSet = null;

        ObservableList<Employee> employeesList = FXCollections.observableArrayList();

        String ListOfEmployees = "SELECT * FROM " + Const.EMPLOYEES_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfEmployees);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                employeesList.add(new Employee(resSet.getString("idemployees"), resSet.getString("surnameemployee"),
                        resSet.getString("nameemployee"), resSet.getString("patronymicemployee"), resSet.getString("phoneemployee"),
                        resSet.getString("addressemployee"), resSet.getString("positionemployee")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return employeesList;
    }

    public ObservableList<String> getDataDestinationFlights()
    {
        ResultSet resSet = null;

        ObservableList<String> destinationFlightsList = FXCollections.observableArrayList();

        String ListOfDestinationFlights = "SELECT " + Const.DESTINATIONS_NAME + " FROM " + Const.DESTINATIONS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfDestinationFlights);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                destinationFlightsList.add(resSet.getString("destinationName"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return destinationFlightsList;
    }

    public ObservableList<String> getDataDiscountPassengers()
    {
        ResultSet resSet = null;

        ObservableList<String> discountPassengersList = FXCollections.observableArrayList();

        String ListOfDiscountPassengers = "SELECT " + Const.DISCOUNTS_PERCENTAGE + " FROM " + Const.DISCOUNTS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfDiscountPassengers);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                discountPassengersList.add(resSet.getString("percentage"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return discountPassengersList;
    }

    public ObservableList<String> getDataAirlineFlights()
    {
        ResultSet resSet = null;

        ObservableList<String> airlineFlightsList = FXCollections.observableArrayList();

        String ListOfAirlineFlights = "SELECT " + Const.AIRLINES_NAME + " FROM " + Const.AIRLINES_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfAirlineFlights);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                airlineFlightsList.add(resSet.getString("airlineName"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return airlineFlightsList;
    }

    public ObservableList<String> getDataPositionEmployees()
    {
        ResultSet resSet = null;

        ObservableList<String> positionEmployeesList = FXCollections.observableArrayList();

        String ListOfPositionEmployees = "SELECT " + Const.POSITIONS_NAME + " FROM " + Const.POSITIONS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfPositionEmployees);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                positionEmployeesList.add(resSet.getString("positionName"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return positionEmployeesList;
    }

    public ObservableList<String> getDataAircraftFlights()
    {
        ResultSet resSet = null;

        ObservableList<String> aircraftFlightsList = FXCollections.observableArrayList();

        String ListOfAircraftFlights = "SELECT " + Const.AIRCRAFTS_MODEL + " FROM " + Const.AIRCRAFTS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfAircraftFlights);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                aircraftFlightsList.add(resSet.getString("model"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return aircraftFlightsList;
    }

    public ObservableList<String> getDataFlightNumberFlights()
    {
        ResultSet resSet = null;

        ObservableList<String> flightNumberFlightsList = FXCollections.observableArrayList();

        String ListOfFlightNumberFlights = "SELECT " + Const.FLIGHTS_NUMBER + " FROM " + Const.FLIGHTS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfFlightNumberFlights);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                flightNumberFlightsList.add(resSet.getString("flightNumber"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return flightNumberFlightsList;
    }

    public ObservableList<String> getDataPassengerSurnamePassengers()
    {
        ResultSet resSet = null;

        ObservableList<String> passengerSurnamePassengersList = FXCollections.observableArrayList();

        String ListOfPassengerSurnamePassengersList = "SELECT " + Const.PASSENGERS_SURNAME + " FROM " + Const.PASSENGERS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfPassengerSurnamePassengersList);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                passengerSurnamePassengersList.add(resSet.getString("surnamepassengers"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return passengerSurnamePassengersList;
    }

    public ObservableList<Discount> getDataDiscounts()
    {
        ResultSet resSet = null;

        ObservableList<Discount> discountsList = FXCollections.observableArrayList();

        String ListOfDiscounts = "SELECT * FROM " + Const.DISCOUNTS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfDiscounts);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                discountsList.add(new Discount(resSet.getString("iddiscounts"), resSet.getString("discountname"),
                        resSet.getString("percentage")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return discountsList;
    }

    public ObservableList<Position> getDataPositions()
    {
        ResultSet resSet = null;

        ObservableList<Position> positionsList = FXCollections.observableArrayList();

        String ListOfPositions = "SELECT * FROM " + Const.POSITIONS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfPositions);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                positionsList.add(new Position(resSet.getString("idpositions"), resSet.getString("positionname"),
                        resSet.getString("positiondescription"), resSet.getString("permissionselltickets")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return positionsList;
    }

    public ObservableList<Flight> getDataFlights()
    {
        ResultSet resSet = null;

        ObservableList<Flight> flightsList = FXCollections.observableArrayList();

        String ListOfFlights = "SELECT * FROM " + Const.FLIGHTS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfFlights);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                flightsList.add(new Flight(resSet.getString("idflights"), resSet.getString("destination"),
                        resSet.getString("flightnumber"), resSet.getString("startdate"),
                        resSet.getString("enddate"), resSet.getString("airline"),
                        resSet.getString("aircraft"), resSet.getString("ticketprice")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return flightsList;
    }

    public ObservableList<Destination> getDataDestinations()
    {
        ResultSet resSet = null;

        ObservableList<Destination> destinationsList = FXCollections.observableArrayList();

        String ListOfDestinations = "SELECT * FROM " + Const.DESTINATIONS_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfDestinations);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                destinationsList.add(new Destination(resSet.getString("iddestinations"), resSet.getString("destinationName"),
                        resSet.getString("destinationAddress"), resSet.getString("destinationCoordinates"), resSet.getString("destinationDescription")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return destinationsList;
    }

    public ObservableList<Airline> getDataAirlines()
    {
        ResultSet resSet = null;

        ObservableList<Airline> airlinesList = FXCollections.observableArrayList();

        String ListOfAirlines = "SELECT * FROM " + Const.AIRLINES_TABLE;

        try
        {
            PreparedStatement prSt = getDbConnection().prepareStatement(ListOfAirlines);

            resSet = prSt.executeQuery();

            while (resSet.next())
            {
                airlinesList.add(new Airline(resSet.getString("idairlines"), resSet.getString("airlinename"),
                        resSet.getString("description"), resSet.getString("contacts"), resSet.getString("officeaddress")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return airlinesList;
    }
}