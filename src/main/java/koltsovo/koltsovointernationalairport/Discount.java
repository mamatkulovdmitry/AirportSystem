package koltsovo.koltsovointernationalairport;

public class Discount
{
    private String idDiscount;
    private String discountName;
    private String percentage;

    public Discount (String idDiscount, String discountName, String percentage)
    {
        this.idDiscount = idDiscount;
        this.discountName = discountName;
        this.percentage = percentage;
    }

    public String getIdDiscount()
    {
        return idDiscount;
    }

    public void setIdDiscount(String idDiscount)
    {
        this.idDiscount = idDiscount;
    }

    public String getDiscountName()
    {
        return discountName;
    }

    public void setDiscountName(String discountName)
    {
        this.discountName = discountName;
    }

    public String getPercentage()
    {
        return percentage;
    }

    public void setPercentage(String percentage)
    {
        this.percentage = percentage;
    }
}