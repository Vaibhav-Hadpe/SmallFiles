package _TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword2_priority {
  @Test(priority = -1)
  public void A() 
  {
	  Reporter.log("Method A is running", true);
  }
  @Test(priority = 2)
  public void B()
  {
	  Reporter.log("Method B is Running", true);
  }
  @Test(priority = -6)
  public void C()
  {
	  Reporter.log("Method C is Running", true);
  }
  @Test(priority = -1)
  public void D()
  {
	  Reporter.log("Mehtod D is Running", true);
  }
  
}
