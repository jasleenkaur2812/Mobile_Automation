package hraPortal.BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class appiumLaunch {

	public AppiumDriver driver;
	public Properties prop;
	static AppiumDriverLocalService services;
	
	/*public appiumLaunch()throws Throwable
	{
	
	Properties prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\hp\\workspace\\AutomationNew\\src\\main\\java\\hraPortal\\ConfigPackage\\config.properties");
	prop.load(file);
	}*/
	
	
	
	
	public void appiumServerstart()
	{
		  String NodePath ="C:/Program Files/nodejs/node.exe";
		  String AppiumMainjsPath ="C:/Program Files/Appium/resources/app/node_modules/appium/build/lib/main.js";
		 // AppiumDriverLocalService services ;
		  SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		  AppiumDriverLocalService  services = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
		    .usingDriverExecutable(new File(NodePath))
		    .withAppiumJS(new File (AppiumMainjsPath))
		   .withIPAddress("127.0.0.1")
		    .usingPort(4723));
		 services.start();
	}
	
	
	
	public void appiumLaunchCap() throws IOException
	{
		
	Properties prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\hp\\workspace\\AutomationNew\\src\\main\\java\\hraPortal\\ConfigPackage\\config.properties");
    prop.load(file);

	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("platformVersion", prop.getProperty("platformVersion"));
	cap.setCapability("platformName",prop.getProperty("platformName"));
	cap.setCapability("deviceName",prop.getProperty("deviceName"));
	cap.setCapability("udid",prop.getProperty("udid"));
	cap.setCapability("app",prop.getProperty("app"));
	cap.setCapability("adbExecTimeout",prop.getProperty("adbExecTimeout"));
	cap.setCapability("fullReset",prop.getProperty("fullReset"));
	
	URL apppiumurl = new URL("http://127.0.0.1:4723/wd/hub");
	
    driver = new AndroidDriver(apppiumurl,cap);
}
	
	
	public  static void  appiumserverstop()
	 { 
	 if (services.isRunning()==true )
	       {
	         services.stop();
	         System.out.println("running servers are shut down");
	 }
 }
	
	
/*	
	
	public static void main(String[] args) throws Throwable
	{
		
		appiumLaunch launch = new appiumLaunch();
		launch.appiumServerstart();
		launch.appiumLaunchCap();
	}*/
}
