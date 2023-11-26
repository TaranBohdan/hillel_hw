package homework_4.findWordPositionTask;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("findWordPosition: ");
        System.out.println(findWordPosition("Apple", "le"));
    }

    public static int findWordPosition(String source, String target)
    {
        source = source.toLowerCase();
        target = target.toLowerCase();

        if (!source.contains(target)) return -1;

        return source.indexOf(target);
    }
}
