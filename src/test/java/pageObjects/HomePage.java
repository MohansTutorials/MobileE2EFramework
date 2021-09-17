package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	public HomePage(AndroidDriver<MobileElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidBy(xpath="//android.view.ViewGroup[@content-desc='get_covered_button']")
	public MobileElement getCoveredButton;
	
	
	
	
}
