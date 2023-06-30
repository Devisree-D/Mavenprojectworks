package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Redbuspg {

	WebDriver driver;
	By buses=By.xpath("//*[@id=\"bus_tickets_vertical\"]/span");
	By frmplace=By.xpath("//*[@id=\"src\"]");
	By toplace=By.xpath("//*[@id=\"dest\"]");
	By date=By.xpath("//*[@id=\"onwardCal\"]");
	By srch=By.xpath("//*[@id=\"search_button\"]");
	By acbtn=By.xpath("//*[@id=\"account_dd\"]/div[1]");
	By loginlink=By.xpath("//*[@id=\"user_sign_in_sign_up\"]/span");
	
	public Redbuspg(WebDriver driver) {
		this.driver=driver;
	}

	public void fillData() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(buses).click();
		driver.findElement(frmplace).sendKeys("palakkad");
		driver.findElement(toplace).sendKeys("kochi");
		driver.findElement(date).sendKeys("30-06-2023");
		driver.findElement(srch).click();
		driver.findElement(acbtn).click();
		driver.findElement(loginlink).click();
	}
	
}
