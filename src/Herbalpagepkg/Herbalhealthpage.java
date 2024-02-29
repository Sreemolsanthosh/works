package Herbalpagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Herbalhealthpage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement health;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	WebElement sendenquieries;
	
	@FindBy(xpath="//*[@id=\"Enquiry\"]")
	WebElement enquiry;
	
	@FindBy(xpath="//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement sendbutton;
	
	public Herbalhealthpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void healthicon()
	{
		health.click();
	}
	public void sorting()
	{
		WebElement Default=driver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
		Select Defaultdetails=new Select(Default);
		Defaultdetails.selectByValue("A-Z alphabetical order");	
	}
	public void sendenquery()
	{
		sendenquieries.click();
	}
	public void enquiry(String values)
	{
		enquiry.sendKeys(values);
	}
	public void send()
	{
		sendbutton.click();
	}
}




























