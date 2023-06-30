package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpg;
import utilities.Excelutils;

@Test
public class Fblogintest {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fbtest()
	{
		Fbloginpg ob=new Fbloginpg(driver);
		String xl="C:\\Users\\DELL\\Desktop\\Luminar Software testing\\datadriventest.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(xl, Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String Username=Excelutils.getCellValue(xl, Sheet, i, 0);
			System.out.println("username "+Username);
			String Password=Excelutils.getCellValue(xl, Sheet, i, 1);
			System.out.println("password "+Password);
			ob.setvalues(Username, Password);
			ob.login();
			String expurl="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg3MTU2NDc4LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
			String acturl=driver.getCurrentUrl();
			if(acturl.equals(expurl))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}

	}
	@AfterMethod
	public void aftmtd() {
		System.out.println("completed");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("pass");
	}
}
