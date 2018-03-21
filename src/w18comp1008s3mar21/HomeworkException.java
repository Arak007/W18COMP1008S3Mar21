package w18comp1008s3mar21;

/**
 *
 * @author JWright
 */
public class HomeworkException extends Exception
{
    //no argument constructor
    public HomeworkException()
    {
        super("Jaret please give more homework to keep us happy");
    }
    
    //constructor with a message
    public HomeworkException(String message)
    {
        super(message);
    }
    
    //constructor used for chaining exceptions
    public HomeworkException(Throwable throwable)
    {
        super(throwable);
    }
    
    //constructor with a message and chaining exceptions
    public HomeworkException(String message, Throwable throwable)    
    {
        super(message, throwable);
    }
    
    
    
    
    
}
