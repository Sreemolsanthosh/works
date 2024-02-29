package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demogurucw {
	
ChromeDriver driver;

@BeforeTest
public void setUp()
{
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
}

@Test
public void test() throws InterruptedException
{
	Actions act=new Actions(driver);
	WebElement rightclickme=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	act.contextClick(rightclickme);
	act.perform();
	
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();  //edit click
    
	
	Alert a=driver.switchTo().alert();  //converting to alert
	String alerttext=a.getText();
	a.accept();
	System.out.println("alert text is="+alerttext);
	
	WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(doubleclick);
	act.perform();
	
	Alert text=driver.switchTo().alert();  
	String text1=text.getText();
    text.accept();
	System.out.println("alert text shown is="+text1);
		
}


}
