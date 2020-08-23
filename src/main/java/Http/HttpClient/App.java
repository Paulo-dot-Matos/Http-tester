package Http.HttpClient;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    
    
    {
        System.out.println( "Hello World!" );
        HttpRequest.getRequest("httpbin.org/");
    }
}
