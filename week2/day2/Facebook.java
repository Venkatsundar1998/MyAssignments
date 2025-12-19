package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://en-gb.facebook.com/");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		// Enter the First name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Venkat");
		// Enter the Surnamel̥
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sundar");
		// Handle all three dropdowns in Date of birth
		WebElement sourcedd = driver.findElement(By.id("day"));
		Select sel = new Select(sourcedd);
		sel.selectByValue("15");
		WebElement sourcedd1 = driver.findElement(By.id("month"));
		Select sel1 = new Select(sourcedd1);
		sel1.selectByValue("5");
		WebElement sourcedd2 = driver.findElement(By.id("year"));
		Select sel2 = new Select(sourcedd2);
		sel2.selectByVisibleText("1998");
		// Select the radio button in Gender
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		// Enter the Mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9715945587");
		// Enter the New password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Venkat@12345");

	}

}
