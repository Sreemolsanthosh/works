package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrisationpgm {

	@Parameters({"v"})
	@Test
	public void main(String v)
	{
		System.out.println("value="+v);
	}
	
	
}
