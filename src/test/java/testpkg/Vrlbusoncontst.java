package testpkg;

import org.testng.annotations.Test;

import page.Vrlbusonconpg;

public class Vrlbusoncontst extends BaseVrlpgmcls{



	@Test
	public void test1() throws InterruptedException {
		Vrlbusonconpg bs=new Vrlbusonconpg(driver);
		bs.setValues();
	}
}
