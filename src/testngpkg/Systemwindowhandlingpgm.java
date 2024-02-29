package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//system window handling while file uploading - interview ques
public class Systemwindowhandlingpgm {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
		
	}

	@Test
	public void fileUploadingpgm() throws Exception
	{
		//driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		//driver.get("https://demo.guru99.com/test/upload/");
		driver.get("https://smallpdf.com/pdf-to-excel");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div/label/div/div[2]/form/label/div/div[2]/button[1]/span")).click();  //button click
		
		fileUpload("‪‪‪‪‪F:\\programs.pdf");  //creating an object for uploading file
		//‪‪‪‪‪F:\\programs.pdf
	}

	private void fileUpload(String p) throws AWTException, Exception {
		StringSelection strSelection =new StringSelection(p);  //storing file uploading to p
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);  //copying to clip board
		
		Robot robot=new Robot();      //40-48 pasting the copied item
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.delay(2000);
			
	}
}
