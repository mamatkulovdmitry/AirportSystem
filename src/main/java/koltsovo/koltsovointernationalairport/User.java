package koltsovo.koltsovointernationalairport;

public class User
{
    private String firstName;
    private String lastName;
    private String gender;
    private String username;
    private String password;

    public User (String firstName, String lastName, String gender, String username, String password)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.username = username;
        this.password = password;
    }

    public User() {}

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}