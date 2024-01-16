package assertions;


import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test
	public void Assert() {
		String exp="Google";
		String act="Google";
		assertEquals(act,exp,"The expected result is equal to the actual result");
	}
	@Test
	public void add() {
		
		 int exp = 10;
	        int act = 5 + 5;

	        assertTrue(act == exp, "The expected result is equal to the actual result");
		
	}
 @Test
 public void testExample() {
	 String result=someMethodThatshouldReturnNull();
	 assertNull(result,"Result should be null, but it is not");
	 
 }
 private String someMethodThatshouldReturnNull() {
	
	 return null;
 }


@Test
public void soft() {
	SoftAssert sa=new SoftAssert();
			
	String exp="Google";
	String act="google";
	sa.assertNotEquals(act,exp,"The expected result is equal to the actual result");
	//sa.assertEquals(act,exp,"The expected result is equal to the actual result");
	 int exp1 = 10;
     int act1 = 5 + 5;

    sa.assertTrue(act1 == exp1, "The expected result is equal to the actual result");
    sa.assertAll();
}

}