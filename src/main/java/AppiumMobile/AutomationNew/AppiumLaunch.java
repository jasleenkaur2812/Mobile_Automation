package AppiumMobile.AutomationNew;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppiumLaunch {
	
	
	AppiumDriver Driver;

	@BeforeMethod
	public void appiumLaunch() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformVersion", "10.0.0");
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "mototola one");
		cap.setCapability("udid", "ZF6224FW3W");
		cap.setCapability("app", "C:\\Users\\hp\\Downloads\\HRAcuity_Prod_1.0.5(20).apk");
		cap.setCapability("adbExecTimeout", "60000");
		cap.setCapability("fullReset", "true");
		
		URL apppiumurl = new URL("http://127.0.0.1:4723/wd/hub");
		
/*	 Driver = new AndroidDriver(apppiumurl,cap);
	 Thread.sleep(3000);
	 Driver.findElement(By.id("com.hracuity.manageraccess:id/user_email_input")).sendKeys("pghosh1@chenoainc.net");
	 Thread.sleep(2000);
	 Driver.findElement(By.id("com.hracuity.manageraccess:id/user_password_input")).sendKeys("password#1");
	 Thread.sleep(2000);
	 Driver.findElement(By.id("com.hracuity.manageraccess:id/user_login_button")).click();
	 Thread.sleep(3000);
	 System.out.println("Application Launched");
	 Driver.findElement(By.id("com.hracuity.manageraccess:id/login_confirmation_dialog_agree_button")).click();
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
    Thread.sleep(4000);
		
		*/
		
		
	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		AppiumLaunch mob = new AppiumLaunch();
		mob.appiumLaunch();
	}

	
	
}
