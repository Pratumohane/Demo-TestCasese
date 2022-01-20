package demotesting;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class DiffBeforeTestAndBMethod {
  @Test
  public void login1() {
	  System.out.println();
	  System.out.println("amazon login with valid credentails");
  }
  @Test
  public void login2() {
	 // System.out.println("DiffBeforeTestAndBMethod "+);
	  System.out.println("amazon login with valid credentails");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println(  "@AfterMethod");
  }

  
}
