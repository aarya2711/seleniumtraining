package TestNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {
	@Test
	public void logIn()
	{
		System.out.println("Validating Login");
		Assert.fail("Loging is not working");
		
	}
   @Test(dependsOnMethods = {"logIn"})
   public void sendingFriendRequest()
   {
	   System.out.println("Sendinding friend request");
   }
   @Test
   public void forgotPassword()
   {
	   System.out.println("Testing forgot password");
   }
   
}
