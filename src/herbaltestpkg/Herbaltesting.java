package herbaltestpkg;

import org.testng.annotations.Test;

import Herbalpagepkg.Herballogin;

public class Herbaltesting extends Herbalbaseclass{
	
	@Test
	public void testing()
	{
		Herballogin hl=new Herballogin(driver);
		hl.test1();
		hl.test2("ammu@gmail.com", "ammu123");
		hl.test3();
	}

}
