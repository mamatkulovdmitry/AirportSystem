package koltsovo.koltsovointernationalairport;

public class Aircraft
{
    private String idAircraft;
    private String tailNumber;
    private String model;
    private String sizeAircraft;
    private String entryDate;

    public Aircraft (String idAircraft, String tailNumber, String model, String sizeAircraft, String entryDate)
    {
        this.idAircraft = idAircraft;
        this.tailNumber = tailNumber;
        this.model = model;
        this.sizeAircraft = sizeAircraft;
        this.entryDate = entryDate;
    }

    public String getIdAircraft()
    {
        return idAircraft;
    }

    public void setIdAircraft(String idAircraft)
    {
        this.idAircraft = idAircraft;
    }

    public String getTailNumber()
    {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber)
    {
        this.tailNumber = tailNumber;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getSizeAircraft()
    {
        return sizeAircraft;
    }

    public void setSizeAircraft(String sizeAircraft)
    {
        this.sizeAircraft = sizeAircraft;
    }

    public String getEntryDate()
    {
        return entryDate;
    }

    public void setEntryDate(String entryDate)
    {
        this.entryDate = entryDate;
    }
}