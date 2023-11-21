package homework_3;

public class Dog extends Animal
{
    @Override
    protected void run (int lengthOfBarrier)
    {
        if (lengthOfBarrier > 0 && lengthOfBarrier <= 500)
        {
            System.out.println("Dog is running " + lengthOfBarrier + " meters");
        }
        else
        {
            System.out.println("The dog cannot run more than 500 meters. Your value was " + lengthOfBarrier);
        }
    }

    @Override
    protected void swim (int lengthOfBarrier)
    {
        if (lengthOfBarrier > 0 && lengthOfBarrier <= 10)
        {
            System.out.println("Dog is swimming " + lengthOfBarrier + " meters");
        }
        else
        {
            System.out.println("The dog cannot swim more than 10 meters. Your value was " + lengthOfBarrier);
        }
    }
}
