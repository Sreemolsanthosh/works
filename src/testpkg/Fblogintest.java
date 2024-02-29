package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest  {
	
	public static WebDriver driver;
	@BeforeTest
	
    public void setUp()
    {
		driver=new ChromeDriver();
		driver.get("https://wwww.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
	@Test
	public void testLogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "xyzabc");
		ob.login();
		
	}
}
