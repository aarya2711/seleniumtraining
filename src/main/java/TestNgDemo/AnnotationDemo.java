package TestNgDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationDemo {
	
	@AfterSuite
	public void sendReport() {
		System.out.println("Sending status report");
	}
	@BeforeSuite
	public void beforeMethod() {
		System.out.println("Open the browser");
		System.out.println("Launch the browser");
	}

	
	@Test
	public void validateTitle() {
		System.out.println("Validating Test case");
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("close the browser");
	}

}
