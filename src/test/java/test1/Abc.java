package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Abc {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	 @Test
	  public void untitled() {
	    driver.get("https://www.bookswagon.com/");
	    driver.manage().window().setSize(new Dimension(1058, 800));
	    driver.findElement(By.cssSelector(".iframe > .itemcount")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("BookCart_lvCart_ctrl0_txtQty")).click();
	    driver.findElement(By.id("BookCart_lvCart_ctrl0_txtQty")).sendKeys("4");
	    driver.findElement(By.id("BookCart_lvCart_ctrl0_imgUpdate")).click();
	    driver.findElement(By.id("BookCart_lvCart_ctrl0_btnMovetoWishlist")).click();
	    driver.findElement(By.cssSelector(".shopping-content:nth-child(2) .remove")).click();
	    driver.findElement(By.id("BookCart_lvCart_ctrl1_imgDelete")).click();
	    driver.findElement(By.id("BookCart_lvCart_imgPayment")).click();
	    driver.close();
	  }

}
