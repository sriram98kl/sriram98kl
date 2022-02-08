package editLead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.baseClass;

public class myLeads extends baseClass{
	
public myLeads(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	



	public findLeads clickonfindLeads(){
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		return new findLeads(driver);
		
		
		
	}

}
