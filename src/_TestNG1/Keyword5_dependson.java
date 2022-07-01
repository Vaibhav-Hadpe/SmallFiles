package _TestNG1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword5_dependson {
  @Test
  public void A()
  {
	  Assert.fail();
	  Reporter.log("Method A is Running", true);
  }
  @Test(dependsOnMethods = {"A"})
  public void B()
  {
	  Reporter.log("Method B is Running", true);
  }
  @Test
  public void C()
  {
	  Reporter.log("Method C is Running", true);
  }
  @Test
  public void D()
  {
	  Reporter.log("Method D is Running", true);
  }
  
}
