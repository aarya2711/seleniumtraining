package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.cssSelector("#email")).sendKeys("testing@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("password");
            driver.findElement(By.name("login")).click();
            //driver.close();
  
            
	}

}
