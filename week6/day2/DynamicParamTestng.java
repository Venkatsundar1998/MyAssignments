package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day1.BaseClass;

public class DynamicParamTestng extends BaseClass {
	@Test(dataProvider = "set")
	public void salesForce(String entityName, String desc) throws InterruptedException {
		// Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		// Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		Thread.sleep(2000);
		// Click on New Legal Entity
		driver.findElement(By.xpath("//div[text()='New']")).click();
		// Enter the Legal Entity name
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(entityName);
		// Enter the Company name as 'TestLeaf'
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("Testleaf");
		// Enter Description as 'Salesforces'
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(desc);
		Thread.sleep(2000);
		// Select Status as 'Active'
		WebElement scroll = driver.findElement(By.xpath("//div[@class='actionBody']"));
		Actions action = new Actions(driver);
		action.moveToElement(scroll).sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='--None--'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Active'])[1]")).click();
		// Click on Save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

	@DataProvider(name = "set")
	public String[][] sendData() {
		String[][] value = new String[2][2];

		value[0][0] = "NewEntity";
		value[0][1] = "NewSalesforces";

		value[1][0] = "oldEntity";
		value[1][1] = "OldSalesforces";

		return value;
	}

}
