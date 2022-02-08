package editLead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.baseClass;

public class editLead extends baseClass {
	
	public   editLead(ChromeDriver driver)
	{
		this.driver = driver;
		
	}
	
	public editLead  edit_cmpnyname()
	{
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("lays");
		
		return this;
		
	}
	
	public viewLead click_on_update()
	{
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		return new viewLead(driver);
		
		
	}

}
