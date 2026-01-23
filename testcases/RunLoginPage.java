package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunLoginPage extends BaseClass {

	@Test
	public void runLoginPage() {
		LoginPage le = new LoginPage();
		le.enterUname().enterPassword().clickLogin().clickCrmsfa();
	}

}
