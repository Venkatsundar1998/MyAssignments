package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.myntra.com/");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Add an implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		// In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bag", Keys.ENTER);
		// under "Gender" click on "Men"
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]")).click();
		// Under "Category" click "Laptop bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[3]")).click();
		// count of the items found
		Thread.sleep(2000);
		WebElement count = driver.findElement(By.xpath("//span[@class='title-count']"));
		String totalItem = count.getText();
		System.out.println(totalItem);
		// Get the list of brand of the products displayed in the page
		Thread.sleep(2000);
		List<WebElement> brandList = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		System.out.println("Brands displayed on the page:");
		for (WebElement brand : brandList) {
			System.out.println(brand.getText());
		}
		List<WebElement> nameList = driver.findElements(By.xpath("//h4[@class='product-product']"));
		System.out.println("Name of the bags displayed on the page:");
		for (WebElement name : nameList) {
			System.out.println(name.getText());
		}

	}

}
