package Herbalpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Herballogin {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/a")
	WebElement myaccount;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[1]/input")
	WebElement loginemail;
	
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement loginpassword;
	
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/button[1]")
	WebElement loginbutton;
	
    public Herballogin(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void test1()
    {
    	myaccount.click();
    	login.click();
    	
    }
    public void test2(String email,String pswd)
    {
        loginemail.sendKeys(email);
        loginpassword.sendKeys(pswd);
    }
    public void test3()
    {
    	loginbutton.click();
    }
}






























