package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Add an implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		// Switch to the frame
		driver.switchTo().frame("iframeResult");
		// Click the "Try It" button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		// Click OK/Cancel in the alert
		driver.switchTo().alert().accept();
		// Confirm the action is performed correctly by verifying the text displayed
		WebElement text = driver.findElement(By.id("demo"));
		System.out.println(text.getText());
	}

}
