package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

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
		// Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkatavarathan");
		// Enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		// Select source
		WebElement sourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(sourcedd);
		sel.selectByIndex(4);
		// Select Marketing Campaign
		WebElement sourcedd1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1 = new Select(sourcedd1);
		sel1.selectByValue("CATRQ_AUTOMOBILE");
		// Select Industry
		WebElement sourcedd2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel2 = new Select(sourcedd2);
		sel2.selectByVisibleText("Computer Software");
		// Click Create lead button
		driver.findElement(By.className("smallSubmit")).click();
		// Close the browser
		driver.close();

	}

}
