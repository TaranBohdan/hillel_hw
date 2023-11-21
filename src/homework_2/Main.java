package homework_2;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee = new Employee(
                "Bohdan",
                "Taran",
                "Yevhenovich",
                "Java Software Engineer",
                "bohdantaran.work@gmail.com",
                "0123456789",
                19);

        System.out.println(employee);
        System.out.println("-----------------------------------------------");

        Car car = new Car();
        car.start();
    }
}