package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createpgm {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbcreatepagelink;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	WebElement fbGetStartedButton;
	
	public Createpgm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//System.out.println(driver);
	}
	
	public void textcontains()
	{
		String exp="Create a Page";
		String actual = driver.getPageSource();
		if (actual.contains(exp))
		{
			System.out.println("text is present");
			
		}
		else
		{
			System.out.println("text is not present");
			
		}
	}
	
		public void getstartedClick()
		{
			fbGetStartedButton.click();
			
		}

}
