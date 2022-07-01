package _TestNG3_GroupingFailedxml;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogInClass1 {
	
  @Test(groups = "Sanity",priority = -6)
  public void test1() 
  {
	  Reporter.log("Test 1 Sanity is Running", true);
  }
  @Test(groups = "Sanity",priority=-5)
  public void test2() 
  {
	  Reporter.log("Test 2 Sanity is Running", true);
  }
  @Test(groups = "Retesting",priority = -4)
  public void test3() 
  {
	  Reporter.log("Test 3 Retesting is Running", true);
  }
  @Test(groups = "Regression",priority = -3)
  public void test4() 
  {
	  //Assert.fail();
	  Reporter.log("Test 4 Regression is Running", true);
  }
  @Test(groups = "Regression",priority = -2)
  public void test5() 
  {
	  Reporter.log("Test 5 Regression is Running", true);
  }
}
