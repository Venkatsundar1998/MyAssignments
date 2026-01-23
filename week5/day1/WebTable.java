package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement stationFrom = driver.findElement(By.id("txtStationFrom"));
		stationFrom.clear();
		stationFrom.sendKeys("MAS", Keys.ENTER);
		WebElement stationTo = driver.findElement(By.id("txtStationTo"));
		stationTo.clear();
		stationTo.sendKeys("MDU", Keys.ENTER);
		driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();
		List<WebElement> trainName = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		for (WebElement name : trainName) {
			System.out.println(name.getText());
		}

	}

}
