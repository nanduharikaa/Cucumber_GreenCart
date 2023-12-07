package pageObject;

import org.openqa.selenium.By;

public class Green_Object {
	public static By Logo=By.className("redLogo");
	public static By AddToCart=By.className("product-action");
	public static By CartImg=By.className("cart-icon");
	public static By CartList=By.className("cart-item");
	public static By ProccedbyChecklist=By.className("action-block");
	public static By Placeorder=By.xpath("//button[text()='Place Order']");
	public static By CountrydropDown=By.xpath("//option[text()='India']");
	public static By SelectCheckbox=By.className("chkAgree");
	public static By ClickProceed=By.xpath("//button[text()=\"Proceed\"]");
	public static By SuccessMessae=By.className("wrapperTwo");
	public static By Searchbox=By.className("search-keyword");
	public static By SearchButton=By.className("search-button");
	public static By Item=By.className("product-name");
	public static By ItemText=By.className("product-name");
	public static By topDeals=By.xpath("//a[text()='Top Deals']");
	public static By topDealsSearchbox=By.id("search-field");
//	public static By top
	public static By textData=By.xpath("//td[text()='Tomato']");
	
	
}
