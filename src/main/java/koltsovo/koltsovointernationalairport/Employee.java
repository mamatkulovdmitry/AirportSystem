package koltsovo.koltsovointernationalairport;

public class Employee
{
    private String idEmployee;
    private String surnameEmployee;
    private String nameEmployee;
    private String patronymicEmployee;
    private String phoneEmployee;
    private String addressEmployee;
    private String positionEmployee;

    public Employee (String idEmployee, String surnameEmployee, String nameEmployee, String patronymicEmployee,
                     String phoneEmployee, String addressEmployee, String positionEmployee)
    {
        this.idEmployee = idEmployee;
        this.surnameEmployee = surnameEmployee;
        this.nameEmployee = nameEmployee;
        this.patronymicEmployee = patronymicEmployee;
        this.phoneEmployee = phoneEmployee;
        this.addressEmployee = addressEmployee;
        this.positionEmployee = positionEmployee;
    }

    public String getIdEmployee()
    {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee)
    {
        this.idEmployee = idEmployee;
    }

    public String getSurnameEmployee()
    {
        return surnameEmployee;
    }

    public void setSurnameEmployee(String surnameEmployee)
    {
        this.surnameEmployee = surnameEmployee;
    }

    public String getNameEmployee()
    {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee)
    {
        this.nameEmployee = nameEmployee;
    }

    public String getPatronymicEmployee()
    {
        return patronymicEmployee;
    }

    public void setPatronymicEmployee(String patronymicEmployee)
    {
        this.patronymicEmployee = patronymicEmployee;
    }

    public String getPhoneEmployee()
    {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee)
    {
        this.phoneEmployee = phoneEmployee;
    }

    public String getAddressEmployee()
    {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee)
    {
        this.addressEmployee = addressEmployee;
    }

    public String getPositionEmployee()
    {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee)
    {
        this.positionEmployee = positionEmployee;
    }
}