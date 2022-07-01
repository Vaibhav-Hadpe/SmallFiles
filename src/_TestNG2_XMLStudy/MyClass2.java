package _TestNG2_XMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
	//from this class I don't want 7 and 9.
  @Test
  public void test6() 
  {
	  Reporter.log("Method test 6 is Running", true);
  }
  @Test
  public void test7() 
  {
	  Reporter.log("Method test 7 is Running", true);
  }
  @Test
  public void test8() 
  {
	  Reporter.log("Method test 8 is Running", true);
  }
  @Test
  public void test9() 
  {
	  Reporter.log("Method test 9 is Running", true);
  }
  @Test
  public void test10() 
  {
	  Reporter.log("Method test 10 is Running", true);
  }
}
