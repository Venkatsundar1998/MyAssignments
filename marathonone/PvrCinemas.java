package marathonone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {

		// Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.pvrcinemas.com/");
		// Maximize the browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		// Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		// Select Movie
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();

		Thread.sleep(2000);
		// Select Your Date as Tomorrow
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[2]")).click();

		Thread.sleep(2000);
		// Select Your Movie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();
		Thread.sleep(2000);
		// Select Your Show Time
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();
		// Click on Book Button
		driver.findElement(By.xpath("(//span[@class='p-button-label p-c'])[5]")).click();
		// Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		// Click available seat
		driver.findElement(By.xpath("//span[@id='SL.SILVER|C:14']")).click();
		// Print the Seat info under book summary
		WebElement a = driver.findElement(By.xpath("//p[text()='C14']"));
		String text = a.getText();
		System.out.println("Seat Info :" + text);
		// Print the grand total under book summary
		WebElement a1 = driver.findElement(By.xpath("//h6[text()='218.02']"));
		String text1 = a1.getText();
		System.out.println("Grand Total :" + text1);
		// Click Proceed and Continue Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		// Close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		// Print Your Current Page title
		System.out.println(driver.getTitle());
		// Close Browser
		driver.close();

	}

}
