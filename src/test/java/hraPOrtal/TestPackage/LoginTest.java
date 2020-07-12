package hraPOrtal.TestPackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import hraPortal.BasePackage.appiumLaunch;
import hraPortal.PagePackage.LoginPage;
import io.appium.java_client.android.AndroidDriver;

public class LoginTest extends appiumLaunch
{
  
	public LoginTest() throws Throwable 
	{
		super();
		
	}
	  
	@BeforeTest()
	public void appiumServerStart() throws IOException
	{
		appiumServerstart();
		appiumLaunchCap();
	}
	
	
	@Test()
	public void login() throws Throwable
	{
		LoginPage Page = new LoginPage((AndroidDriver<WebElement>)driver);
		Page.mainLogin();
	}
	
	@AfterTest()
	public void appiumStopServer()
	{
		appiumserverstop();
		
	}

}
