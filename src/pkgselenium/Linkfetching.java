package pkgselenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkfetching {
	
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void linkcount()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void linkfetching()
	{
	List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+linkdetails.size());
	for(WebElement e:linkdetails)
	{
		
		System.out.println(e.getText());                 //or String link=e.getAttribute("href");
		System.out.println(e.getAttribute("href"));        // String linktext=e.getText();
		                                                  //  System.out.println("link="+link)
		                                                  //  System.out.println("text="+linktext);
		
	}
	
	}		

}
