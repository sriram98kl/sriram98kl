package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;




public class baseClass {
	
	public  ChromeDriver driver;
	
	public String filename;
	
@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();

	    driver  = new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://leaftaps.com/opentaps/control/login");
	
		System.out.println(driver.getTitle());

		
		
	}
	@AfterMethod
	public void postCondition(){
		
		driver.close();
		
	}
	
	@DataProvider

	public String[][]  sendData() throws IOException
	{
		
	return utils.getExcel.excel(filename);

}}
