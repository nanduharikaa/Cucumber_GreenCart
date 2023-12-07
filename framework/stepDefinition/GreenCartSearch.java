package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.Green_Object;
import testBase.PageBase;
import testBase.TestBase;
import utilities.Utils;

public class GreenCartSearch {
	public static String s5;
	@Given("Open the browser")
	public void open_the_browser() throws Throwable {
		PageBase.openBrowser("Browser");
		String url=Utils.getFileProperty("URL");
		PageBase.driver.get(url);
		Thread.sleep(2000);
	    
	}

	@Given("User Navigates to Home page")
	public void user_Navigates_to_Home_page() throws Throwable {
		String s=TestBase.getText(Green_Object.Logo, "Green Cart");
	    System.out.println(s);
	    Thread.sleep(2000);
	}

	@Given("click on search box")
	public void click_on_search_box() throws Throwable {
		TestBase.clickonElement(Green_Object.Searchbox, "searchbox");
	    
	}

	@Given("enter the item as {string} in search box")
	public void enter_the_item_as_in_search_box(String string) throws Throwable {
		TestBase.typeInTextBox(Green_Object.Searchbox, string, string);
		Thread.sleep(2000);
	}

	@Then("click on Serach button")
	public void click_on_Serach_button() throws Throwable {
		TestBase.clickonElement(Green_Object.SearchButton, "Searchbutton");
	}

	@Then("Print the item")
	public String print_the_item() {
		String s=TestBase.getText(Green_Object.ItemText, "tomato");
		System.out.println(s);
		s5=s.substring(0,5);
		System.out.println(s5);
		return s5;
	    
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
		System.out.println(GreenCartSearch.s5);
	   if (GreenCartSearch.s5.equals(s6)) {
		   System.out.println("both are equal");
	   }
	   else
		   System.out.println("both are not equal");
	  	}
	}


