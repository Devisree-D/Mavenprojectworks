package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Vrlbuspg {
	WebDriver driver;
	By src=By.xpath("//*[@id=\"FromCity\"]");
	By des=By.xpath("//*[@id=\"ToCity\"]");
	By dat=By.xpath("//*[@id=\"txtFromDate\"]");
	By srch=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	
	public Vrlbuspg(WebDriver driver) {
		this.driver=driver;
	}
	public void setValues() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(src).sendKeys("Bangalore",Keys.ENTER);
		driver.findElement(des).sendKeys("Dandeli",Keys.ENTER);
		driver.findElement(dat).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE,"14-07-2023");
	}
	public void searchclick() {
		driver.findElement(srch).click();
	}
	
}
