package w18comp1008s3mar21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JWright
 */
public class FileReader
{
    public static void displayFile() throws FileNotFoundException
    {
        File fileToRead = new File("build.xml");
        Scanner fileScanner = new Scanner(fileToRead);
        
        while (fileScanner.hasNext())
        {
            System.out.println(fileScanner.nextLine());
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            displayFile();
        } catch (FileNotFoundException ex)
        {
            System.err.println(ex);
        }
    }
}

