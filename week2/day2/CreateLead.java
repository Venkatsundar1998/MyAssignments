package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		// Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Enter a username and password
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the "CRM/SFA" link
		driver.findElement(By.partialLinkText("CRM")).click();
		// Click on the "Create Lead" button
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter a CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkatavarathan");
		// Enter a LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		// Click the "Create Lead" button
		driver.findElement(By.className("smallSubmit")).click();
		// Print theTitle
		System.out.println(driver.getTitle());
		// Close the browser window
		driver.close();

	}

}
