package koltsovo.koltsovointernationalairport;

public class Position
{
    private String idPositions;
    private String positionName;
    private String positionDescription;
    private String permissionSellTickets;

    public Position (String idPositions, String positionName, String positionDescription, String permissionSellTickets)
    {
        this.idPositions = idPositions;
        this.positionName = positionName;
        this.positionDescription = positionDescription;
        this.permissionSellTickets = permissionSellTickets;
    }

    public String getIdPositions()
    {
        return idPositions;
    }

    public void setIdPositions(String idPositions)
    {
        this.idPositions = idPositions;
    }

    public String getPositionName()
    {
        return positionName;
    }

    public void setPositionName(String positionName)
    {
        this.positionName = positionName;
    }

    public String getPositionDescription()
    {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription)
    {
        this.positionDescription = positionDescription;
    }

    public String getPermissionSellTickets()
    {
        return permissionSellTickets;
    }

    public void setPermissionSellTickets(String permissionSellTickets)
    {
        this.permissionSellTickets = permissionSellTickets;
    }
}