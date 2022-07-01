package _TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword3_enabledFalse {
  @Test
  public void A() 
  {
	  Reporter.log("Method A is Running", true);
  }
  @Test(enabled = false)//From multiple methods if we want to skip any method then we use enabled
  //Keyword with false boolean value.if we write true then it not get skipped.
  public void B() 
  {
	  Reporter.log("Method B is Running", true);
  }
  @Test(enabled = true)//if we want to skip method then enabled with false boolean value.
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
