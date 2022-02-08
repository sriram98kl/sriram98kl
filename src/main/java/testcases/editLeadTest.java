package testcases;

import org.testng.annotations.Test;

import base.baseClass;
import editLead.loginPage;


public class editLeadTest extends baseClass {
	
	
	@Test
	
	public void EditLead() throws InterruptedException {
		
		new loginPage(driver)
		.enterUserName().
		enterPassword().
		clicklogin().
		clickcrmsfa().
		clickonLeads().
		clickonfindLeads().
		enter_First_Name().
		clickon_FindLead().
		click_on_first_leadID().
		capture_cmpny_name().
		click_on_edit().
		edit_cmpnyname().
		click_on_update().
		capture_cmpny_name();
		
		
	}
	
	
	
	

}
