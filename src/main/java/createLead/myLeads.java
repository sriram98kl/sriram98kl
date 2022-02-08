package createLead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.baseClass;

public class myLeads extends baseClass{
	
public myLeads(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	



	public creatLead clickonCreateLead(){
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		return new creatLead(driver);
		
		
		
	}

}
