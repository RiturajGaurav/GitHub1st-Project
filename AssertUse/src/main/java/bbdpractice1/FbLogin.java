package bbdpractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin
{	
	
	By userid = By.id("email");
	By passwd = By.id("pass");
	By loginbtn = By.name("login");
	
	public static ChromeDriver driver;
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	}
	
	public void OpenURL()
	{
		driver.get("https://www.facebook.com");
	}
	
	public void login(String uid, String pwd)
	{
		driver.findElement(userid).sendKeys(uid);
		driver.findElement(passwd).sendKeys(pwd);
		try{Thread.sleep(200);}catch(Exception e){}
		driver.findElement(loginbtn).click();
	}
	
	public void validatesuccessfullogin()
	{
		System.out.println("Validate the code login is sucessfull of not");
	}
	public void validateerrormessage()
	{
		System.out.println("should display error message");
	}
}
	