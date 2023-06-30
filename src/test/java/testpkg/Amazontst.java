package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Amazonpg;

public class Amazontst {
WebDriver driver;
String baseurl="https://www.amazon.in";
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	}
@BeforeMethod
public void urlLoad() {
	driver.get(baseurl);
}
@Test
public void test1() {
	Amazonpg ob=new Amazonpg(driver);
	ob.homePage();
	ob.orderPage();
}
@AfterMethod
public void aftmtd() {
	System.out.println("completed");
}

@AfterClass
public void tearDown() {
	System.out.println("pass");
}
}
