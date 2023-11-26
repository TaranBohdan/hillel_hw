package homework_5;

import homework_5.exceptions.ArrayDataException;
import homework_5.exceptions.ArraySizeException;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "jsrt"},
                {"weger", "6", "7", "8"},
                {"9", "aseg", "11", "12"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "a", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"13", "14", "15", "16"}
        };

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        try
        {
            System.out.println("Sum: " + calculator.doCalc(validArray));
        }
        catch (ArraySizeException | ArrayDataException e)
        {
            e.printStackTrace();
        }
    }
}
