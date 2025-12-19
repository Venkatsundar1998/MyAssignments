package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

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
		driver.findElement(By.id("accountName")).sendKeys("Venkat");
		// Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
        //Select "ComputerSoftware" as industry
		WebElement sourcedd = driver.findElement(By.name("industryEnumId"));
		Select sel = new Select(sourcedd);
		sel.selectByVisibleText("Computer Software");
		// Select "S-Corporation" as ownership
		WebElement sourcedd1 = driver.findElement(By.name("ownershipEnumId"));
		Select sel1 = new Select(sourcedd1);
		sel1.selectByVisibleText("S-Corporation");
		// Select "Employee" as the source
		WebElement sourcedd2 = driver.findElement(By.name("dataSourceId"));
		Select sel2 = new Select(sourcedd2);
		sel2.selectByValue("LEAD_EMPLOYEE");
		// Select "eCommerce Site Internal Campaign" as the marketing campaign
		WebElement sourcedd3 = driver.findElement(By.name("marketingCampaignId"));
		Select sel3 = new Select(sourcedd3);
		sel3.selectByIndex(6);
		// Select "Texas" as the state/province
		WebElement sourcedd4 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel4 = new Select(sourcedd4);
		sel4.selectByValue("TX");
		// Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		// Close the browser window
		driver.close();

	}

}
