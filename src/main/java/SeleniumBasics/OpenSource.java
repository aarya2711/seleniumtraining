package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      
          driver.findElement(By.name("username")).sendKeys("Admin");
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	      
	}

}
