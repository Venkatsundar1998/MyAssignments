package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ViewAccountPage extends BaseClass {

	public ViewAccountPage verifyAccount() {
		String text = driver.findElement(By.xpath("(//table[@class='fourColumnForm']/tbody/tr/td/span)[2]")).getText();
		
		if (text.contains("TCL06")) {
			System.out.println("Account Verified");
		} else {
			System.out.println("Account Not Verified");
		}
		return this;
	}

}
