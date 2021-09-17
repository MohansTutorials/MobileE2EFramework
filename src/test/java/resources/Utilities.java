package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Utilities {
	
	AppiumDriverLocalService AppiumService;
	public Properties ReadPropertiesFile() throws Exception {
		
		FileInputStream fileInputStreamobj = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\global.properties");
		Properties PObj=new Properties();
		PObj.load(fileInputStreamobj);
		return PObj;
		
	}
	
	public AppiumDriverLocalService startServer() throws Exception {
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		if(!isLocalPortInUse(4723)) {
		AppiumService = AppiumDriverLocalService.buildDefaultService();
		AppiumService.start();
		}
		return AppiumService;
	}
	
	public void StartEmulator() throws Exception {
		Runtime.getRuntime().exec("taskkill /F /IM qemu-system-x86_64.exe");
		Runtime.getRuntime().exec("D:\\SesiaInfotechWorkSpace\\MobileFramMavenTestNg\\LaunchEmulator.bat");
		Thread.sleep(120000);
	}
	
	
	public boolean isLocalPortInUse(int port) {
	    try {
	        // ServerSocket try to open a LOCAL port
	        new ServerSocket(port).close();
	        // local port can be opened, it's available
	        return false;
	    } catch(IOException e) {
	        // local port cannot be opened, it's in use
	        return true;
	    }
	}
	

}
