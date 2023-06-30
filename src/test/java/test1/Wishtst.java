package test1;

import org.testng.annotations.Test;

import page1.Wishlstpg;


public class Wishtst extends Baseclstst{

	@Test
	public void testwish() throws InterruptedException {
		BaseLogintst ob=new BaseLogintst(driver);
		ob.testlogin();
		Wishlstpg obj=new Wishlstpg(driver);
		obj.Activity();
	}
}
