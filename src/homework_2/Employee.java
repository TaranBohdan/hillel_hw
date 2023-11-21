package homework_2;

public class Employee
{
    private String firstName;
    private String lastName;
    private String patronymic;
    private String jobRole;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee(String firstName, String lastName, String patronymic, String jobRole, String email, String phoneNumber, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.jobRole = jobRole;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

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

    public String getPatronymic()
    {
        return patronymic;
    }

    public void setPatronymic(String patronymic)
    {
        this.patronymic = patronymic;
    }

    public String getJobRole()
    {
        return jobRole;
    }

    public void setJobRole(String jobRole)
    {
        this.jobRole = jobRole;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
