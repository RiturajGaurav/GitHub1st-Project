package gaurav;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartHomePage {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		driver.manage().timeouts( ).implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.flipkart.com");
		Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}

}
