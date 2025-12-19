package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Enter the Username as "DemoSalesManager" and the Password as "crmsfa"
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		// Click on the Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM")).click();
		// Click on the Leads Button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the CompanyName
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		// Enter the FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Venkatavarathan");
		// Enter the LastName
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R");
		// Enter the FirstName (Local)
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sundar");
		// Enter the Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		// Enter the Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		// Enter your email in the E-mail address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("venkatavarathanr3@gmail.com");
		// Select State/Province as NewYork
		WebElement sourcedd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel = new Select(sourcedd);
		sel.selectByVisibleText("New York");
		// Click on the Create Button
		driver.findElement(By.className("smallSubmit")).click();
		// Click on the edit button
		driver.findElement(By.linkText("Edit")).click();
		// Clear the Description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		// Fill the Important Note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note");
		// Click on the update button
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		// Get the Title of the Resulting Page
		System.out.println(driver.getTitle());
		// Close the browser window
		driver.close();

	}

}
