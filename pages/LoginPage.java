package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage enterUname() {
		driver.findElement(By.id("username")).sendKeys("democsr2");
		return this;
	}

	public LoginPage enterPassword() {
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		return this;
	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
