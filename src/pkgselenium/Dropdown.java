package pkgselenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test()
	{
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("19");
		
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("MAR");
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("1997");	
		
		
	}

}
