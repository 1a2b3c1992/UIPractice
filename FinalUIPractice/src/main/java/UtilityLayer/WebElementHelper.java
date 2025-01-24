package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass {

	public static WebElement visibilityOf(WebElement we)
	{
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOf(we));
	}
	
	public static WebElement elementToBeClickable(WebElement we)
	{
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(we));
	}
	
	public static void click(WebElement we)
	{
		elementToBeClickable(we).click();
	}
	
	public static void SendKeys(WebElement we, String value)
	{
		visibilityOf(we).sendKeys(value);
	}
	
	public static void clear(WebElement we)
	{
		visibilityOf(we).clear();
	}
	
	public static String getText(WebElement we)
	{
		return visibilityOf(we).getText();
	}
	
	public static void cleartext(WebElement we)
	{
		visibilityOf(we).clear();
	}
	
	public static String getAtttribute(WebElement we, String value)
	{
		return visibilityOf(we).getAttribute(value);
	}
	
	public static void submit(WebElement we)
	{
		visibilityOf(we).submit();
	}
	
	public static boolean isSelected(WebElement we)
	{
		return visibilityOf(we).isSelected();
	}
	
	public static boolean isDisplayed(WebElement we)
	{
		return visibilityOf(we).isDisplayed();
	}
	
	public static boolean isEnabled(WebElement we)
	{
		return visibilityOf(we).isEnabled();
	}
	
}
