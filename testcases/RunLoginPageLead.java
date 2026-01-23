package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPageLead;

public class RunLoginPageLead extends BaseClass {
	@Test
	public void runLoginPageLead() {
		LoginPageLead lpl = new LoginPageLead();
		lpl.enterUname().enterPassword().clickLogin().clickCrmsfa();
	}
}
