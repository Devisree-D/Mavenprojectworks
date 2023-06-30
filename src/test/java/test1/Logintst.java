package test1;

import org.testng.annotations.Test;

import page1.Loginpg;

public class Logintst extends Baseclstst {

	@Test
	public void testlogin() throws InterruptedException {
		Loginpg ob=new Loginpg(driver);
		ob.login("8848068661", "Keep@25");;
	}
}
