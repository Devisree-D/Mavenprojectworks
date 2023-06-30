package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Expediapg {

	WebDriver driver;
	By flights=By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a");
	By org=By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div/div/div[1]/button");
	By orginp=By.xpath("//*[@id=\"location-field-leg1-origin\"]");
	By des=By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div/div/div[1]/button");
	By desinp=By.xpath("//*[@id=\"location-field-leg1-destination\"]");
	By trav=By.xpath("//*[@id=\"adaptive-menu\"]/button");
	By adult=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]/span");
	By child=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]/span");
	By chldinp=By.xpath("//*[@id=\"child-age-input-0-0\"]");
	By okbtn=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[3]/button");
	By eco=By.xpath("//*[@id=\"preferred-class-input-trigger\"]");
	By ecoslt=By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]/span");
	By datfrm1=By.xpath("//*[@id=\"d1-btn\"]");
	By mon1=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2");
	By dates1=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[3]/td[4]/button");
	By nxtarw1=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]");
	By done1=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button");
	By datfrm2=By.xpath("//*[@id=\"d2-btn\"]");
	By mon2=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/h2");
	By nxtarw2=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/button[2]");
	By done2=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/button");
	By dates2=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr[3]/td[4]/button");
	By submit=By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button");
	
	public Expediapg(WebDriver driver) {
		this.driver=driver;
	
	}

	public void setValues() {
		driver.manage().window().maximize();
		driver.findElement(flights).click();
		driver.findElement(org).click();
		driver.findElement(orginp).sendKeys("Brussels",Keys.ENTER);
		
		driver.findElement(des).click();
		driver.findElement(desinp).sendKeys("Newyork",Keys.ENTER);
		
		driver.findElement(trav).click();
		driver.findElement(adult).click();
		driver.findElement(child).click();
		WebElement age=driver.findElement(chldinp);
		Select ageinfo=new Select(age);
		ageinfo.selectByValue("3");
		
		driver.findElement(okbtn).click();
		
		driver.findElement(eco).click();
		driver.findElement(ecoslt).click();
		
		driver.findElement(datfrm1).click();
		while(true)
		{
			WebElement month=driver.findElement(mon1);
			String month1=month.getText();
			if(month1.equalsIgnoreCase("August 2023"))
			{
				break;
			}
			else
			{
				driver.findElement(nxtarw1).click();;
			}
		}
		
			List<WebElement> alldates1=driver.findElements(dates1);
			for(WebElement dateelement:alldates1)
			{
				String date=dateelement.getAttribute("data-day");
				if(date.equals("22"))
				{
					dateelement.click();
				}
			}
		driver.findElement(done1).click();
		
		
		driver.findElement(datfrm2).click();
		while(true)
		{
			WebElement mont=driver.findElement(mon2);
			String month2=mont.getText();
			if(month2.equalsIgnoreCase("October 2023"))
			{
				break;
			}
			else
			{
				driver.findElement(nxtarw2).click();;
			}
		}
			List<WebElement> alldates2=driver.findElements(dates2);
			for(WebElement dateele:alldates2)
			{
				String datee=dateele.getAttribute("data-day");
				if(datee.equals("29"))
				{
					dateele.click();
				}
			}
		driver.findElement(done2).click();
		
		driver.findElement(submit).click();
	}
}
