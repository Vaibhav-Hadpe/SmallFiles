package _TestNG5_SoftAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_AssertEqulas_NotEquals {
	SoftAssert soft;
	
  @Test
  public void TEst1() 
  {
	  String A="Pune";
	  String B="Mumbai";
	  //String C="Pune";
	  soft.assertEquals(A, B,"Strings are not Matching TC is Failed.");
	  Reporter.log("Strings are  Matching TC is Passed.", true);
	  
	  soft.assertNotEquals(A, B,"Strings are Matching TC is Failed.");
	  Reporter.log("Strings are not Matching TC is Passed.", true);
	  soft.assertAll();
	  
  }
  @Test
  public void Test2()
  {
	  boolean D=true;
	  soft.assertTrue(D,"Value is False TC is Failed.");
	  Reporter.log("Value is True TC is Passed.", true);
	  //soft.assertAll();
  }
  
}
