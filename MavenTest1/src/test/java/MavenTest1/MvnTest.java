package MavenTest1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class MvnTest {
int i =10, j=2,k=5;
	@Test
  
  public void mvnTest() {
	  	  Assert.assertTrue(i==j*k, "Pass");
  }
  @BeforeMethod
  public void beforeMethod() {
	  	Assert.assertFalse(i==j, "AssertFalse Executed");
  }

  @AfterMethod
  public void afterMethod() {
	  Assert.assertFalse(i==j, "AssertFalse Executed in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  Assert.assertFalse(i==j, "in before class");
  }

  @AfterClass
  public void afterClass() {
	  Assert.assertFalse(i==j*k+1, "AFter class");
  }

}
