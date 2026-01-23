package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateAccountPage extends BaseClass {

	public CreateAccountPage enterAccountName() {
		driver.findElement(By.id("accountName")).sendKeys("TCL06");
		return this;
	}

	public CreateAccountPage description() {
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Automation Tester");
		return this;
	}

	public CreateAccountPage noOfEmp() {
		driver.findElement(By.id("numberEmployees")).sendKeys("25");
		return this;
	}

	public ViewAccountPage clickSave() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage();
	}
}
