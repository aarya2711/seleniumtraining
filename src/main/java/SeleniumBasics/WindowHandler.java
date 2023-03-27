package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Parent window title==>" +driver.getTitle());
		driver.findElement(By.id("button1")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String pwindowid = it.next();
		String cwindowid =it.next();
		System.out.println("Parent window id==>" +pwindowid);
		System.out.println("Child window id==>" +cwindowid);
		
		driver.switchTo().window(cwindowid);
		System.out.println("child windoe==>" +driver.getTitle());
		
		driver.switchTo().window(pwindowid);
		System.out.println("parent window==>" +driver.getTitle());
		
		driver.quit();
		
		

	}

}
