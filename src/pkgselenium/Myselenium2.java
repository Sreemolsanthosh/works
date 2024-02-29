package pkgselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myselenium2 {
	
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.netflix.com";
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
				
	}
  @Test
  public void test()
  {
	  driver.get("https://www.netflix.com");
	  driver.findElement(By.xpath("//div/select[@name='LanguageSelect']")).click();
	  driver.findElement(By.xpath("//div/select[@name='LanguageSelect']/option[2]")).click();
	  
  }
  @After
  public void finish()
  {
	  driver.quit();
  }
  
}



