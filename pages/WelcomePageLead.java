package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class WelcomePageLead extends BaseClass {

	public MyHomePageLead clickCrmsfa() {
		driver.findElement(By.partialLinkText("CRM")).click();
		return new MyHomePageLead();
	}

}
