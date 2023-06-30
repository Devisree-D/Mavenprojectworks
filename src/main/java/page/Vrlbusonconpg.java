package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Vrlbusonconpg {

	WebDriver driver;
	By bocontract=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By contname =By.xpath("//*[@id=\"txtcontactPerson\"]");
	By emailid=By.xpath("//*[@id=\"txtEmail\"]");
	By mobno=By.xpath("//*[@id=\"txtMobileNo\"]");
	By category =By.xpath("//*[@id=\"TourCategory\"]");
	By frmcity=By.xpath("//*[@id=\"txtFromCity\"]");
	By tocity=By.xpath("//*[@id=\"txtToCity\"]");
	By Hr=By.xpath("//*[@id=\"txtPickupHour\"]");
	By min=By.xpath("//*[@id=\"txtPickMinute\"]");
	By shf=By.xpath("//*[@id=\"txtPickTimeRange\"]");
	By depdt=By.xpath("//*[@id=\"txtFromDate\"]");
	By arrdt=By.xpath("//*[@id=\"txtToDate\"]");
	By pickup=By.xpath("//*[@id=\"txtPickup\"]");
	By bustyp=By.xpath("//*[@id=\"BusType\"]");
	By pasngrs=By.xpath("//*[@id=\"txtnoOfPassenger\"]");
	By remarks=By.xpath("//*[@id=\"txtremarks\"]");
	By submitbtn=By.xpath("//*[@id=\"wrapper\"]/div/div/div[2]/div[3]/div[3]/input");

	

	public Vrlbusonconpg(WebDriver driver) {
		this.driver=driver;
	}



	public void setValues() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(bocontract).click();
		driver.findElement(contname).sendKeys("devisree",Keys.ENTER);
		driver.findElement(emailid).sendKeys("abc@gmail.com",Keys.ENTER);
		driver.findElement(mobno).sendKeys("1234567891",Keys.ENTER);
		driver.findElement(category).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE,"Pilgrim Tour",Keys.ENTER);
		driver.findElement(frmcity).sendKeys("Bangalore",Keys.ENTER);
		driver.findElement(tocity).sendKeys("Dandeli",Keys.ENTER);
		driver.findElement(Hr).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE,"08",Keys.ENTER);
		driver.findElement(min).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE,"30",Keys.ENTER);
		driver.findElement(shf).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE,"PM",Keys.ENTER);
		driver.findElement(depdt).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE,"30-06-2023");
		driver.findElement(arrdt).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE,"12-07-2023");
		driver.findElement(bustyp).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE,"A/C-SLEEPER(32) - 32 Seats",Keys.ENTER);
		driver.findElement(pickup).sendKeys("xyz stop",Keys.ENTER);
		driver.findElement(pasngrs).sendKeys("4",Keys.ENTER);
		driver.findElement(remarks).sendKeys("nil",Keys.ENTER);
		
	}
	
}
