package UserLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	
	WebDriver driver;
	String baseUrl = "https://creditpay.uat.myconnect.olivegroup.io/learner/login";
	
	@Test
	public void initialize() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\Compressed\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		Thread.sleep(5000);
	
		}
	
	public void exit(){
		driver.quit();
	}
	
	
}
