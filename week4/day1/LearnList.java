package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones", Keys.ENTER);

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		List<Integer> text = new ArrayList<Integer>();

		for (WebElement each : price) {
			String amount = each.getText().replace(",", "");
			if (!amount.isEmpty()) {
				text.add(Integer.parseInt(amount));
			}

		}
		Collections.sort(text);
		System.out.println(text);
	}

}
