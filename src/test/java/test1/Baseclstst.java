package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclstst {

	WebDriver driver;
	String baseurl="https://www.bookswagon.com/";
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void loadUrl() {
		driver.get(baseurl);	}
	@AfterMethod
	public void afterMeth() {
		System.out.println("test done");
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
