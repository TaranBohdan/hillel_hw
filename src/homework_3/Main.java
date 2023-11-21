package homework_3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int countOfDogs = 0;
        int countOfCats = 0;
        String command = "";

        System.out.println("Write one command: /dog, /cat or /exit");
        do
        {
            command = sc.nextLine();

            int lengthOfBarrierRun = 0;
            int lengthOfBarrierSwim = 0;

            switch (command)
            {
                case "/dog":
                    Animal dog = new Dog();
                    countOfDogs++;

                    System.out.println("Write how much meters dog must run");
                    lengthOfBarrierRun = sc.nextInt();
                    System.out.println("Write how much meters dog must swim");
                    lengthOfBarrierSwim = sc.nextInt();

                    System.out.println("-----------------------");
                    dog.run(lengthOfBarrierRun);
                    dog.swim(lengthOfBarrierSwim);
                    System.out.println("-----------------------");

                    System.out.println("Dog was created successfully ");
                    System.out.println("-----------------------");
                    System.out.println("Write one command: /dog, /cat or /exit");
                    break;

                case "/cat":
                    Animal cat = new Cat();
                    countOfCats++;

                    System.out.println("Write how much meters cat must run");
                    lengthOfBarrierRun = sc.nextInt();
                    System.out.println("Write how much meters cat must swim");
                    lengthOfBarrierSwim = sc.nextInt();

                    System.out.println("-----------------------");
                    cat.run(lengthOfBarrierRun);
                    cat.swim(lengthOfBarrierSwim);
                    System.out.println("-----------------------");

                    System.out.println("Cat was created successfully ");
                    System.out.println("-----------------------");
                    System.out.println("Write one command: /dog, /cat or /exit");
                    break;
            }
        } while (!command.equals("/exit"));

        System.out.println("Count of dogs = " + countOfDogs);
        System.out.println("Count of cats = " + countOfCats);
        System.out.println("Count of animals = " + (countOfCats + countOfDogs));
    }
}
