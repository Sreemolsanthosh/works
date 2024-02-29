package pkgselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlehw {
	
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.google.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();   //for maximizing window 
	}
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("flowers",Keys.ENTER);  //keys.enter will solve the "element not interactable problem"
	//	driver.findElement(By.name("btnK")).click();
		
		
	}
	

}
