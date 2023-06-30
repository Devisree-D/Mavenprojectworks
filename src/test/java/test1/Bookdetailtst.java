package test1;

import org.testng.annotations.Test;

import page1.Bookdetailpg;

public class Bookdetailtst extends Baseclstst{
	
	@Test
	public void testbkdetail() throws Exception {
		Bookdetailpg ob=new Bookdetailpg(driver);
		ob.searchbook();
	}

}
