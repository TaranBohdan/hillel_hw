package homework_4.stringReverseTask;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("stringReverse: ");
        System.out.println(stringReverse("Apple"));
    }

    public static StringBuilder stringReverse(String str)
    {
        return new StringBuilder(str).reverse();
    }
}
