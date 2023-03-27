package SeleniumBasics;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.seleniumframework.com/practiceform/");
		driver.findElement(By.id("timingAlert")).click();
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		

	}

}
