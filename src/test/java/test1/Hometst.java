package test1;

import org.testng.annotations.Test;

import page1.Homepg;

public class Hometst extends Baseclstst{

	@Test
	public void testhome() throws InterruptedException {
		Homepg ob=new Homepg(driver);
		ob.searchbook();
	}

}
