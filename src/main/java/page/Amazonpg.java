package page;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazonpg {

	WebDriver driver;
	By electlink=By.xpath("//*[@id=\"nav-xshop\"]/a[8]");
	By mobilesrch=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	By sortdrop=By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[2]/div/div/form/span/span/span/span");
	By sort1=By.xpath("/html/body/div[4]/div/div/ul/li");
	By phone1=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
	By addtocart=By.xpath("//*[@id=\"add-to-cart-button\"]");
	By proceed=By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input");
	
	public Amazonpg(WebDriver driver) {
	this.driver=driver;
	}
	public void homePage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(electlink).click();
		driver.findElement(mobilesrch).sendKeys("Mobile phones",Keys.ENTER);
		driver.findElement(sortdrop).click();
		List<WebElement>sortdp=driver.findElements(sort1);
		String dwn="s-result-sort-select_3";
		for(WebElement dp:sortdp) {
			String drp=dp.getAttribute("aria-labelledby");
			if(drp.equals(dwn))
			{
				dp.click();
				System.out.println("sorted");
			}
			
		}
		
	}
	public void orderPage() {
		String pwndw=driver.getWindowHandle();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(phone1).click();
		Set<String>handles=driver.getWindowHandles();
		for(String handle:handles)
		{
			if(!handle.equals(pwndw)) {
				driver.switchTo().window(handle);
				driver.findElement(addtocart).click();
				driver.findElement(proceed).click();
			}
		}
		
	}

}
