package _TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords6MultipleUse {
  @Test(priority = 2)
  public void myMethod1() 
  {
	  Reporter.log("Method 1 is Running", true);
  }
  @Test(priority = -3,timeOut = 900,dependsOnMethods = {"myMethod1"})
  public void myMethod2() 
  {
	  Reporter.log("Method 2 is Running", true);
  }
  @Test(priority = -6)
  public void myMethod3() 
  {
	  Reporter.log("Method 3 is Running", true);
  }
  @Test(invocationCount = 2)
  public void myMethod4() 
  {
	  Reporter.log("Method 4 is Running", true);
  }
  @Test(enabled = false)//It will not get executed because we have made it disabled.
  public void myMethod5() 
  {
	  Reporter.log("Method 5 is Running", true);
  }
}
