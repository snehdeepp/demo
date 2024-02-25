package snehaljavapackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("f method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test method");
  }

}
