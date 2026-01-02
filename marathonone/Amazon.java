package marathonone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		// Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.amazon.in/");
		// Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Type "Bags for boys" in the Search box and search
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys", Keys.ENTER);
		// Print the total number of results
		WebElement a = driver
				.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
		String text = a.getText();
		System.out.println("The total number of results :" + text);
		Thread.sleep(3000);
		// Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		Thread.sleep(3000);
		// Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.partialLinkText("Newest")).click();
		// Print the first resulting bag info
		WebElement a1 = driver.findElement(By.xpath(
				"(//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])[1]"));
		String text1 = a1.getText();
		System.out.println("The first resulting bag info :" + text1);
		// Print Your Current Page title
		System.out.println(driver.getTitle());
		// Close Browser
		driver.close();
	}

}
