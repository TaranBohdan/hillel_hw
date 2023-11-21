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
}
