package UtilityLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class TakeScreenshot extends BaseClass{
	
	public static String capturScreenshot(String foldername, String tcname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)getDriver();
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir") + "//screenshot//" + DateAndTime.year() + "//"
				+ DateAndTime.monthYear() + "//" + DateAndTime.dateMonthYear() + "//" + foldername + "//"
				+ tcname + DateAndTime.getDateTime() + ".png";
		
		File dest = new File(path);
		
		FileUtils.copyFile(src, dest);
		
		return path;
		
		
	}

}
