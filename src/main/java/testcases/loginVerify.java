package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.baseClass;
import createLead.loginPage;

public class loginVerify extends baseClass {
	
	@BeforeTest
	public void setData()
	{
	 filename = "login";
	}
	
@Test(dataProvider="sendData")
	
	public void runLogin(String username , String password ){
		loginPage lp=new loginPage(driver);
		
		lp.enterUserName(username).
		enterPassword(password).
		clicklogin();
		
		
	}


}
