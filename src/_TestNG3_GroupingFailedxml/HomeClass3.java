package _TestNG3_GroupingFailedxml;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomeClass3 {
  @Test(groups = "Sanity",priority = 4)
  public void test11() 
  {
	  Reporter.log("Test 11 Sanity is Running", true);
  }
  @Test(groups = "Sanity",priority = 5)
  public void test12() 
  {
	  Reporter.log("Test 12 Sanity is Running", true);
  }
  @Test(groups = "Retesting",priority = 6)
  public void test13() 
  {
	  Reporter.log("Test 13 Retesting is Running", true);
  }
  @Test(groups = "Regression",priority = 7)
  public void test14() 
  {
	  Assert.fail();
	  Reporter.log("Test 14 Regression is Running", true);
  }
  @Test(groups = "Regression",priority = 8)
  public void test15() 
  {
	  Reporter.log("Test 15 Retesting is Running", true);
  }
}
