package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerpgm {
	
            WebDriver driver;
            
            @BeforeTest
            public void setup()
            {
            	driver=new ChromeDriver();
            	driver.get("https://www.trivago.com");
            }
            @Test
            public void datepickertest()
            {
            	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[1]/fieldset/button[1]/span/span[2]/span[2]")).click();
            	datepickermethod("January 2024", "24");       //creating a parameter to call
            }
			public void datepickermethod(String expmonth, String expdate) {

				while(true)
				{
					
					String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();  //december xpath
					if(month.equals(expmonth))
					{
						break;
					}
					else
					{
						driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();  //arrow xpath
					}
				}
				List<WebElement>alldates=(List<WebElement>) driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));         //24,25xpath but we shouldf remove date given in button bracket i.e button[25] here 25 should be removed
				for (WebElement dateelement:alldates)
				{
					String date=dateelement.getText();
					if(date.equals(expdate))
					{
						dateelement.click();
						break;
					}
				}	
			}
			/*@AfterTest
			public void tearDown()
			{
				driver.quit();
			}*/
}
			
			
			
