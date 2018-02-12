package first_maven;
import org.slf4j.*;
/**
 * This is the sample class for maven test
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
		Logger logger=LoggerFactory.getLogger(App.class);
		logger.info("Hello World");
    }
}
