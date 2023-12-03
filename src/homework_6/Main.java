package homework_6;

import java.io.*;

public class Main
{
    static final String LOG_FILE_PATH = "src/homework_6/log.txt";

    public static void main(String[] args)
    {
        writeToLog("INFO: Starting JuniorCrudServiceApplication using Java 17.0.7");
        writeToLog("DEBUG: User admin created");

        readLog();

        displayLogMessagesByLevel("DEBUG");
    }

    public static void writeToLog(String message)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true)))
        {
            writer.write(message);
            writer.newLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    static void readLog()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE_PATH)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();

        }
    }

    static void displayLogMessagesByLevel(String logLevel)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE_PATH)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                if (line.startsWith(logLevel))
                {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
