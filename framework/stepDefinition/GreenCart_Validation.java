package stepDefinition;

import io.cucumber.java.en.*;
import pageObject.Green_Object;
import testBase.PageBase;
import testBase.TestBase;
import utilities.Utils;

public class GreenCart_Validation {
	//public static String s6;
	@Given("user Open the browser")
	public void user_Open_the_browser() throws Throwable {
		PageBase.openBrowser("Browser");
		String url=Utils.getFileProperty("URL");
		PageBase.driver.get(url);
		Thread.sleep(2000);
	}

	@Given("user Navigates to Home page")
	public void user_Navigates_to_Home_page() throws Throwable {
		String s=TestBase.getText(Green_Object.Logo, "Green Cart");
	    System.out.println(s);
	    Thread.sleep(2000);
	}

	@Given("click on top deal")
	public void click_on_top_deal() throws Throwable {
		TestBase.clickonElement(Green_Object.topDeals, "topdeals"); 
	}
		@Then("New window handle")
		public void new_window_handle() throws Throwable {
		   TestBase.windowHandles(1, "s");
		}

	@Given("search the items {string}")
	public void search_the_items(String string) {
		TestBase.typeInTextBox(Green_Object.topDealsSearchbox, string, string);
	}


	@Then("validate the both item")
	public void validate_the_both_item() {
		String s6=TestBase.getText(Green_Object.textData, "text in table");
		System.out.println(s6);
		//String s7=TestBase.getText(GreenCartSearch.s5, "value");
		//System.out.println(GreenCartSearch.s5);
//	   if (GreenCartSearch.s5.equals(s6)) {
//		   System.out.println("both are equal");
//	   }
//	   else
//		   System.out.println("both are not equal");
//	  	}
	}}