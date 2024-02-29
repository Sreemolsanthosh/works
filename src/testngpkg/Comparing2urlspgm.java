package testngpkg;      // using hard assertion

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Comparing2urlspgm {

	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void setUp()
	
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void urlVerification()
	{
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
    	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
    	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    	String actualurl=driver.getCurrentUrl();
    	String expurl="https://practicetestautomation.com/logged-in-successfully/";
    	
    	Assert.assertEquals(expurl, actualurl);
    	System.out.println("hello");
    	
    	
	}
}
