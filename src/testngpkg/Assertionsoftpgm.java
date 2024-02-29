package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Assertionsoftpgm {
	

    ChromeDriver driver=new ChromeDriver();
    @BeforeTest
    public void setUp()
    {
   	 driver.get("https://www.google.com");
    }
     
    @Test
    public void main()
    {
    	String exp="google";
    	String actualtitle =driver.getTitle();
    	if(actualtitle.equals(exp))
    	{
    		System.out.println("pass");
    	}
    	else
    	{
    		System.out.println("Fail");
    		
    	}
    	System.out.println("Hello");
    	
    }

}
