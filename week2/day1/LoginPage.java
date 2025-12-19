package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {

		// Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.facebook.com/");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Print the Title
		System.out.println(driver.getTitle());
		// Close Browser
		driver.close();

	}

}
