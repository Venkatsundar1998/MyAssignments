package stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeActivateAccount extends BaseClass {
	@Given("Click on the first account id")
	public void click_on_the_first_account_id() {
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a)[1]")).click();
	}

	@Given("Click deactivate button")
	public void click_deactivate_button() {
		driver.findElement(By.linkText("Deactivate Account")).click();
	}

	@Given("Accept the alert message")
	public void accept_the_alert_message() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		System.out.println("The Alert Message is" + ":" + text);
	}

	@Then("verify the deactivate account")
	public void verify_the_deactivate_account() {
		System.out.println(driver.getTitle());
	}
}
