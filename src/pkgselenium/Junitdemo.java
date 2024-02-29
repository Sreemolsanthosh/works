package pkgselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {                            //no need of static void
	ChromeDriver driver;
	
	@Before
	public void setUp()     //method name
	{
		driver=new ChromeDriver();
		 driver.get("https://www.google.com");         //the o/p will be in the alphabetic order of method name
		 
	}
	
	@Test
	public void titleVerification()        //method name
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	public void pagesource()    // to check contents in chrome page's UI
	{
		String src=driver.getPageSource();   //getpagesource is for getting pagecourse
		
		if(src.contains("Gmail"))       //contains is 'case' sensitive. so if 'gmail' is given instead of 'Gmail',the o/p will be : "not present" 
		{
			System.out.println("gmail present");
			
		}
		else
		{
			System.out.println("gmail not present");
		}
	}
	
	@After
	public void tearDown()                 //method name
	{
		driver.quit();
	}	

}
