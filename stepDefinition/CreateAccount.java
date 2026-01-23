package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends BaseClass {

	@When("Click on Create Account")
	public void click_on_create_account() {
		driver.findElement(By.linkText("Create Account")).click();
	}

	@When("Enter Account name (.*)$")
	public void enter_account_name_account_name(String accountName) {
		driver.findElement(By.id("accountName")).sendKeys(accountName);
	}

	@When("Enter description (.*)$")
	public void enter_description(String desc) {
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(desc);
	}

	@When("Enter number of employees (.*)$")
	public void enter_number_of_employees(String noOfEmp) {
		driver.findElement(By.id("numberEmployees")).sendKeys(noOfEmp);
	}

	@When("Click Create Account button")
	public void click_create_account_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("verify Account Details tab open")
	public void verify_account_details_tab_open() {
		System.out.println(driver.getTitle());
	}

}
