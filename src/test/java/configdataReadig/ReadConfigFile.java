package configdataReadig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfigFile 
{

	@Test
	public void readConfig() throws Throwable
	{
		
		File src=new File("./Configuration/config.properties");
		
		FileInputStream fis=new FileInputStream(src);
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		System.out.println("SIT url is "+pro.getProperty("url1"));
		
		System.out.println("Prod url is "+pro.getProperty("url2"));
		
		
	}
	
	
}
