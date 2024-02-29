package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooktestng {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
	}

	@Parameters({"email","pswrd"})
	@Test
	public void main(String email,String pswrd)
	{
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(pswrd);
		driver.findElement(By.name("login")).click();
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("browser quit");
	}
	
}
