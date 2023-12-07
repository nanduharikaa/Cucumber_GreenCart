package testBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestBase extends PageBase {
	public static void typeInTextBox(By locator, String data, String elementName) {
		try {
			if(driver.findElement(locator).isDisplayed()) {
			   driver.findElement(locator).clear();
			   driver.findElement(locator).sendKeys(data);
			}
			else {
				System.out.println("Unable to enter text into "+elementName);
			}
		}
			catch (Exception e) {
				System.out.println("Unable to identify text field ");
			}
	}
	public static String getText(By locator, String elementName) {
		String text="";
		try {
			if(driver.findElement(locator).isDisplayed()) {
				text =driver.findElement(locator).getText();				
				System.out.println("Text fetched from "+elementName);
			}
			else {
				System.out.println("Text not fetched from "+elementName);
			}
		}
		catch (Exception e) {
			System.out.println("Unable to fetch text from "+elementName);
		}
		return text;
	}
	public static WebElement clickonElement(By locator, String elementName) throws Exception {
		boolean bflag=false;
		try {
			if(driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).click();
				bflag=true;
				System.out.println("Clicked on "+elementName);
			}
			else {
				System.out.println("Unable to click on  "+elementName);
			}
		}catch(Exception e) {
			System.out.println("Unable to click on element "+elementName);
		}
		return null;
	}
	public static List windowHandles(int TabNumber,String elementName) throws Exception {
		try {
			Set<String> windowHandle=PageBase.driver.getWindowHandles();
			List<String> windowHandleList= new ArrayList<>(windowHandle);
			PageBase.driver.switchTo().window(windowHandleList.get(TabNumber));
			System.out.println("Using Window Handles");
		}catch(Exception e) {
			System.out.println("Unable to move given window"+elementName);
		}
		return null;
	}
	public static WebElement selectCountry(By locator,String country, String elementName) {
		try {
			if(driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).click();
				System.out.println("Clicked on "+elementName);
			}
			else {
				System.out.println("Unable to click on  "+elementName);
			}
		}catch(Exception e) {
			System.out.println("Unable to click on element "+elementName);
		}
		return null;
	}
}