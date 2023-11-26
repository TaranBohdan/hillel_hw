package homework_4.findSymbolOccuranceTask;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("findSymbolOccurance: ");
        System.out.println(findSymbolOccurance("Test", 't'));
    }
    public static int findSymbolOccurance(String str, char symbol)
    {
        int count = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == symbol) count++;
        }

        return count;
    }
}
