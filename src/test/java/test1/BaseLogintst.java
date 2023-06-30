package test1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page1.Loginpg;

public class BaseLogintst extends Baseclstst{

	public BaseLogintst(WebDriver driver) {
		this.driver=driver;
	}

	@Test
	public void testlogin() throws InterruptedException {
		Loginpg ob=new Loginpg(driver);
		ob.login("8848068661", "Keep@25");;
	}
}
