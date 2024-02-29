package pkgselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Test
	public void fblogin()
	{
		//BY NAME AND ID
		
		driver.findElement(By.id("email")).sendKeys("agf1@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("hghg535");
		driver.findElement(By.name("login")).click();
	
	}

}

