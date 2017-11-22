/**
 * 
 */
package demoMavenResource;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

import testResource.ResourceLoader;

/**
 * @author suman
 * @Description: XXXXXXX
 * @date 2017年11月21日
 */
public class TestResource {
	private static ResourceLoader resourceLoader;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
        resourceLoader = new ResourceLoader();
        
	}

	/**
	 * Test method for {@link testResource.ResourceLoader#loadProperties1()}.
	 * @throws IOException 
	 */
	@Test
	public void testLoadProperties1() throws IOException {
		Properties properties = resourceLoader.loadProperties1();
		String a1 = properties.getProperty("name");
		System.out.println("JUNIT："+a1);
		assertEquals("use dev resource", a1);
	}

}
