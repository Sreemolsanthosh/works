package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Uploadingbyautoitpgm {

	ChromeDriver driver;
		
		@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
			
			
		}
    @Test
    public void main() throws IOException, Exception
    {
    	driver.get("https://www.ilovepdf.com/word_to_pdf");
    	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
    	Thread.sleep(3000);
    	Runtime.getRuntime().exec("F:\\SOFTWARE TESTING\\Autoitselenium\\programfile12.exe");  //code using auto it
    	Thread.sleep(3000);
    
    }
		
}
