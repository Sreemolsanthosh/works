package pkgselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textcomparison {

	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
    public void textComparison()
    {
		String buttontext=driver.findElement(By.xpath("//*[contains(@name,'btnchkavail')]")).getAttribute("value");
		if(buttontext.equals("Check availability"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
			
		}
		
    }

	
	
	
}
