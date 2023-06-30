package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Redbuspg;

public class Redbuscls {

	WebDriver driver;
	String baseurl="https://www.redbus.in/";
	@BeforeTest
	public void setUp()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver=new ChromeDriver(op);
		}
	@BeforeMethod
	public void urlLoad() {
		driver.get(baseurl);
	}
	@Test
	public void test1() {
		Redbuspg ob=new Redbuspg(driver);
		ob.fillData();
	}
	@AfterMethod
	public void aftmtd() {
		System.out.println("completed");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
