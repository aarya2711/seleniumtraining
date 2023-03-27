package TestNgDemo;

import org.testng.annotations.Test;


public class ProrityDemo {
	@Test(priority=1)
	public void zebra() {
		System.out.println("Zebra");
		
	}
	@Test(priority=3)
public void apple() {
	System.out.println("apple");
} 
	@Test(priority=2)
	public void banana() {
		System.out.println("banana");
	}
}
