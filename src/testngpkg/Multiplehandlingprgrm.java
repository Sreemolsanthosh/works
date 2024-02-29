package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplehandlingprgrm {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();  //for maximizing window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);   
		String exp="Amazon.in : mobilephones";                    
		if(exp.equals(actualtitle))
		{
			System.out.println("title is same");
		}
		else
		{
		System.out.println("title not same");
	    }
		
        String parentWindow=driver.getWindowHandle(); 
		
		System.out.println("Parent window Title"+driver.getTitle());
		
		JavascriptExecutor js=(JavascriptExecutor) driver;     //47 & 48 for scrolling down
		js.executeScript("window.scrollBy(0,500)");
		
driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();

		Set<String>allWindowHandles=driver.getWindowHandles();
		
		for(String handle : allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
		
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				
	        	driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
	        	
	        	driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
	}
}


















