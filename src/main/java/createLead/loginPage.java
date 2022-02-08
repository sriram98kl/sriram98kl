package createLead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.baseClass;

public class loginPage extends baseClass {
	
	public loginPage(ChromeDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="username" )WebElement  username;
	@FindBy(how=How.ID,using="password" )WebElement  password1;
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit" )WebElement login;
	
	public loginPage enterUserName(String Username){
		 username.sendKeys(Username);
		//driver.findElement(By.id("username")).sendKeys(Username); 
		return this;
		
	}
	public loginPage enterPassword(String password) {
		
		 password1.sendKeys(password);
		
		//driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public home clicklogin() {
		
		login.click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		return new home(driver);
	}

}
