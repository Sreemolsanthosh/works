package testngpkg;                         //USING SOFT ASSERTION

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Comparing2urlusingsoftpgm {

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
		
	 	if(actualurl.equals(expurl))
    	{
    		System.out.println("pass");
    	}
    	else
    	{
    		System.out.println("Fail");
    		
    	}
    	System.out.println("Hello");
		
	
	}	
}
