package page1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Homepg {

	WebDriver driver;
	By srchbox=By.xpath("//*[@id=\"inputbar\"]");
	By addtow=By.xpath("//*[@id=\"listSearchResult\"]/div[1]/div[4]/div[5]/input");
	
	public Homepg(WebDriver driver) {
		this.driver=driver;
	}

	public void searchbook() throws InterruptedException {
		driver.findElement(srchbox).sendKeys("wings of fire",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(addtow).click();
		Thread.sleep(3000);
		String exp="https://www.bookswagon.com/login";
		String act=driver.getCurrentUrl();
		Assert.assertEquals(exp, act);
		System.out.println("pass");
	}
	
}
