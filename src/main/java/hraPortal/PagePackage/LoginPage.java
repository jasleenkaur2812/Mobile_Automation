package hraPortal.PagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import hraPortal.BasePackage.appiumLaunch;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends appiumLaunch
{
	
	public LoginPage(AndroidDriver<WebElement> driver) throws Throwable
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	AppiumDriver driver;
	
	@AndroidFindBy(id = "com.hracuity.manageraccess:id/user_email_input")  // For IOS devices, the annotation will change to IOSFindBy
	public WebElement loginUsername;
	
	@AndroidFindBy(id= "com.hracuity.manageraccess:id/user_password_input")
	public MobileElement loginPassword;
	
	@AndroidFindBy(id = "com.hracuity.manageraccess:id/user_login_button")
	public MobileElement loginButton;
	
	
	public void mainLogin() throws InterruptedException
	{
		
		//	driver = new AndroidDriver(apppiumurl,cap);
		loginUsername.sendKeys("pghosh1@chenoainc.net");
		 Thread.sleep(3000);
		 loginPassword.sendKeys("password#1");
		 Thread.sleep(2000);
		 loginButton.click();
		 Thread.sleep(3000);
		 System.out.println("Application Launched");
		/* Driver.findElement(By.id("com.hracuity.manageraccess:id/login_confirmation_dialog_agree_button")).click();
		 Thread.sleep(4000);
		 Driver.findElement(By.id("com.hracuity.manageraccess:id/fragment_all_cases_new_case_button")).click();
		 Thread.sleep(2000);
		 System.out.println("Clicked on Create Case Icon");
		 Driver.findElement(By.id("com.hracuity.manageraccess:id/fragment_create_case_employee")).click();
		 Thread.sleep(2000);
		 Driver.findElement(By.id("com.hracuity.manageraccess:id/search_src_text")).sendKeys("paramitaM1");
		Thread.sleep(3000);
		System.out.println("Employee name is selected");
	    Driver.findElement(By.id("com.hracuity.manageraccess:id/fragment_create_case_issue")).click();
		 Thread.sleep(3000);
	     Driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")).click();
	     Thread.sleep(4000);
	     System.out.println("Issue category is selected");
		 Driver.findElement(By.id("com.hracuity.manageraccess:id/fragment_create_case_action")).click();
		 Thread.sleep(3000);
		 Driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")).click();
		 Thread.sleep(3000);
		 System.out.println("Action is selected ");
		 Driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")).click();
	    Thread.sleep(3000);
	    System.out.println("Template is selected");
	    Driver.findElement(By.id("com.hracuity.manageraccess:id/toolbar_cases_module_send")).click();
	    Thread.sleep(2000);
	    
	    Driver.findElement(By.id("com.hracuity.manageraccess:id/dialog_case_module_confirmation_save_and_exit")).click();
	    Thread.sleep(4000);*/
	}
	
	

}
