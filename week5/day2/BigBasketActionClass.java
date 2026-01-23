package week5.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasketActionClass {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Navigate to bigbasket.com
		driver.get(" http://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Click on "Shop by Category".
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:Ramkj6:']")).click();
		// Mouse over "Foodgrains, Oil & Masala"
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		// Mouse over "Rice & Rice Products"
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).perform();
		// Click on "Boiled & Steam Rice"
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		// Filter the results by selecting the brand "bb Royal"
		Thread.sleep(4000);
		WebElement scroll = driver.findElement(By.xpath("//section[@class='sc-ciQpPG lHhxs']"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(scroll).click().sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='bb Royal']")).click();
		// Click on "Tamil Ponni Boiled Rice"
		Thread.sleep(1000);
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
		Thread.sleep(1000);
		//// Switch to new tab
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		Thread.sleep(1000);
		// Select the 5 Kg bag
		String check = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 sc-eBHhsj jnBJRV ioVXCw'])[1]"))
				.getText();
		if (check.contains("1 kg")) {
			WebElement scroll1 = driver.findElement(By.xpath("//div[@class='container min-h-96']"));
			Actions action3 = new Actions(driver);
			action3.moveToElement(scroll1).click().sendKeys(Keys.PAGE_DOWN).perform();
			driver.findElement(By.xpath("//span[text()='5 kg']")).click();
		}
		// note the price of the rice
		String price = driver.findElement(By.xpath(
				"//tr[@class='flex items-center justify-start mb-1 text-base font-bold text-darkOnyx-800']/td[1]"))
				.getText();
		System.out.println(price);
		// Click "Add" to add the bag to your cart
		driver.findElement(By.xpath("//button[@class='Button-sc-1dr2sn8-0 sc-uVWWZ dEdziT kHnVsm']")).click();
		// Verify the success message that confirms the item was added to your cart
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement toast = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='mx-4 flex-1']")));
		String toastText = toast.getText();
		System.out.println("Notification text: " + toastText);
		// Close the current window
		driver.close();
		// Close the main window
		driver.switchTo().window(parentWindow).close();
	}

}
