package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Expediapg;

public class Expediatst {

	WebDriver driver;
	String baseurl="https://www.expedia.com";
	@BeforeClass
	public void setUp()
	{driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoad() {
		driver.get(baseurl);
	}
	@Test
	public void test1() {
		Expediapg ob=new Expediapg(driver);
		ob.setValues();
	}
	@AfterMethod
	public void aftmtd() {
		System.out.println("completed");
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
