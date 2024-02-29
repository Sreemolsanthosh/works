package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandlingpgm {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
		String parentWindow=driver.getWindowHandle(); //for current window
		
		System.out.println("Parent window Title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allWindowHandles=driver.getWindowHandles();
		for(String handle : allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc12@gmail.com");
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
	}

}
