package homework_4.isPalindromeTask;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("isPalindrome: ");
        System.out.println(isPalindrome("kolihilok"));
    }

    public static boolean isPalindrome(String str)
    {
        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++)
        {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }

        return true;
    }
}