package homework_4.theGameTask;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" ,
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        boolean isGuessed = false;

        String magicWord = words[rnd.nextInt(words.length)];
        int wordSize = magicWord.length();

        char[] guessedLetters = new char[wordSize];
        for (int i = 0; i < wordSize; i++) {
            guessedLetters[i] = '#';
        }

        while (!isGuessed)
        {
            System.out.println("\nProgress: " + new String(guessedLetters) + "##########");
            System.out.print("Enter word: ");
            String usersWord = scanner.nextLine();

            if (usersWord.equals(magicWord))
            {
                System.out.println("\nYou guessed! The word was " + magicWord);
                scanner.close();
                isGuessed = true;
            }
            else
            {
                for (int i = 0; i < wordSize; i++) {
                    if (i < usersWord.length() && usersWord.charAt(i) == magicWord.charAt(i)) {
                        guessedLetters[i] = magicWord.charAt(i);
                    }
                }
            }
        }
    }
}
