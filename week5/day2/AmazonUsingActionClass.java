package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonUsingActionClass {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		WebElement rating = driver
				.findElement(By.xpath("(//span[@class='a-size-mini puis-normal-weight-text s-underline-text'])[1]"));
		System.out.println(
				" The number of customer ratings for the first displayed product is " + " " + rating.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"(//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal'])[1]"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
		WebElement subTotal = driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']"));
		if (price.equals(subTotal)) {
			System.out.println("Verified");
			driver.close();
		}
	}

}
