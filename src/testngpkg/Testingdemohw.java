package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingdemohw {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://automationexercise.com/login");
	}
	
	@Test(priority = 1,invocationCount=2)
	public void titleVerification()
    	{
			String actualtitle="Automation Exercise-Signup/Login";
			String exp="Automation Exercise-Signup/Login";
			if(actualtitle.equals(exp))
			{
				System.out.println("Title is same");
			}
			else
			{
				System.out.println("Title is not same");
			}
		}
	@Test(priority = 3,enabled=false)
	public void signUp()
	{
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/button")).click();
		
	}
  
   @Test(priority = 2,dependsOnMethods="signUp")
   public void passingValues()
   {
	   driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[2]")).sendKeys("Sreemol");
	   driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]")).sendKeys("sreemolas1997@gmail.com");
	    
   }                //other xpath is given in automationpgm
   
   @AfterMethod
   public void aftermethd()
   {
	  System.out.println("after method details");
	  
   }
   
   @AfterTest
   public void tearDown()
   {
	   driver.quit();
   }
}











