package editLead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.baseClass;

public class findLeads extends baseClass {

	public findLeads(ChromeDriver driver) {

		this.driver=driver;
	}

	public findLeads enter_First_Name()
	{

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sri");
		return this;
	}
	
	public findLeads clickon_FindLead()
	{
		driver.findElement(By.xpath("//button[@text='Find Leads']")).sendKeys("sri");	
		return this;
		
	}

	public  viewLead click_on_first_leadID() throws InterruptedException
	{
		Thread.sleep(5000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

		return new viewLead(driver);
	}


}
