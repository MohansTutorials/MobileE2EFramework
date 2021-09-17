package stepDefinitions;

import org.openqa.selenium.WebDriver;

import MobileFramMavenTestNg.MobileFramMavenTestNg.InvokationClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import resources.Utilities;

public class StepDefs extends Utilities{
	public static AndroidDriver<MobileElement> driver;
	
	@Given("Emulator is Launched")
	public void emulator_is_launched() throws Exception {
		StartEmulator();
	}

	@Given("Appium Server is started")
	public void appium_server_is_started() throws Exception {
		AppiumDriverLocalService AppiumServerInstanceObj = startServer();
	}

	
	@Given("Lori App is Launched")
	public void lori_app_is_launched() throws Exception {
		InvokationClass InvocationClassobj=new InvokationClass();
		driver= InvocationClassobj.InvokeDevice();
		Thread.sleep(2000);
	}

	@When("Clicked on the get Started button")
	public void clicked_on_the_get_started_button() {
		
		HomePage HomePageObjects=new HomePage(driver);
		HomePageObjects.getCoveredButton.click();
	    
	}

	@Then("User should see the help support window")
	public void user_should_see_the_help_support_window() {
	   
	}

	public WebDriver getDriver() {
		return driver;
	}

}
