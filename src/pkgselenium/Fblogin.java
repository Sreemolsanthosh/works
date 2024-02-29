package pkgselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	
	ChromeDriver driver=new ChromeDriver();

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("agf1@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hghg535");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	
    }
	@After
	public void tearDown()
	{
		driver.quit();
	}
}

//Question
/*hhh
hhhh*/