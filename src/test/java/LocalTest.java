import static util.driver.DriverHolder.setDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class LocalTest  {
	
	WebDriver driver = null;
	
	  @BeforeMethod
	    public void before() {
			System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
			//System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");
			//WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			String aTitle = driver.getTitle();
		
			
			//compare the actual title with the expected title
			if(aTitle.equals("Google"));
			{
				System.out.println("Title Value :: "+aTitle);
			}
	    }
	  
	  
	  @AfterMethod
	    public void after() {
	        driver.quit();
	    }
}
