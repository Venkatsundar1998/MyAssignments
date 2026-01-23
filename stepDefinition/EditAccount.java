package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditAccount extends BaseClass {

	@Given("Click on first account id")
	public void click_on_first_account_id() {
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a)[1]")).click();
	}

	@Given("Click on edit button")
	public void click_on_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Given("Enter local name")
	public void enter_local_name() {
		driver.findElement(By.id("groupNameLocal")).sendKeys("test");
	}

	@Given("Enter annual revenue")
	public void enter_annual_revenue() {
		driver.findElement(By.id("annualRevenue")).sendKeys("250000");
	}

	@Given("Click save button")
	public void click_save_button() {
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	}

	@Then("verify the edit account")
	public void verify_the_edit_account() {
		System.out.println(driver.getTitle());
	}

}
