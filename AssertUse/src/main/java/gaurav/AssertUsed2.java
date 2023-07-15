package gaurav;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertUsed2 {

	public static void main(String[] args) throws Exception
	{
		SoftAssert softassert = new SoftAssert();
		ChromeDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Java");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(200);
		softassert.assertEquals(driver.getTitle(), "Java - GoogleSearch");
		String str = driver.findElement(By.id("result-stats")).getText();
		System.out.println(str);
		softassert.assertAll();
	}

}
