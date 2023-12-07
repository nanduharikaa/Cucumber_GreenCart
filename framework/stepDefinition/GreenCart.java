package stepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Green_Object;
import testBase.PageBase;
import testBase.TestBase;
import utilities.Utils;

public class GreenCart {
	@Given("Browser is open")
	public void browser_is_open() throws Throwable {
		PageBase.openBrowser("Browser");
		String url=Utils.getFileProperty("URL");
		PageBase.driver.get(url);
		Thread.sleep(2000);
	    
	}

	@Given("Navigated to Home page")
	public void navigated_to_Home_page() throws Throwable {
		String s=TestBase.getText(Green_Object.Logo, "Green Cart");
	    System.out.println(s);
	    Thread.sleep(2000);

	}

	@When("Click on add to cart button")
	public void click_on_add_to_cart_button() throws Throwable {
		TestBase.clickonElement(Green_Object.AddToCart, "AddtoCart");
		Thread.sleep(2000);

	}

	@Then("Click on cart button")
	public void click_on_cart_button() throws Throwable {
		TestBase.clickonElement(Green_Object.CartImg, "Img");
	}

	@Then("verify the added item")
	public void verify_the_added_item() {
		String s1=TestBase.getText(Green_Object.CartList, "list");
		System.out.println(s1); 
	}

	@When("click on proceed checklit")
	public void click_on_proceed_checklit() throws Throwable {
		TestBase.clickonElement(Green_Object.ProccedbyChecklist, "Proceed by checklist");

	}

	@When("Navigated to place order")
	public void navigated_to_place_order() {
	   String s3 = TestBase.getText(Green_Object.Placeorder, "Placeoder");
	  System.out.println("s3");
	  
	}

	@Then("click on place order")
	public void click_on_place_order() throws Throwable {
		TestBase.clickonElement(Green_Object.Placeorder, "Click place order");
		
	}

	@When("select the country from drop down")
	public void select_the_country_from_drop_down() throws Throwable {
	   TestBase.selectCountry(Green_Object.CountrydropDown, "select country", "country");
	   Thread.sleep(2000);
	}

	@When("click on agree check box")
	public void click_on_agree_check_box() throws Throwable {
		TestBase.clickonElement(Green_Object.SelectCheckbox, "checkbox");
	   
	}

	@Then("click on proceed")
	public void click_on_proceed() throws Throwable {
		TestBase.clickonElement(Green_Object.ClickProceed, "proceed");
		String a=TestBase.getText(Green_Object.SuccessMessae, "success message");
		System.out.println(a);
		
		
	   
	}



}
