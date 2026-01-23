package week5.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Enter the username and password
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa", Keys.ENTER);
		// Click on the CRM/SFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		String parentWindow = driver.getWindowHandle();
		// Click on the Contacts button
		driver.findElement(By.linkText("Contacts")).click();
		String parentWindow1 = driver.getWindowHandle();
		// Click on Merge Contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		String parentWindow2 = driver.getWindowHandle();
		// Click on the widget of the "From Contact"
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']/tbody/tr/td/a)[1]")).click();
		// get the current window ID
		// windows handling
		Set<String> allWindows = driver.getWindowHandles();
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		driver.manage().window().maximize();
		// Click on the first resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(parentWindow);
		// Click on the widget of the "To Contact"
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']/tbody/tr/td/a)[2]")).click();
		Set<String> allWindows1 = driver.getWindowHandles();
		for (String windowHandle : allWindows1) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		driver.manage().window().maximize();
		// Click on the second resulting contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a)[6]")).click();
		driver.switchTo().window(parentWindow);
		// Click on the Merge button
		driver.findElement(By.linkText("Merge")).click();
		// Accept the alert
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// Verify the title of the page
		String title = driver.getTitle();
		System.out.println(title);
	}

}
