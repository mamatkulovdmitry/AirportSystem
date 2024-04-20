package koltsovo.koltsovointernationalairport;

public class Destination
{
    private String idDestination;
    private String destinationName;
    private String destinationAddress;
    private String destinationCoordinates;
    private String destinationDescription;

    public Destination (String idDestination, String destinationName, String destinationAddress, String destinationCoordinates, String destinationDescription)
    {
        this.idDestination = idDestination;
        this.destinationName = destinationName;
        this.destinationAddress = destinationAddress;
        this.destinationCoordinates = destinationCoordinates;
        this.destinationDescription = destinationDescription;
    }

    public Destination(String destinationName) {}

    public String getIdDestination()
    {
        return idDestination;
    }

    public void setIdDestination(String idDestination)
    {
        this.idDestination = idDestination;
    }

    public String getDestinationName()
    {
        return destinationName;
    }

    public void setDestinationName(String destinationName)
    {
        this.destinationName = destinationName;
    }

    public String getDestinationAddress()
    {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress)
    {
        this.destinationAddress = destinationAddress;
    }

    public String getDestinationCoordinates()
    {
        return destinationCoordinates;
    }

    public void setDestinationCoordinates(String destinationCoordinates)
    {
        this.destinationCoordinates = destinationCoordinates;
    }

    public String getDestinationDescription()
    {
        return destinationDescription;
    }

    public void setDestinationDescription(String destinationDescription)
    {
        this.destinationDescription = destinationDescription;
    }
}