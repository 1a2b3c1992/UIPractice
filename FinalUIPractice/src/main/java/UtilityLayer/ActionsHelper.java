package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionsHelper extends BaseClass {
	
	public static void clickActionClass(WebElement we)
	{
		new Actions(getDriver()).click(WebElementHelper.visibilityOf(we)).build().perform();
		
	}
	
	public static void sendKeyActionClass(WebElement we, String value)
	{
		new Actions(getDriver()).sendKeys(WebElementHelper.visibilityOf(we)).build().perform();
	}
	
	public static void rightClick(WebElement we)
	{
		new Actions(getDriver()).contextClick(WebElementHelper.visibilityOf(we)).build().perform();
	}
	
	public static void doubleClick(WebElement we)
	{
		new Actions(getDriver()).doubleClick(WebElementHelper.visibilityOf(we)).build().perform();
	}
	
	public static void mouseOverMovement(WebElement we)
	{
		new Actions(getDriver()).moveToElement(WebElementHelper.visibilityOf(we)).build().perform();
	}

	public static void scrollToElement(WebElement we)
	{
		new Actions(getDriver()).scrollToElement(WebElementHelper.visibilityOf(we)).build().perform();
	}
	
	public static void clickAndHold(WebElement we)
	{
		new Actions(getDriver()).clickAndHold(WebElementHelper.visibilityOf(we)).build().perform();
	}
	
	public static void release(WebElement we)
	{
		new Actions(getDriver()).release(WebElementHelper.visibilityOf(we)).build().perform();
	}
}
