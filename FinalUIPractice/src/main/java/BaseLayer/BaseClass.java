package BaseLayer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import UtilityLayer.PropertiesClass;

public class BaseClass {

	public static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();
	
	
	public static void initialization() throws IOException
	{
		String browsername = PropertiesClass.getProperty("BROWSER_NAME");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			td.set(new ChromeDriver());
		}
		if(browsername.equalsIgnoreCase("Edge"))
		{
			td.set(new EdgeDriver());
		}
		if(browsername.equalsIgnoreCase("incognito"))
		{
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
		}
		else
		{
		System.out.println("Please provide valid browser name");	
		}
		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		
		getDriver().get(PropertiesClass.getProperty("SIT_URL"));

	}


	protected static WebDriver getDriver() 
	{
		return td.get();
	}
	
	public static void initialization(String browsername) throws Exception {

		if (browsername.equalsIgnoreCase("chrome")) {
			td.set(new ChromeDriver());
		} else if (browsername.equalsIgnoreCase("edge")) {
			td.set(new EdgeDriver());
		} else if (browsername.equalsIgnoreCase("incognito")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
		} else if (browsername.equalsIgnoreCase("headless")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
		} else {
			System.err.println("Please Enter valid browsername");
		}

		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();

		String url = PropertiesClass.getProperty("SIT_URL");

		getDriver().get(url);
	}
	
}
