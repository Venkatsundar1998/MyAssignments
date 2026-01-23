package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPageLead;

public class RunCreateLead extends BaseClass {
	@Test
	public void runCreateLead() {
		LoginPageLead lpl = new LoginPageLead();
		lpl.enterUname().enterPassword().clickLogin().clickCrmsfa().clickLeads().clickCreateLead().enterCompanyName()
				.enterFirstName().enterLastName().clickSave().verifyLead();

	}
}
