package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		// Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		// Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("TestLeaf");
		// Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		// Enter a Number Of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		// Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		// Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		// Print theTitle name
		System.out.println(driver.getTitle());
		// Close the browser window
		driver.close();

	}

}
