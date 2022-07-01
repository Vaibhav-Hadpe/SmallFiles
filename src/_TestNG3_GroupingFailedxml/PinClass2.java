package _TestNG3_GroupingFailedxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PinClass2 {
  @Test(groups = "Sanity",priority = -1)
  public void test6() 
  {
	  Reporter.log("Test 6 Sanity is Running", true);
  }
  @Test(groups = "Sanity",priority = 0)
  public void test7() 
  {
	  Reporter.log("Test 7 Sanity is Running", true);
  }
  @Test(groups = "Retesting",priority = 1)
  public void test8()
  {
	  Reporter.log("Test 8 Retesting is Running", true);
  }
  @Test(groups = "Regression",priority = 2)
  public void test9() 
  {
	  Reporter.log("Test 9 Regression is Running", true);
  }
  @Test(groups = "Regression",priority = 3)
  public void test10() 
  {
	  Reporter.log("Test 10 Regression is Running", true);
  }
}
