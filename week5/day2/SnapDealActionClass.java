package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealActionClass {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Launch (https://www.snapdeal.com/)
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Go to "Men's Fashion"
		WebElement mensFashion = driver.findElement(By.xpath("(//div[@class='sc-98d0cbe0-1 boEVJj'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(mensFashion).perform();
		// Go to "Sports Shoes"
		driver.findElement(By.xpath("//div[text()='Sports Shoes']")).click();
		Thread.sleep(2000);
		// Get the count of sports shoes
		String getCount = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[1]")).getText();
		System.out.println("Count of sports shoes" + ":" + getCount);
		// Click on "Training Shoes"
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);
		// Sort the products by "Low to High"
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		Thread.sleep(2000);
		// Displayed items are sorted correctly
		String sortVerified = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		System.out.println("Sorted in" + ":" + sortVerified);
		Thread.sleep(2000);
		// Select price range
		WebElement initialRange = driver.findElement(By.xpath("(//input[@class='input-filter'])[1]"));
		initialRange.clear();
		initialRange.sendKeys("500", Keys.ENTER);

		WebElement finalRange = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		finalRange.clear();
		finalRange.sendKeys("1000", Keys.ENTER);

		// driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line
		// btn-theme-secondary']")).click();

		WebElement element = driver.findElement(By.xpath("//div[@class='left-wrapper']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(element).perform();
		Thread.sleep(3000);
		// Filter by colour
		WebElement color = driver.findElement(By.xpath("(//label[.//a[contains(@class,'filter-name')]])[13]"));
		color.click();
		String colorText = color.getText();
		// Verify all the applied filters
		String amountFilter = driver.findElement(By.xpath("(//div[@class='navFiltersPill']/a)[1]")).getText();
		Thread.sleep(2000);
		String colorFilter = driver.findElement(By.xpath("(//div[@class='navFiltersPill']/a)[2]")).getText();
		if (amountFilter.contains("1000") && colorFilter.contains(colorFilter)) {
			System.out.println("Filters are Verified");
		}
		// Mouse hover on the first resulting "Training Shoes"
		WebElement element1 = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(element1).perform();
		// Click the "Quick View" button
		driver.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]")).click();
		// Print the cost and the discount percentage
		String finalPrice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Cost of the shoe is" + ":" + finalPrice);

		String disc = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The Discount Percentage is" + ":" + disc);
		// Close the window
		driver.close();

	}

}
