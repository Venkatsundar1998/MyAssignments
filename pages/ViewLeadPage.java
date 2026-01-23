package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	public ViewLeadPage verifyLead() {
		String text = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if (text.contains("Venkatsundar")) {
			System.out.println("Lead verified");
		} else {
			System.out.println("Lead Not Verified");
		}
		return this;
	}

}
