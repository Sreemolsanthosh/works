package pkgselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Myselenium1 {

	public static void main(String[] args) {
	
ChromeDriver driver =new ChromeDriver();
driver.get("https://www.instagram.com");
String actualtitle=driver.getTitle();
System.out.println("title is:"+actualtitle);
String exp="Instagram";
if(exp.equals(actualtitle))
{
	System.out.println("title is same");
	
}
else
{
	System.out.println("title is not same");
	
}
driver.quit();

	}

}
