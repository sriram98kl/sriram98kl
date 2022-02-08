package editLead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.baseClass;

public class myHome extends baseClass {
	
public myHome(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	public myLeads clickonLeads() {
		
		driver.findElement(By.linkText("Leads")).click();
		
		return new myLeads(driver);
		
		
	}

}
