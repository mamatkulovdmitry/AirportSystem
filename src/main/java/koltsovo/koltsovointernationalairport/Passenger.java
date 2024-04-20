package koltsovo.koltsovointernationalairport;

public class Passenger
{
    private String idPassenger;
    private String surnamePassenger;
    private String namePassenger;
    private String patronymicPassenger;
    private String phonePassenger;
    private String addressPassenger;
    private String passportPassenger;
    private String discountPassenger;

    public Passenger (String idPassenger, String surnamePassenger, String namePassenger, String patronymicPassenger,
                     String phonePassenger, String addressPassenger, String passportPassenger, String discountPassenger)
    {
        this.idPassenger = idPassenger;
        this.surnamePassenger = surnamePassenger;
        this.namePassenger = namePassenger;
        this.patronymicPassenger = patronymicPassenger;
        this.phonePassenger = phonePassenger;
        this.addressPassenger = addressPassenger;
        this.passportPassenger = passportPassenger;
        this.discountPassenger = discountPassenger;
    }

    public String getIdPassenger()
    {
        return idPassenger;
    }

    public void setIdPassenger(String idPassenger)
    {
        this.idPassenger = idPassenger;
    }

    public String getSurnamePassenger()
    {
        return surnamePassenger;
    }

    public void setSurnamePassenger(String surnamePassenger)
    {
        this.surnamePassenger = surnamePassenger;
    }

    public String getNamePassenger()
    {
        return namePassenger;
    }

    public void setNamePassenger(String namePassenger)
    {
        this.namePassenger = namePassenger;
    }

    public String getPatronymicPassenger()
    {
        return patronymicPassenger;
    }

    public void setPatronymicPassenger(String patronymicPassenger)
    {
        this.patronymicPassenger = patronymicPassenger;
    }

    public String getPhonePassenger()
    {
        return phonePassenger;
    }

    public void setPhonePassenger(String phonePassenger)
    {
        this.phonePassenger = phonePassenger;
    }

    public String getAddressPassenger()
    {
        return addressPassenger;
    }

    public void setAddressPassenger(String addressPassenger)
    {
        this.addressPassenger = addressPassenger;
    }

    public String getPassportPassenger()
    {
        return passportPassenger;
    }

    public void setPassportPassenger(String passportPassenger)
    {
        this.passportPassenger = passportPassenger;
    }

    public String getDiscountPassenger()
    {
        return discountPassenger;
    }

    public void setDiscountPassenger(String discountPassenger)
    {
        this.discountPassenger = discountPassenger;
    }
}