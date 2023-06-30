package page1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Wishlstpg {

	WebDriver driver;
	By wishbtn=By.xpath("//*[@id=\"aspnetForm\"]/header/div[1]/div/div[3]/ul/li[2]/a");
	By inc=By.xpath("/html/body/form/div[10]/div/div/div/div/div/div[2]/div/div[3]/ul/li[1]/div/div[2]/div[1]/div/div/div/button[2]");
	By dec=By.xpath("/html/body/form/div[10]/div/div/div/div/div/div[2]/div/div[3]/ul/li[1]/div/div[2]/div[1]/div/div/div/button[1]");
	By addtocrt=By.xpath("//*[@id=\"ctl00_phBody_WishList_lvWishList_ctrl0_btnaddtocart\"]");
	By rem=By.xpath("//*[@id=\"ctl00_phBody_WishList_lvWishList_ctrl2_ImageButton1\"]");
	
	
	public Wishlstpg(WebDriver driver) {
		this.driver=driver;
	}


	public void Activity() {
		driver.findElement(wishbtn).click();
		driver.findElement(inc).click();
		driver.findElement(dec).click();
		driver.findElement(addtocrt).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(rem).click();
	}
}
