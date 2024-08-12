import org.testng.annotations.Test;
import page.CheckoutPage;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HealeniumTest  {
	
	WebDriver driver =null;

    @Test
    public void testCheckoutWithAllFields() {
    	
    	System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//String aTitle = driver.getTitle();
	
    
        assertTrue(driver.getTitle().contains("Google"), "Google");
    }
}
