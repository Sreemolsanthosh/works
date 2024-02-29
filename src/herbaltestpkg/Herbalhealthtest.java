package herbaltestpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Herbalpagepkg.Herbalhealthpage;

public class Herbalhealthtest extends Herbalbaseclass {
	
	@Test
	public void tests()
	{
		Herbalhealthpage hh=new Herbalhealthpage(driver);
		hh.healthicon();
		hh.sorting();
		hh.sendenquery();
		hh.enquiry("product");
		hh.send();
	}

}
