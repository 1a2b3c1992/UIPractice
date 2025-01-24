package UtilityLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static String getProperty(String KeyName) throws IOException
	{
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"src\\main\\java\\ConfigurationLayer\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String value = prop.getProperty(KeyName);
		return value;
	}
}
