package testpkg;


import org.testng.annotations.Test;

import page.Vrlbuspg;

public class Vrltest extends BaseVrlpgmcls {


@Test
public void setup() throws Exception
{
	Vrlbuspg ob=new Vrlbuspg(driver);
	ob.setValues();
	ob.searchclick();
	}
	

}
