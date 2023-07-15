package gaurav;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_ddt_dp 
{
	ChromeDriver driver;
	
	@DataProvider(name="dp1")
	public String[] testdata()
	{
		return new String[] {"Java","Selenium","TestNG","Python"};
	}
	@BeforeClass
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	@Test(priority=1)
	public void OpenUrl()
	{
		driver.get("https://www.google.com");
	}
	@Test(priority=2, dataProvider="dp1")
	public void search(String str) 
	{
		driver.findElement(By.name("q")).sendKeys(str);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		try
		{
			Thread.sleep(200);
			String res =driver.findElement(By.id("result-starts")).getText();
			System.out.println(res);
		}
		catch(Exception e) {System.out.println("No Result");}
		driver.navigate().back();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
