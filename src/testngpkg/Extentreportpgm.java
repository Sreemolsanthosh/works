package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Extentreportpgm {
    
	   WebDriver driver;
	   String baseurl="https://www.facebook.com";
	   ExtentHtmlReporter reporter;
	   ExtentTest test;
	   ExtentReports extent;
	   
	   @BeforeTest
	   public void beftest()
	   {
		   reporter=new ExtentHtmlReporter("./reports/myreports1.html");
		   reporter.config().setDocumentTitle("Automationreport");
		   reporter.config().setReportName("functional test");
		   reporter.config().setTheme(Theme.DARK);
		   
		   extent=new ExtentReports();
		   extent.attachReporter(reporter);
		   extent.setSystemInfo("hostname", "localhost");
		   extent.setSystemInfo("os", "windows10");
		   extent.setSystemInfo("testername", "ammu");
		   extent.setSystemInfo("Browser Name", "chrome");
		   
		   driver=new ChromeDriver();
		      
	   }
	   @Test
	   public void fbtitleverification()
	   {
		   
		   test=extent.createTest("Fbtitleverification");
		   String Exp="facebook";
		   String actual=driver.getTitle();
		   Assert.assertEquals(Exp, actual);
		   System.out.println("hello");
		   
	   }
	   
	   @Test
	   public void fblogotest() throws IOException
	   {
		   test=extent.createTest("Fblogotest");
		   boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img")).isDisplayed();
		   Assert.assertTrue(b);
		   
	   }
	   
	   @AfterTest
	   public void teardown()
	   {
		 extent.flush();  
	   }
	   
	   @AfterMethod
	   public void browserclose(ITestResult result) throws IOException
	   {
		   if(result.getStatus()==ITestResult.FAILURE)
		   {
			   test.log(Status.FAIL, "test case failed is"+result.getName());
			   test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			  // String screenshotpath=screenshotMethod(driver,result.getName());
			  // test.addScreenCaptureFromPath(screenshotpath);
			   
		   }
	   }
	//public static String screenshotMethod(WebDriver driver, String screenshotname)  {
		// TODO Auto-generated method stub
		//return null;
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	

