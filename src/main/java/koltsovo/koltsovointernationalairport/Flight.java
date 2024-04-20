package koltsovo.koltsovointernationalairport;

public class Flight
{
    private String idFlight;
    private String destinationFlight;
    private String flightNumber;
    private String startDate;
    private String endDate;
    private String airlineName;
    private String aircraftModel;
    private String ticketPrice;

    public Flight (String idFlight, String destinationFlight, String flightNumber, String startDate, String endDate, String airlineName, String aircraftModel, String ticketPrice)
    {
        this.idFlight = idFlight;
        this.destinationFlight = destinationFlight;
        this.flightNumber = flightNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.airlineName = airlineName;
        this.aircraftModel = aircraftModel;
        this.ticketPrice = ticketPrice;
    }

    public Flight(String destination) {}

    public String getIdFlight()
    {
        return idFlight;
    }

    public void setIdFlight(String idFlight)
    {
        this.idFlight = idFlight;
    }

    public String getDestinationFlight()
    {
        return destinationFlight;
    }

    public void setDestinationFlight(String destinationFlight)
    {
        this.destinationFlight = destinationFlight;
    }

    public String getFlightNumber()
    {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public String getAirlineName()
    {
        return airlineName;
    }

    public void setAirlineName(String airlineName)
    {
        this.airlineName = airlineName;
    }

    public String getAircraftModel()
    {
        return aircraftModel;
    }

    public void setAircraftModel(String aircraftModel)
    {
        this.aircraftModel = aircraftModel;
    }

    public String getTicketPrice()
    {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice)
    {
        this.ticketPrice = ticketPrice;
    }
}