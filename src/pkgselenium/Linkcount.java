package pkgselenium;             //USING TAG NAME

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
	}
	@Test
	public void linkcounting() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+linkdetails.size());
		
		
	}

}
