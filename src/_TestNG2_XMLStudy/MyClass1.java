package _TestNG2_XMLStudy;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
	//I want to run odd methods i.e. 1,3,5;
	//so at class level i will disabled 2 and 4 by using keyword enabled=false.
	//But if I have 1000 methods want to execute 100 and not want to execute 900
	//that time it is not possible.So controlling suite through testng.xml is important.
  @Test
  public void test1() 
  {
	  Reporter.log("Method test 1 is Running", true);
  }
  @Test
  public void test5() 
  {
	  Reporter.log("Method test 5 is Running", true);
  }
  @Test
  public void test2() 
  {
	  Reporter.log("Method test 2 is Running", true);
  }
  @Test
  public void test3() 
  {
	  Reporter.log("Method test 3 is Running", true);
  }
  @Test
  public void test4() 
  {
	  Reporter.log("Method test 4 is Running", true);
  }
}
