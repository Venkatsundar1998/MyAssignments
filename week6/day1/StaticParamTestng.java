package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StaticParamTestng extends BaseClass {

	@Parameters({ "legalename", "companyname", "description" })
	@Test
	public void salesForce(String entityName, String cName, String desc) throws InterruptedException {
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
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys(cName);
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

}
