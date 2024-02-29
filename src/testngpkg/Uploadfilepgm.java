package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Uploadfilepgm {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test1()
	{
	
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\NEW\\Pictures\\Screenshots\\Screenshot (41).png");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		String actualtitle=driver.getTitle();
		String exptitle="Submit File";
		if(exptitle.equals(actualtitle))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title not same");
		}
	}

}
