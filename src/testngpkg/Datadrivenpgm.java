package testngpkg;        //Very Important.......main portion line 30-39

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenpgm {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void datadriven() throws IOException
	{
		driver.get("https://www.facebook.com");
		
		FileInputStream f=new FileInputStream("C:\\Users\\NEW\\Desktop\\Excelfilessss\\Book1data.xlsx");   //reading Excel sheet 
		XSSFWorkbook wb=new XSSFWorkbook(f);    //Object creation
		XSSFSheet s=wb.getSheet("Sheet1");     // getting sheet or returning sheet
		int rowcount=s.getLastRowNum();       //return or getting row
		
		for(int i=1;i<=rowcount;i++)     //iteration
		{
			String username=s.getRow(i).getCell(0).getStringCellValue();
			String password=s.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username+" "+"/n"+" "+"password="+password);
			
			//OR
			//System.out.println("username="+username);
			//System.out.println("password="+password);
			
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			//driver.navigate().refresh();
			//driver.navigate().back();
			
		}
	}

}
