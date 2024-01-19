package myTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; // Import WebElement class
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonSearch {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("--disablegpu");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys("laptop", Keys.RETURN);

		System.out.println(driver.getTitle());
		driver.quit();
	}

}
