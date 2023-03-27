package SeleniumBasics;



import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hover();
		//keyboardevents();
		//click();
		drag();
		
		
	}
	public static void hover() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement kidsmenu = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a"));
        Actions act =  new Actions(driver);
	 act.moveToElement(kidsmenu).perform();
	
		
	}
	public static void keyboardevents() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username= driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		act.moveToElement(username).keyDown(Keys.SHIFT).sendKeys("Aarti").keyUp(Keys.SHIFT).perform();
	}
	
	public static void click() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		Actions click = new Actions(driver);
		click.contextClick(username).perform();
		
	}
	public static void drag() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions drag = new Actions(driver);
		//Actions drop = new Actions(driver);
		
		drag.dragAndDrop(source, target).perform();
	}
	
		
	}	
		
		
	


