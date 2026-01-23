package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateAccount extends BaseClass {

	@Test
	public void runCreateAccount() {
		LoginPage le = new LoginPage();
		le.enterUname().enterPassword().clickLogin().clickCrmsfa().clickAccounts().clickCreateAccount()
				.enterAccountName().description().noOfEmp().clickSave().verifyAccount();
	}
}
