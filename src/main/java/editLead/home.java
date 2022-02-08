package editLead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.baseClass;

public class home extends baseClass{
	
public home(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	public home verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertEquals(displayed,"CRM/SFA");
		return this;
	}
	
	public myHome clickcrmsfa() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new myHome(driver);
	}

}
