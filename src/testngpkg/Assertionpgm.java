package testngpkg;    //HARD ASSERTION

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Assertionpgm {
	
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
        	 String actual=driver.getTitle();
        	 
        	 Assert.assertEquals(exp, actual);
        	 System.out.println("hello");
        	 
         }
	
	
}
