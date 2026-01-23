package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPageLead extends BaseClass {

	public LoginPageLead enterUname() {
		driver.findElement(By.id("username")).sendKeys("democsr2");
		return this;
	}

	public LoginPageLead enterPassword() {
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		return this;
	}

	public WelcomePageLead clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePageLead();
	}

}
