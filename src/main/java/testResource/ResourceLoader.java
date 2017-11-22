package testResource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceLoader
{
    public static void main(String[] args) throws IOException
    {

        ResourceLoader resourceLoader = new ResourceLoader();
        resourceLoader.loadProperties1();

    }

    public Properties loadProperties1() throws IOException
    {
        InputStream input = null;
        input =  this.getClass().getResourceAsStream("/config.properties");//可以替换为下面的code
        return printProperties(input);
    }

    private Properties printProperties(InputStream input) throws IOException
    {
        Properties properties = new Properties();
        properties.load(input);
        System.out.println(properties.getProperty("name")+"  "+properties.getProperty("location"));
        return properties;
    }
}