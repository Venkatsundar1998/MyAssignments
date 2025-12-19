package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		// Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		// Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		// Enter the username
		driver.findElement(By.id("username")).sendKeys("democsr2");
		// Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// Click the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click the "crm/sfa" link
		driver.findElement(By.partialLinkText("CRM")).click();
		// Click the "Leads" link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// Click "My leads"
		driver.findElement(By.xpath("//a[text()='My Leads']")).click();
		Thread.sleep(2000);
		// Capture the lead ID of the first resulting lead
		WebElement a = driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[2]/a"));
		String text = a.getText();
		// Click the first resulting lead
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[2]/a")).click();
		// Click the "Delete" button
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		// Click the Find leads again
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		// Enter the captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		// Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// Close the browser
		driver.close();

	}

}
