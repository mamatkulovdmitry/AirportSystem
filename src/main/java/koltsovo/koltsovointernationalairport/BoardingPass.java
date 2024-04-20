package koltsovo.koltsovointernationalairport;

public class BoardingPass
{
    private String idBoardingPass;
    private String flightNumberBoardingPass;
    private String passengerBoardingPass;
    private String ticketNumberBoardingPass;
    private String departureDateBoardingPass;

    public BoardingPass (String idBoardingPass, String flightNumberBoardingPass, String passengerBoardingPass,
                         String ticketNumberBoardingPass, String departureDateBoardingPass)
    {
        this.idBoardingPass = idBoardingPass;
        this.flightNumberBoardingPass = flightNumberBoardingPass;
        this.passengerBoardingPass = passengerBoardingPass;
        this.ticketNumberBoardingPass = ticketNumberBoardingPass;
        this.departureDateBoardingPass = departureDateBoardingPass;
    }

    public String getIdBoardingPass()
    {
        return idBoardingPass;
    }

    public void setIdBoardingPass(String idBoardingPass)
    {
        this.idBoardingPass = idBoardingPass;
    }

    public String getFlightNumberBoardingPass()
    {
        return flightNumberBoardingPass;
    }

    public void setFlightNumberBoardingPass(String flightNumberBoardingPass)
    {
        this.flightNumberBoardingPass = flightNumberBoardingPass;
    }

    public String getPassengerBoardingPass()
    {
        return passengerBoardingPass;
    }

    public void setPassengerBoardingPass(String passengerBoardingPass)
    {
        this.passengerBoardingPass = passengerBoardingPass;
    }

    public String getTicketNumberBoardingPass()
    {
        return ticketNumberBoardingPass;
    }

    public void setTicketNumberBoardingPass(String ticketNumberBoardingPass)
    {
        this.ticketNumberBoardingPass = ticketNumberBoardingPass;
    }

    public String getDepartureDateBoardingPass()
    {
        return departureDateBoardingPass;
    }

    public void setDepartureDateBoardingPass(String departureDateBoardingPass)
    {
        this.departureDateBoardingPass = departureDateBoardingPass;
    }
}