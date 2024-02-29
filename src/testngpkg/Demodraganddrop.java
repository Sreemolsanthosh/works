package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demodraganddrop {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	}
	@Test
	public void test1()
	{
		Actions act=new Actions(driver);
		
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement target1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(source1, target1);
		act.perform();
		
		WebElement source2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement target2=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		act.dragAndDrop(source2, target2);
		act.perform();
		
	}
	
}
