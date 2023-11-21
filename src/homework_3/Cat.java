package homework_3;

public class Cat extends Animal
{
    @Override
    protected void run (int lengthOfBarrier)
    {
        if (lengthOfBarrier > 0 && lengthOfBarrier <= 200)
        {
            System.out.println("Cat is running " + lengthOfBarrier + " meters");
        }
        else
        {
            System.out.println("The cat cannot run more than 200 meters or less than 1. Your value was " + lengthOfBarrier);
        }
    }

    @Override
    protected void swim (int lengthOfBarrier)
    {
        System.out.println("Cat cannot swim");
    }
}
