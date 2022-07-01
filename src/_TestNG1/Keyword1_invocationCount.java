package _TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword1_invocationCount {
  @Test(invocationCount = 2)//Here we use invocationCount to run same test case for multiple time.
  //Default value is 1.at least one time is execute.We must need to provide the value in int. not in decimal or negative.
  //if we take negative then we don't get error but it cannot execute method A.
  public void A() 
  {
	  Reporter.log("Method A is running", true);
  }
  @Test
  public void B()
  {
	  Reporter.log("Method B is Running", true);
  }
  @Test(invocationCount = 2)
  public void C()
  {
	  Reporter.log("Method C is Running", true);
  }
  @Test
  public void D()
  {
	  Reporter.log("Mehtod D is Running", true);
  }
  
}
