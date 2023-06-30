package page1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Bookdetailpg {

	WebDriver driver;
	By newarr=By.xpath("//*[@id=\"ctl00_linewrelease\"]/a");
	By lang=By.linkText("English");
	By pdthovr=By.xpath("/html/body/form/div[10]/div[1]/div[3]/div[2]/div[2]/div[2]/div");
	By sorting=By.xpath("//*[@id=\"ddlSort\"]/option[2]");
	By qkrw=By.cssSelector(".col-sm-20:nth-child(2) .quick-view");
    By clsbtn=By.cssSelector(".modal-content > .close");
//	By qkrw=By.xpath("/html/body/form/div[10]/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[2]/a");
//	By clsbtn=By.xpath("//*[@id=\"quickviewmodal\"]/div/div/button");
	By sltbok=By.xpath("//*[@id=\"listpromoproduct\"]/div[7]/div/a/img");
	By addwl=By.xpath("//*[@id=\"ctl00_phBody_ProductDetail_divaction\"]/input");
	
	
	
	 public Bookdetailpg(WebDriver driver)  {
		this.driver=driver;
	}

	public void searchbook() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(newarr).click();
		driver.findElement(lang).click();
		Thread.sleep(2000);
		List<WebElement> srt=driver.findElements(sorting);
		for(WebElement s:srt)
		{
			String st= s.getText();
			if(st.equalsIgnoreCase("Price - Low to High")) {
				s.click();
			}
		}
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(qkrw).click();
		driver.findElement(clsbtn).click();
		driver.findElement(sltbok).click();
		driver.findElement(addwl).click();

	
	}
}
