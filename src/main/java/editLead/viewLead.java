package editLead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.baseClass;

public class viewLead extends baseClass{
	


	public  viewLead(ChromeDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	public viewLead capture_cmpny_name() {
		
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		
		System.out.println(text);
		
		return this;
	}
	public editLead click_on_edit()
	{
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		return new  editLead(driver);


}}
