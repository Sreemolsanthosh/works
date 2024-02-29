package pkgselenium;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/NEW/Desktop/JAVA/seleniumalertbox.html");
		
	}
	
	@Test
	public void test() throws Exception
	{
		//take screenshot of page
		//first we need to open an interface called TAKESSCREENSHOT
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("F://screenshot1.png"));
		
		//screenshot of webelement eg:display alert
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));  //storing which element should be screenshoted
		File s1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s1,new File("./Screenshot/displaybutton.png"));
			
	}
	
}
