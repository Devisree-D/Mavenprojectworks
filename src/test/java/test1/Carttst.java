package test1;

import org.testng.annotations.Test;

import page1.Cartpg;

public class Carttst extends Baseclstst{

	@Test
	public void testcart() throws Exception {
		BaseLogintst ob=new BaseLogintst(driver);
		ob.testlogin();
		Cartpg obj=new Cartpg(driver);
		obj.placeOrder();
	}
}

