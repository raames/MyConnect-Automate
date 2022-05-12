package DemoToDekho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoExample {
	
	WebDriver driver;
	String baseUrl = "https://creditpay.uat.myconnect.olivegroup.io/learner/login";
	
	@Test
	public void initialize() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Phanait\\Desktop\\ConnectedProject\\MyConnect-Automate\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		Thread.sleep(5000);
		driver.close();
	
		}

}
