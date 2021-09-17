package MobileFramMavenTestNg.MobileFramMavenTestNg;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import resources.Utilities;

public class InvokationClass extends Utilities{

	public AndroidDriver<MobileElement> InvokeDevice() throws Exception{

		Properties readPropertiesFile = ReadPropertiesFile();
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

		if(readPropertiesFile.getProperty("DeviceType").equalsIgnoreCase("Emulator")) {
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, readPropertiesFile.getProperty("EmulatorName"));
			if(!readPropertiesFile.getProperty("AppPath").equalsIgnoreCase("")) {
				dc.setCapability(MobileCapabilityType.APP, readPropertiesFile.getProperty("AppPath"));
			}else {
				dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, readPropertiesFile.getProperty("AppActivity"));
				dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, readPropertiesFile.getProperty("AppPackage"));
			}
		}else {
			dc.setCapability(MobileCapabilityType.UDID,readPropertiesFile.getProperty("UDID"));
		}
		AndroidDriver<MobileElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		//driver.findElementByAndroidUIAutomator(null)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}


}
