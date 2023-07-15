package gaurav;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertUsed 
{
	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Java");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Java - Google Search"); // actual result equals to expected result.
	//	Assert.assertEquals(driver.getTitle(),"Java - GoogleSearch"); //  actual result is not equals to expected result.
		String str = driver.findElement(By.id("result-stats")).getText();
		System.out.println(str);
		
	}
}
/*Note: - In java we are using If condition.
		  In Selenium we are using the Assert Statement.
		  There are two types of Assert Statement: - 1) Hard Assert, 2) Soft Assert.
Hard Assert:- If the expected and actual result is same than the program will execute continue.
		      If the expected and actual result is not same than the program will stop at the point.
Soft Assert: -If the expected and actual result is same than the program will execute continue.
			  If the expected and actual result is not same than the program will execute continue.. 
*/