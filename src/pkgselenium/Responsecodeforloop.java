package pkgselenium;                           //IMPORTANT

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodeforloop {
	
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setUp() {
		
	driver=new ChromeDriver();
	driver.get("https://www.google.com");

	}
	@Test
	public void test()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+linkdetails.size());
		for(WebElement ele:linkdetails)
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
		
	} //public void ayalum crct aanu
	private void verify(String link) {
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			                          //int code=con.getResponseCode();
		                             //	System.out.println(code); 
			                        //if(code==200) it is given like this with line 42 & 43
			if(con.getResponseCode()==200)
			{
				System.out.println("response code is 200---"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("response code is 404"+link);
			}
			else
			{
				System.out.println("other response code");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
 }
