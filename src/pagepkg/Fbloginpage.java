package pagepkg;                                   //IMPORTANT

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	
	WebDriver driver;
	
	By fbemail=By.id("email");     //10-12 = object repository
	By fbpswd=By.id("pass");
	By fbloginbutton=By.id("login");
	
	
	public Fbloginpage(WebDriver driver)  //15-17= constructor (i.e will have same as classname, wont have return type,no void)
	{
	   this.driver=driver;
	}
	
	public void setvalues(String email,String pswd)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpswd).sendKeys(pswd);
	}
	
	public void login()
	{
		driver.findElement(fbloginbutton).click();
	}

}
