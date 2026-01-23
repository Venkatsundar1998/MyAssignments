package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyHomePageLead extends BaseClass {

	public MyLeadPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage();
	}

}
