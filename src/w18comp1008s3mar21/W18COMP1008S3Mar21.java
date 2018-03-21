package w18comp1008s3mar21;

/**
 *
 * @author JWright
 */
public class W18COMP1008S3Mar21
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        firstMethod();
        Thread.dumpStack();
    }
    
    public static void firstMethod(){
        secondMethod();
        Thread.dumpStack();
    }
    
    public static void secondMethod()
    {
        Thread.dumpStack();
    }
}
