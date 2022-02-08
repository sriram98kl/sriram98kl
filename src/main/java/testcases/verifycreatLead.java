package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.baseClass;
import createLead.loginPage;

public class verifycreatLead extends baseClass{
	@BeforeTest
	public void setData()
	{
	 filename = "creatleadpom";
	}
	
	@Test(dataProvider="sendData")
	
	public void runLogin(String username , String password , String firstname, String lastname , String cmpnyname){
		loginPage lp=new loginPage(driver);
		
		lp.enterUserName(username).
		enterPassword(password ).
		clicklogin().
		clickcrmsfa().
		clickonLeads().
		clickonCreateLead().
		enterFirstname(firstname).
		enterLastname(lastname).
		entercmpnyname(cmpnyname).
		clickonCreatelead().
		verifyViewLead();
		
		
	}

}
