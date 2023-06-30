package page1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Cartpg {

	WebDriver driver;
	By cartbtn=By.xpath("//*[@id=\"aspnetForm\"]/nav/div/div/div[2]/ul/li[1]/a/span");
	By inpqty=By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/div/div[3]/div[1]/div[3]/input[1]");
	By upval=By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/div/div[3]/div[1]/div[3]/input[2]");
	By updmsg=By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/table/tbody/tr/td[2]/span");
	By movtowl=By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/div/div[3]/div[1]/div[6]/div[1]/a");
	By remov=By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/div/div[3]/div[2]/div[6]/div[2]/a");
	By plordr=By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/table/tbody/tr/td[3]/input");
	


	public Cartpg(WebDriver driver) {
		this.driver=driver;
	}




	public void placeOrder() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(cartbtn).click();
		driver.switchTo().frame("cboxWrapper");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", inpqty);

		
		driver.findElement(inpqty).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
		driver.findElement(inpqty).sendKeys("4",Keys.ENTER);
		driver.findElement(upval);
		WebElement txt=driver.findElement(updmsg);
		if(txt.getText().equalsIgnoreCase("Order quantity successfully updated"))
		{			System.out.println("pass");
			}
			else
			{
			System.out.println("fail");
			}
		driver.findElement(movtowl).click();
		driver.findElement(remov).click();
		driver.findElement(plordr).click();
	}
}
