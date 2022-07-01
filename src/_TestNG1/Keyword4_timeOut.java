package _TestNG1;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword4_timeOut {
  @Test(timeOut = 1000)
  public void A() throws InterruptedException
  {
	  Thread.sleep(1200);
	  Reporter.log("Method A is Running ", true);
  }
  @Test
  public void B()
  {
	  Reporter.log("Method B is Running ", true);
  }
  @Test
  public void C()
  {
	  Reporter.log("Method C is Running ", true);
  }
  @Test
  public void D()
  {
	  Reporter.log("Method D is Running ", true);
  }
}
