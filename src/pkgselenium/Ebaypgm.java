package pkgselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebaypgm {
	
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.ebay.com";
	 
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		
	}
		@Test
		public void test()
		{
			driver.get("https://www.ebay.com");
			String actualtitle=driver.getTitle();
			String exp="ebay.com";
			if(exp.equals(actualtitle))
			    {
				System.out.println("same");
				}
			else
			{
				System.out.println("not same");
			}
			
	
	String src=driver.getPageSource();
	if(src.contains("shop by category"))
	{
	System.out.println("it is present");
	}
	else
	{
		System.out.println("it is not present");
	}
	
			driver.findElement(By.xpath("//div/button[@id='gh-shop-a']")).click();
			driver.findElement(By.xpath("//table[@id='gh-sbc']/tbody/tr/td[1]/ul/li[4]/a")).click();   //	driver.findElement(By.xpath("//*[@_sp='m570.l45104']")).click();
			driver.findElement(By.xpath("//*[@class='b-visualnav__grid']/span/a/div[2]")).click();
			driver.findElement(By.xpath("//*[@class='gh-cart-icon']")).click();
			driver.findElement(By.xpath("//div[@class='actions multi-actions']/a[2]")).click();
			driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("books");	
		}
   @After
       public void finish()
       {
	   driver.quit();
	
        }
    }

































