package pkgselenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationpgm {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}

	@Test
	public void titleVerification()
	{
		String actualtitle="Automation Exercise-Signup/Login";
		String exp="Automation Exercise-Signup/Login";
		if(actualtitle.equals(exp))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}
		
	}
	@Test
	public void linkCount()
	{
	List<WebElement> linkdetails=driver.findElements(By.tagName("link"));
	System.out.println("No of links is:"+linkdetails.size());

	}
	
	@Test
	public void userSignup()
	{
     driver.findElement(By.xpath("//*[contains(@type,'text')]")).sendKeys("Sreemol");
     driver.findElement(By.xpath("//*[contains(@data-qa,'signup-email')]")).sendKeys("sreemolas1997@gmail.com");
     driver.findElement(By.xpath("//*[contains(@data-qa,'signup-button')]")).click();
     driver.findElement(By.xpath("//*[contains(@for,'id_gender2')]")).click();
     driver.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("sree123");
    
     WebElement day=driver.findElement(By.xpath("//*[contains(@name,'days')]"));
     Select daydetails=new Select(day);
     daydetails.selectByValue("19");
     
     WebElement month=driver.findElement(By.xpath("//*[contains(@name,'months')]"));
     Select monthdetails=new Select(month);
     monthdetails.selectByVisibleText("March");
     
     WebElement year=driver.findElement(By.xpath("//*[contains(@name,'years')]"));
     Select yeardetails=new Select(year);
     yeardetails.selectByValue("1997");
     
     driver.findElement(By.xpath("//*[contains(@name,'first_name')]")).sendKeys("sreemol");
     driver.findElement(By.xpath("//*[contains(@name,'last_name')]")).sendKeys("santhosh");
     driver.findElement(By.xpath("//*[contains(@name,'company')]")).sendKeys("abcd");
     driver.findElement(By.xpath("//*[contains(@name,'address1')]")).sendKeys("address");
     driver.findElement(By.xpath("//*[contains(@name,'address2')]")).sendKeys("address");
     

     WebElement country=driver.findElement(By.xpath("//*[contains(@name,'country')]"));
     Select countrydetails=new Select(country);
     countrydetails.selectByValue("India");
     
     driver.findElement(By.xpath("//*[contains(@name,'state')]")).sendKeys("kerala");
     driver.findElement(By.xpath("//*[contains(@name,'city')]")).sendKeys("ernakulam");
     driver.findElement(By.xpath("//*[contains(@name,'zipcode')]")).sendKeys("683544");
     driver.findElement(By.xpath("//*[contains(@id,'mobile_number')]")).sendKeys("123");
     driver.findElement(By.xpath("//*[contains(@data-qa,'create-account')]")).click();
       
   
	}
	
}



















