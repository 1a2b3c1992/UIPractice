package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class FrameHelper extends BaseClass{
	public static void frame(int index)
	{
		new WebDriverWait(getDriver(),Duration.ofSeconds(30))
			.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}

	public static void frame(String idOrName)
	{
		new WebDriverWait (getDriver(), Duration.ofSeconds(30))
			.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public static void frame (WebElement we)
	{
		new WebDriverWait(getDriver(),Duration.ofSeconds(30))
			.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(we));
	}
	
	public static void defaultContent()
	{
		getDriver().switchTo().defaultContent();
	}
	
	public static void parentFrame()
	{
		getDriver().switchTo().parentFrame();
	}
}
