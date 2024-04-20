package koltsovo.koltsovointernationalairport;

public class Airline
{
    private String idAirline;
    private String airlineName;
    private String description;
    private String contacts;
    private String officeAddress;

    public Airline (String idAirline, String airlineName, String description, String contacts, String officeAddress)
    {
        this.idAirline = idAirline;
        this.airlineName = airlineName;
        this.description = description;
        this.contacts = contacts;
        this.officeAddress = officeAddress;
    }

    public String getIdAirline()
    {
        return idAirline;
    }

    public void setIdAirline(String idAirline)
    {
        this.idAirline = idAirline;
    }

    public String getAirlineName()
    {
        return airlineName;
    }

    public void setAirlineName(String airlineName)
    {
        this.airlineName = airlineName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getContacts()
    {
        return contacts;
    }

    public void setContacts(String contacts)
    {
        this.contacts = contacts;
    }

    public String getOfficeAddress()
    {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress)
    {
        this.officeAddress = officeAddress;
    }
}