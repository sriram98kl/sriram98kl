package createLead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.baseClass;

public class viewLead extends baseClass {
	
public viewLead(ChromeDriver driver) {
		
		this.driver=driver;
	}
	
	
	public viewLead verifyViewLead(){
		 driver.findElement(By.xpath("//div[text()='View Lead']")).click();
			return this;
		
	}

}
