package week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Load the url
		driver.get("http://finance.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Scroll down the page
		WebElement scroll = driver
				.findElement(By.xpath("//div[@class='sdaContainer tw-flex tw-justify-center hideOnPrint']"));
		Actions action = new Actions(driver);
		action.moveToElement(scroll).click().sendKeys(Keys.PAGE_DOWN).perform();
		// Click More option
		WebElement element = driver.findElement(By.xpath("//span[@class='_yb_98mz12']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(element).perform();
		Thread.sleep(3000);
		// Click on “Crypto” tab
		driver.findElement(By.partialLinkText("Cryp")).click();
		// Scroll down the page
		WebElement scroll1 = driver
				.findElement(By.xpath("//div[@class='sdaContainer tw-flex tw-justify-center hideOnPrint']"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(scroll1).click().sendKeys(Keys.PAGE_DOWN).perform();
		// Use loop to iterate the cryptocurrency names
		// Print the cryptocurrency names
		List<WebElement> cryptoName = driver
				.findElements(By.xpath("//td[@class='leftAlignHeader companyName yf-1uayyp1']/div"));
		for (WebElement string : cryptoName) {
			System.out.println(string.getText());
		}

	}

}
