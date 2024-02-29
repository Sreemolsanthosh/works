package pkgselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstseleniumscript {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();  //to launch browser we need to call by creating object
		
		driver.get("https://www.facebook.com");       //get method - to call/launch the application
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);   //to get title
		String exp="Facebook";                     //exp=expected
		if(exp.equals(actualtitle))
		{
			System.out.println("title is same");
		}
		else
		{
		System.out.println("not same");
		
		}
		driver.quit();            //to quit the entire browser
		                         //driver.close(); - to close particular tabs,if multiple tabs are open in the browser
		
	                        	//String s="Facebook";
		                       //System.out.println(actualtitle.equals(s));	//o/p is in true or false format ,but if else will give in words
		
	}

}
