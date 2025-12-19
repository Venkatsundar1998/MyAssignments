package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumLocators {

	public static void main(String[] args) {

		// Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.facebook.com/");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Enter a username and password
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		// Click the "Login" button
		driver.findElement(By.name("login")).click();
		// Print the Title
		System.out.println(driver.getTitle());
		// Close Browser
		driver.close();

	}

}
