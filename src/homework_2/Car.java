package homework_2;

public class Car
{
    public void start()
    {
        startCommand();
        startElectricity();
        startFuelSystem();
    }

    private void startElectricity()
    {
        System.out.println("Electricity of car was started...");
    }

    private void startCommand()
    {
        System.out.println("Engine was started...");
    }

    private void startFuelSystem()
    {
        System.out.println("Fuel system of car was started...");
    }

}
