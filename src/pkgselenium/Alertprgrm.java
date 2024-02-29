package pkgselenium;
                                           //alert handling program
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm {
	
	ChromeDriver driver;
	
	
	@Before
	public void setUP()
	{
    driver=new ChromeDriver();
    driver.get("file:///C:/Users/NEW/Desktop/JAVA/seleniumalertbox.html");
    }
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();  //converting to alert
		String alerttext=a.getText();
		a.accept();
		System.out.println("alert text="+alerttext);
		//a.dismiss()-for cancel alert
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Sherlock");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Holmes");
		
	
	}
}