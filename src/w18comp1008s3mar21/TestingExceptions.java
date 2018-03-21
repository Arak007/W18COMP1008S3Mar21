package w18comp1008s3mar21;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JWright
 */
public class TestingExceptions
{
    public static void main(String[] args) 
    {
        try
        {
            firstMethod();
        } catch (HomeworkException ex)
        {
            System.out.println(ex.getMessage());
        }
            secondMethod();
    }
    
    public static void firstMethod() throws HomeworkException
    {
        throw new HomeworkException();
    }
    
    public static void secondMethod() 
    {
        try{
            throw new HomeworkException("The dog ate my homework");
        }
        catch (HomeworkException e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            System.out.println("This will always run-even without an exception");
        }
    }
}
