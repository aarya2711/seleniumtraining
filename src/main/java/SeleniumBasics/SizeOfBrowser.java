package SeleniumBasics;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(4000);
	Dimension d = new Dimension(300, 700);
	driver.manage().window().setSize(d);

	
		
		

	}

}
