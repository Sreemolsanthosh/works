package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createpgm;

public class Createpagetest {
	public static WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
			
	}
                                                                                                                                                                                                                                                                                                                                   
	@Test
	public void settingUp()
	{
		Createpgm ob=new Createpgm(driver);
		
		ob.textcontains();
		ob.getstartedClick();
		
		
		
	}
	

}
