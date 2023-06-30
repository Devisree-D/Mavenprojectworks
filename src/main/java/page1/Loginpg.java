package page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Loginpg {

	WebDriver driver;
	By myac=By.xpath("//*[@id=\"aspnetForm\"]/header/div[1]/div/div[3]/ul/li[1]/a");
	By loginbtn=By.xpath("//*[@id=\"ctl00_divLogin\"]/a[1]");
	By mobno=By.xpath("//*[@id=\"ctl00_phBody_SignIn_txtEmail\"]");
	By paswd=By.xpath("//*[@id=\"ctl00_phBody_SignIn_txtPassword\"]");
	By log=By.xpath("//*[@id=\"ctl00_phBody_SignIn_btnLogin\"]");
	By logname=By.xpath("//*[@id=\"ctl00_lblUser\"]");
	By logout=By.xpath("//*[@id=\"ctl00_lnkbtnLogout\"]");
	
	public Loginpg(WebDriver driver) {
		this.driver=driver;
	}
	public void login(String m,String p) {
		WebElement ac=driver.findElement(myac);
		Actions act = new Actions(driver);
		act.moveToElement(ac);
		act.perform();
		driver.findElement(loginbtn).click();
		driver.findElement(mobno).sendKeys(m);
		driver.findElement(paswd).sendKeys(p);
		driver.findElement(log).click();
//		WebElement user=driver.findElement(logname);
//		act.moveToElement(user);
//		act.perform();
//		driver.findElement(logout).click();
	}
	
}
