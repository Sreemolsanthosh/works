package pkgselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//*[@id='nav-cart-count-container']")).click();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
	    driver.findElement(By.xpath("//span[@class='a-size-base a-color-base']")).click();
		
		
	}
	@After
	public void ends()
	{
		driver.quit();
	}
	
}
