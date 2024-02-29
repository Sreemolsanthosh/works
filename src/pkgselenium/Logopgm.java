package pkgselenium;
                                               
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logopgm {
	
	ChromeDriver driver;
	
	@Before
	public void setU()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void logoDisplay()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@src='/register/pix/redifflogo1.gif']"));
		boolean l=logo.isDisplayed();
		if(l)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");

		}
	}

	@Test
	public void buttonTest()
	{
		WebElement button=driver.findElement(By.xpath("//*[contains(@name,'Register')]"));
		boolean e=button.isEnabled();
		if(e)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");

		}
	}
}



/*boolean logo=driver.findElement(By.xpath("//*[@src='/register/pix/redifflogo1.gif']")).isDisplayed(); //check whether logo is displayed
System.out.println("Logo is displayed:"+logo);
//another xpath= //*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img


boolean button=driver.findElement(By.xpath("//*[contains(@name,'Register')]")).isEnabled();  //check whether element is enabled
System.out.println("Button is enabled:"+button);*/
	