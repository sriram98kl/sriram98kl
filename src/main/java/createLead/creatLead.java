package createLead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.baseClass;


public class creatLead   extends baseClass{
	
	public creatLead(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	
	public creatLead enterFirstname(String firstname) {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		
		return this;
	}
	public creatLead enterLastname(String lastname) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		
		return this;	
	}
	public creatLead entercmpnyname(String cmpnyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpnyname);
	
		
		return this;
	}
	
	public viewLead clickonCreatelead() {
		
		driver.findElement(By.name("submitButton")).click();
		
		return new viewLead(driver);
	}
}
