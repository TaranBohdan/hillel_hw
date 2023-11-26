package homework_5;

import homework_5.exceptions.ArrayDataException;
import homework_5.exceptions.ArraySizeException;

public class ArrayValueCalculator
{
    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException
    {
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4)
        {
            throw new ArraySizeException("Your array is more as 4x4");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                try
                {
                    sum += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e)
                {
                    throw new ArrayDataException("Your data was invalid");
                }
            }
        }

        return sum;
    }
}
